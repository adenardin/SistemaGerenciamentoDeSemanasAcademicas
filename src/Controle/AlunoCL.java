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
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronaima
 */
public class AlunoCL {
    public  static boolean newAluno(){
        AlunoBO c = null;
        try {
            c = AlunoIO.getInstance();
        } catch (ParseException ex) {
            Logger.getLogger(AlunoCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AlunoBD.save(c);
    }
    
//    public  static  void showAluno(){
//        AlunoIO.printList(AlunoBD.getAll());
//    }
    
    public  static  ArrayList<AlunoBO> showAluno(){
        return AlunoBD.getAll();
    }
    
    
    
    public static AlunoBO findAlunoRa(int RA){
        AlunoBO c= AlunoBD.findAlunoRa(RA);
            return c;
//        if(c != null){
//            AlunoIO.printAluno(c);
//            }
//            else{//Depóis trocar por exceção
//            System.out.println("não encontrado");
//            }
    }
    
    public static AlunoBO findAlunoNome(String nom){
        AlunoBO c= AlunoBD.findAlunoNome(nom);
            return c;
//        if(c != null){
//            ClienteIO.printCliente(c);
//            }
//            else{//Depóis trocar por exceção
//            System.out.println("não encontrado");
//            }
    }    
    
   
    
    public static boolean deleteAluno(int RA){
        return AlunoBD.delete(RA);
    }
    
    public static boolean updateAluno(AlunoBO c){
        //ClienteBO c= ClienteIO.getInstance();
        return AlunoBD.update(c);
    }

    public static AlunoBO chooseAluno(){
        int RABusca;
        String confirmacao;
        AlunoBO Aluno;
        do{
            System.out.println("RA: ");
            RABusca = Teclado.lerInt();
            Aluno = AlunoBD.findAlunoRa(RABusca);
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
        
    public static boolean newAluno(AlunoBO Aluno){
        return AlunoBD.save(Aluno);
    }
}
