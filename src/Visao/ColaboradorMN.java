/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ColaboradorCL;
import Negocio.ColaboradorBO;

/**
 *
 * @author ronaima
 */
public class ColaboradorMN {
    public static int ShowMenu(){
        int opcao;
        System.out.println("Modulo de Colaborador");
        do{
            System.out.println("1- Para cadastrar Colaborador");
            System.out.println("2- Para consultar Colaborador por Codigo");
            System.out.println("3- Para listar todos os Colaborador");
            System.out.println("4- Para alterar Colaborador");
            System.out.println("5- Para excluir Colaborador");
            System.out.println("0- Para voltar");
            System.out.println("Informe uma acao: ");
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
            int codColaborador;

            switch(opcao){

	            case 1:
		            if(ColaboradorCL.newColaborador()){
		                System.out.println("Colaborador salvo com sucesso");
		            }
		            else{
		                System.out.println("nao foi possivel salvar o Colaborador");
		            }
		            System.out.println("pressione<enter>Para continuar");
		            saida = Teclado.lerString();
		            break;
	                        
	            case 2:
	                System.out.println("Codigo do Colaborador para a busca ");
	                codColaborador = Teclado.lerInt();
	                ColaboradorCL.findColaboradorCod(codColaborador);
	                System.out.println("Pressione <enter> para continuar ");
	                saida = Teclado.lerString();
	                break;
	            
	            case 3:
		            ColaboradorCL.showColaborador();
		            System.out.println("pressione<enter> Para continuar");
		            saida = Teclado.lerString();
		            break;
	                       
	            case 4:
	            	System.out.println("Codigo do Colaborador para alterar ");
	                codColaborador = Teclado.lerInt();
	                ColaboradorBO cbo = ColaboradorCL.findColaboradorCod(codColaborador);
	                if (ColaboradorCL.updateColaborador(cbo)){
	                    System.out.println("Colaborador Alterado");
	                }
	                else{
	                    System.out.println("Problemas ao Alterar");
	                }
	                System.out.println("Pressione <Enter> para continuar");
	                saida = Teclado.lerString();
	                break;
	                
	            case 5:
	                System.out.println("RA do Colaborador para bsuca");
	                int RA = Teclado.lerInt();
	                if(ColaboradorCL.deleteColaborador(RA)){
	                    System.out.println("Colaborador excluido com sucesso");
	                }
	                else{
	                    System.out.println("Problemas ao excluir Colaborador");
	                }
	                System.out.println("Pressione <enter> para continuar");
	                saida = Teclado.lerString();
	                break;
            }           
        }
        while(opcao != 0);
    }
}
