/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Negocio.ColaboradorBO;
import Persistencia.ColaboradorBD;
import Visao.ColaboradorIO;
import Visao.Teclado;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author ronaima
 */
public class ColaboradorCL {
    public static boolean newColaborador(){
        ColaboradorBO c = null;
		try {
			c = ColaboradorIO.getInstance();
		} catch (ParseException e) {
			e.printStackTrace();
		}
        return ColaboradorBD.save(c);
    }
    
    public  static  ArrayList<ColaboradorBO> showColaborador(){
        return ColaboradorBD.getAll();
    }
    
    
    
    public static ColaboradorBO findColaboradorCod(int cod){
        ColaboradorBO c = ColaboradorBD.findColaboradorCod(cod);
        return c;
    }
    
    /**
     *
     * @param nom
     * @return
     */
    public static ColaboradorBO findColaboradorNome(String nom){
        ColaboradorBO c= ColaboradorBD.findColaboradorNome(nom);
        return c;
    }    
    
    public static boolean deleteColaborador(int cod){
        return ColaboradorBD.delete(cod);
    }
    
    public static boolean updateColaborador(ColaboradorBO c){
        return ColaboradorBD.update(c);
    }

    public static ColaboradorBO chooseColaborador(){
        int codBusca;
        String confirmacao;
        ColaboradorBO Colaborador;
        do{
            System.out.println("RA: ");
            codBusca = Teclado.lerInt();
            Colaborador = ColaboradorBD.findColaboradorCod(codBusca);
            if(Colaborador != null){
                System.out.println(Colaborador.getNomeColaborador());
                System.out.println("confirma? s/n ");
                confirmacao = Teclado.lerString();
            }
            else{
                System.out.println("Não encontrado! ");
                confirmacao = "N";
            }
        }
        while(!(confirmacao.equalsIgnoreCase("S")));
        return Colaborador;
    }    
        
    public static boolean newColaborador(ColaboradorBO Colaborador){
        return ColaboradorBD.save(Colaborador);
    }
}
