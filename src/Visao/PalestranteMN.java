/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.PalestranteCL;
import Negocio.PalestranteBO;

/**
 *
 * @author ronaima
 */
public class PalestranteMN {
    public static int ShowMenu(){
        int opcao;
        System.out.println("Modulo de Palestrante");
        do{
            System.out.println("1- Para cadastrar Palestrante");
            System.out.println("2- Para consultar Palestrante por Codigo");
            System.out.println("3- Para listar todos os Palestrantes");
            System.out.println("4- Para alterar Palestrante");
            System.out.println("5- Para excluir Palestrante");
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
            int codPalestrante;
            
            switch(opcao) {

	            case 1:
		            if(PalestranteCL.newPalestrante()){
		                System.out.println("Palestrante salvo com sucesso");
		            }
		            else{
		                System.out.println("nao foi possivel salvar o Palestrante");
		            }
		            System.out.println("pressione<enter>Para continuar");
		            saida = Teclado.lerString();
		            break;
	
	            case 2:
	                System.out.println("Codigo do Palestrante para a busca ");
	                codPalestrante = Teclado.lerInt();
	                PalestranteCL.findPalestranteCod(codPalestrante);
	                System.out.println("Pressione <enter> para continuar ");
	                saida = Teclado.lerString();
	                break;
		            
	            case 3:
		            PalestranteCL.showPalestrante();
		            System.out.println("pressione <enter> Para continuar");
		            saida = Teclado.lerString();
		            break;    
	                       
	            case 4:
	            	System.out.println("Codigo do Palestrante para alterar ");
	                codPalestrante = Teclado.lerInt();
	                PalestranteBO palestrante = PalestranteCL.findPalestranteCod(codPalestrante);
	                if (PalestranteCL.updatePalestrante(palestrante)){
	                    System.out.println("Palestrante Alterado");
	                }
	                else{
	                    System.out.println("Problemas ao Alterar");
	                }
	                System.out.println("Pressione <Enter> para continuar");
	                saida = Teclado.lerString();
	                break;
	                
	            case 5:
	                System.out.println("RA do Palestrante para bsuca");
	                int RA = Teclado.lerInt();
	                if(PalestranteCL.deletePalestrante(RA)){
	                    System.out.println("Palestrante excluido com sucesso");
	                }
	                else{
	                    System.out.println("Problemas ao excluir Palestrante");
	                }
	                System.out.println("Pressione <enter> para continuar");
	                saida = Teclado.lerString();
	                break;
            }           
        }
        while(opcao != 0);
    }
}
