/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Negocio.EventoBO;
import Persistencia.EventoBD;
import Persistencia.PalestraEventoBD;
import Visao.EventoIO;
import Visao.Teclado;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronaima
 */
public class EventoCL {
    public  static boolean newEvento(){
        EventoBO c = null;
        try {
            c = EventoIO.getInstance();
        } catch (ParseException ex) {
            Logger.getLogger(EventoCL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return EventoBD.save(c);
    }
    
//    public  static  void showEvento(){
//        EventoIO.printList(EventoBD.getAll());
//    }
    
    public  static  ArrayList<EventoBO> showEvento(){
        return EventoBD.getAll();
    }
    
    
    
    public static EventoBO findEventoCod(int codigoEvento){
        EventoBO c= EventoBD.findEventoCod(codigoEvento);
            return c;
//        if(c != null){
//            EventoIO.printEvento(c);
//            }
//            else{//Depóis trocar por exceção
//            System.out.println("não encontrado");
//            }
    }
    
    public static EventoBO findEventoNome(String nom){
        EventoBO c= EventoBD.findEventoNome(nom);
            return c;
//        if(c != null){
//            ClienteIO.printCliente(c);
//            }
//            else{//Depóis trocar por exceção
//            System.out.println("não encontrado");
//            }
    }    
    
   
    
    public static boolean deleteEvento(int CodigoEvento){
        return EventoBD.delete(CodigoEvento);
    }
    
    public static boolean updateEvento(EventoBO c){
        //ClienteBO c= ClienteIO.getInstance();
        return EventoBD.update(c);
    }

    public static EventoBO chooseEvento(){
        int CodigoBusca;
        String confirmacao;
        EventoBO Evento;
        do{
            System.out.println("Codigo: ");
            CodigoBusca = Teclado.lerInt();
            Evento = EventoBD.findEventoCod(CodigoBusca);
            if(Evento != null){
                System.out.println(Evento.getNomeEvento());
                System.out.println("confirma? s/n ");
                confirmacao = Teclado.lerString();
            }
            else{
                System.out.println("Não encontrado! ");
                confirmacao = "N";
            }
        }
        while(!(confirmacao.equalsIgnoreCase("S")));
        return Evento;
    }    
        
    public static boolean newEvento(EventoBO Evento){
        return EventoBD.save(Evento);
    }
    
//    public static ArrayList<PalestraEventoBO>getItens(int codigoVenda){
//        return PalestraEventoBD.findPalestraVendidos(codigoVenda);
//    }
}
