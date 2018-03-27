/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.EventoCL;

/**
 *
 * @author ronaima
 */
public class EventoMN {
    public static int ShowMenu(){
        int opcao;
        int codigoEvento;
        System.out.println("Modulo de Evento");
        do{
            System.out.println("1- Para cadastrar Evento");//ok
            System.out.println("2- Para consultar Evento por codigo de Evento");//ok
            System.out.println("3- Para listar todos os Evento");//ok
            System.out.println("4- Para alterar Evento");//ok
            System.out.println("5- Para excluir Evento");//ok
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
            int codigoEvento;
            double renda;
            switch(opcao){

            case 1:
            if(EventoCL.newEvento()){
                System.out.println("Evento salvo com sucesso");
            }
            else{
                System.out.println("não foi possivel salvar o Evento");
            }
            System.out.println("pressione<enter>Para continuar");
            saida = Teclado.lerString();
            break;

            case 3:
            EventoCL.showEvento();
            System.out.println("pressione<enter> Para continuar");
            saida = Teclado.lerString();
            break;    
                        
                        
            case 2:
                System.out.println("Codigo do Evento para a busca ");
                codigoEvento = Teclado.lerInt();
                EventoCL.findEventoCod(codigoEvento);
                System.out.println("Pressione <enter> para continuar ");
                saida = Teclado.lerString();
                break;
                
                       
//            case 4:
//                if (EventoCL.updateEvento()){
//                    System.out.println("Evento Alterado");
//                }
//                else{
//                    System.out.println("Problemas ao Alterar");
//                }
//                System.out.println("Pressione <Enter> para continuar");
//                saida = Teclado.lerString();
//                break;
                
            case 5:
                System.out.println("Codigo do Evento para bsuca");
                codigoEvento = Teclado.lerInt();
                if(EventoCL.deleteEvento(codigoEvento)){
                    System.out.println("Evento excluido com sucesso");
                }
                else{
                    System.out.println("Problemas ao excluir Evento");
                }
                System.out.println("Pressione <enter> para continuar");
                saida = Teclado.lerString();
                break;
                      
            }           
        }
        while(opcao != 0);
    }
}
