/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Negocio.PalestraBO;
import Persistencia.PalestraBD;
import Visao.PalestraIO;
import Visao.Teclado;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronaima
 */
public class PalestraCL {
    public  static boolean newPalestra(){
        PalestraBO c = null;
        try {
            c = PalestraIO.getInstance();
        } catch (ParseException ex) {
            Logger.getLogger(PalestraCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PalestraBD.save(c);
    }
    
//    public  static  void showPalestra(){
//        PalestraIO.printList(PalestraBD.getAll());
//    }
    
    public  static  ArrayList<PalestraBO> showPalestra(){
        return PalestraBD.getAll();
    }
    
    
    
    public static PalestraBO findPalestraCod(int Cod){
        PalestraBO c= PalestraBD.findPalestraCod(Cod);
            return c;
//        if(c != null){
//            PalestraIO.printPalestra(c);
//            }
//            else{//Depóis trocar por exceção
//            System.out.println("não encontrado");
//            }
    }
    
    public static PalestraBO findPalestraTitulo(String nom){
        PalestraBO c= PalestraBD.findPalestraTitulo(nom);
            return c;
//        if(c != null){
//            ClienteIO.printCliente(c);
//            }
//            else{//Depóis trocar por exceção
//            System.out.println("não encontrado");
//            }
    }    
    
   
    
    public static boolean deletePalestra(int Cod){
        return PalestraBD.delete(Cod);
    }
    
    public static boolean updatePalestra(PalestraBO c){
        //ClienteBO c= ClienteIO.getInstance();
        return PalestraBD.update(c);
    }

    public static PalestraBO choosePalestra(){
        int CodBusca;
        String confirmacao;
        PalestraBO Palestra;
        do{
            System.out.println("Cod: ");
            CodBusca = Teclado.lerInt();
            Palestra = PalestraBD.findPalestraCod(CodBusca);
            if(Palestra != null){
               System.out.println(Palestra.getTituloPalestra());
                System.out.println("confirma? s/n ");
                confirmacao = Teclado.lerString();
            }
            else{
                System.out.println("Não encontrado! ");
                confirmacao = "N";
            }
        }
        while(!(confirmacao.equalsIgnoreCase("S")));
        return Palestra;
    }    
        
    public static boolean newPalestra(PalestraBO Palestra){
        return PalestraBD.save(Palestra);
    }
}
