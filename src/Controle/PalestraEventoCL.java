/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Negocio.PalestraEventoBO;
import Persistencia.EventoBD;
import Persistencia.PalestraEventoBD;
import Visao.PalestraEventoIO;
import Visao.Teclado;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronaima
 */
public class PalestraEventoCL {
    public  static boolean newPalestraEvento(){
        PalestraEventoBO c = null;
        try {
            c = PalestraEventoIO.getInstance();
        } catch (ParseException ex) {
            Logger.getLogger(PalestraEventoCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PalestraEventoBD.save(c);
    }
    public static boolean newPalestraEvento(PalestraEventoBO p){
        PalestraEventoBD.save(p);
        return true;
    }
    
//    public  static  void showPalestraEvento(){
//        PalestraEventoIO.printList(PalestraEventoBD.getAll());
//    }
    
    public  static  ArrayList<PalestraEventoBO> showPalestraEvento(){
        return PalestraEventoBD.getAll();
    }
    
    
    
    public static PalestraEventoBO findPalestraEventoCod(int codigoEvento){
        PalestraEventoBO c= PalestraEventoBD.findPalestraEventoCod(codigoEvento);
            return c;
//        if(c != null){
//            EventoIO.printEvento(c);
//            }
//            else{//Depóis trocar por exceção
//            System.out.println("não encontrado");
//            }
    }
    
    public static PalestraEventoBO findPalestraEventoNome(String nom){
        PalestraEventoBO c= PalestraEventoBD.findPalestraEventoNome(nom);
            return c;
//        if(c != null){
//            ClienteIO.printCliente(c);
//            }
//            else{//Depóis trocar por exceção
//            System.out.println("não encontrado");
//            }
    }    
    
   
    
    public static boolean deletePalestraEvento(int CodigoEvento){
        return PalestraEventoBD.delete(CodigoEvento);
    }
    
    public static boolean updatePalestraEvento(PalestraEventoBO c){
        //ClienteBO c= ClienteIO.getInstance();
        return PalestraEventoBD.update(c);
    }

    public static PalestraEventoBO chooseEvento(){
        int CodigoBusca;
        String confirmacao;
        PalestraEventoBO PalestraEvento;
        do{
            System.out.println("Codigo: ");
            CodigoBusca = Teclado.lerInt();
            PalestraEvento = PalestraEventoBD.findPalestraEventoCod(CodigoBusca);
            if(PalestraEvento != null){
                System.out.println(PalestraEvento.getNomeEvento());
                System.out.println("confirma? s/n ");
                confirmacao = Teclado.lerString();
            }
            else{
                System.out.println("Não encontrado! ");
                confirmacao = "N";
            }
        }
        while(!(confirmacao.equalsIgnoreCase("S")));
        return PalestraEvento;
    }    
        
    public static boolean newEvento(PalestraEventoBO PalestraEvento){
        return PalestraEventoBD.save(PalestraEvento);
    }
    
//    public static ArrayList<PalestraEventoBO>getItens(int codigoVenda){
//        return PalestraEventoBD.findPalestraVendidos(codigoVenda);
//    }
}
