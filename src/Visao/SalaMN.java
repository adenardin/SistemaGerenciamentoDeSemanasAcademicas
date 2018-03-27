/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.SalaCL;

/**
 *
 * @author ronaima
 */
public class SalaMN {
    public static int ShowMenu(){
        int opcao;
        int codigoSala;
        System.out.println("Modulo de Sala");
        do{
            System.out.println("1- Para cadastrar Sala");//ok
            System.out.println("2- Para consultar Sala por Codigo da Sala");//ok
            System.out.println("3- Para listar todos os Sala");//ok
            System.out.println("4- Para alterar Sala");//ok
            System.out.println("5- Para excluir Sala");//ok
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
            int codigoSala;
            double renda;
            switch(opcao){

            case 1:
            if(SalaCL.newSala()){
                System.out.println("Sala salvo com sucesso");
            }
            else{
                System.out.println("não foi possivel salvar a Sala");
            }
            System.out.println("pressione<enter>Para continuar");
            saida = Teclado.lerString();
            break;

            case 3:
            SalaCL.showSala();
            System.out.println("pressione<enter> Para continuar");
            saida = Teclado.lerString();
            break;    
                        
                        
            case 2:
                System.out.println("Codigo da Sala para a busca ");
                codigoSala = Teclado.lerInt();
                SalaCL.findSalaCod(codigoSala);
                System.out.println("Pressione <enter> para continuar ");
                saida = Teclado.lerString();
                break;
                
                       
//            case 4:
//                if (SalaCL.updateSala()){
//                    System.out.println("Sala Alterado");
//                }
//                else{
//                    System.out.println("Problemas ao Alterar");
//                }
//                System.out.println("Pressione <Enter> para continuar");
//                saida = Teclado.lerString();
//                break;
                
            case 5:
                System.out.println("codigoSala do Sala para bsuca");
                codigoSala = Teclado.lerInt();
                if(SalaCL.deleteSala(codigoSala)){
                    System.out.println("Sala excluido com sucesso");
                }
                else{
                    System.out.println("Problemas ao excluir Sala");
                }
                System.out.println("Pressione <enter> para continuar");
                saida = Teclado.lerString();
                break;
                      
            }           
        }
        while(opcao != 0);
    }
}
