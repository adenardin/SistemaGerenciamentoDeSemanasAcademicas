/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.AlunoCL;

/**
 *
 * @author ronaima
 */
public class AlunoMN {
    public static int ShowMenu(){
        int opcao;
        int RA;
        System.out.println("Modulo de Aluno");
        do{
            System.out.println("1- Para cadastrar Aluno");//ok
            System.out.println("2- Para consultar Aluno por RA");//ok
            System.out.println("3- Para listar todos os Aluno");//ok
            System.out.println("4- Para alterar Aluno");//ok
            System.out.println("5- Para excluir Aluno");//ok
            System.out.println("0- Para voltar");
            System.out.println("Informe uma ação: ");
            opcao = Teclado.lerInt();
        }
        
        while(opcao <0 || opcao > 5);
        return opcao;            
        
        }
        
    public static void execute(){
        int opcao;
        String saida;
        do{
            opcao = ShowMenu();
            int RA;
            double renda;
            switch(opcao){

            case 1:
            if(AlunoCL.newAluno()){
                System.out.println("Aluno salvo com sucesso");
            }
            else{
                System.out.println("não foi possivel salvar o Aluno");
            }
            System.out.println("pressione<enter>Para continuar");
            saida = Teclado.lerString();
            break;

            case 3:
            AlunoCL.showAluno();
            System.out.println("pressione<enter> Para continuar");
            saida = Teclado.lerString();
            break;    
                        
                        
            case 2:
                System.out.println("RA do Aluno para a busca ");
                RA = Teclado.lerInt();
                AlunoCL.findAlunoRa(RA);
                System.out.println("Pressione <enter> para continuar ");
                saida = Teclado.lerString();
                break;
                
                       
//            case 4:
//                if (AlunoCL.updateAluno()){
//                    System.out.println("Aluno Alterado");
//                }
//                else{
//                    System.out.println("Problemas ao Alterar");
//                }
//                System.out.println("Pressione <Enter> para continuar");
//                saida = Teclado.lerString();
//                break;
                
            case 5:
                System.out.println("RA do Aluno para bsuca");
                RA = Teclado.lerInt();
                if(AlunoCL.deleteAluno(RA)){
                    System.out.println("Aluno excluido com sucesso");
                }
                else{
                    System.out.println("Problemas ao excluir Aluno");
                }
                System.out.println("Pressione <enter> para continuar");
                saida = Teclado.lerString();
                break;
                      
            }           
        }
        while(opcao != 0);
    }
}
