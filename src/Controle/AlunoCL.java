/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Negocio.AlunoBO;
import Persistencia.AlunoBD;
import Visao.AlunoIO;
import Visao.Teclado;
import java.util.ArrayList;

/**
 *
 * @author faculdade.ads
 */
public class AlunoCL {
    public  static boolean newAluno(){
        AlunoBO c = AlunoIO.getInstance();
        return AlunoBD.save(c);
    }
//    public  static  void showAluno(){
//        AlunoIO.printList(AlunoBD.getAll());
//    }
    public  static  ArrayList<AlunoBO> showAluno(){
        return AlunoBD.getAll();
    }
    
    
    
    public static AlunoBO findAlunoCodigo(int RA){
        AlunoBO c= AlunoBD.findAlunoCodigo(RA);
            return a;
//        if(c != null){
//            AlunoIO.printAluno(c);
//            }
//            else{//Depóis trocar por exceção
//            System.out.println("não encontrado");
//            }
    }
    
    public static AlunoBO findAlunoNome(String nomeAluno){
        AlunoBO a = AlunoBD.findAlunoNome(nomeAluno);
            return a;
//        if(c != null){
//            AlunoIO.printAluno(c);
//            }
//            else{//Depóis trocar por exceção
//            System.out.println("não encontrado");
//            }
    }    
    
    public static void findAlunoRenda(double renda, int opcao){
        ArrayList<AlunoBO>resposta = new ArrayList();
        resposta = AlunoBD.findAlunoRenda(renda, opcao);
        if(resposta != null){
            AlunoIO.printList(resposta);
        }
        else{
            System.out.println("Não encontrado.");
        }
    }
    
    public static boolean deleteAluno(int RA){
        return AlunoBD.delete(RA);
    }
    
    public static boolean updateAluno(AlunoBO a){
        //AlunoBO c= AlunoIO.getInstance();
        return AlunoBD.update(a);
    }

    public static AlunoBO chooseAluno(){
        int RABusca;
        String confirmacao;
        AlunoBO Aluno;
        do{
            System.out.println("RA: ");
            RABusca = Teclado.lerInt();
            Aluno = AlunoBD.findAlunoCodigo(RABusca);
            if(Aluno != null){
                System.out.println(Aluno.getNomeAluno());
                System.out.println("confirma? s/n ");
                confirmacao = Teclado.lerString();
            }
            else{
                System.out.println("Não encontrado! ");
                confirmacao = "N";
            }
        }
        while(!(confirmacao.equalsIgnoreCase("S")));
        return Aluno;
    }
    
    public static int getAlunoRendaMaisAlta(){
        return AlunoBD.getAlunoRendaMaisAlta();
    }
    public static double getAlunoRendaMedia(){
        return AlunoBD.AlunoRendaMedia();    
    }   
    
    public static boolean newAluno(AlunoBO Aluno){
        return AlunoBD.save(Aluno);
    }
    
}
