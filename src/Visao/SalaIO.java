/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Negocio.SalaBO;
import java.text.ParseException;
import java.util.ArrayList;


/**
 *
 * @author ronaima
 */
public class SalaIO {
    public static SalaBO getInstance() throws ParseException{
        System.out.print("Codigo da Sala: ");
        int codigoSala = Teclado.lerInt();
        System.out.print("Nome da Sala: ");
        String nomeSala = Teclado.lerString();        
        System.out.print("Capacidade: ");
        int capacidade = Teclado.lerInt();
        System.out.print("Adaptada: ");
        String adaptada = Teclado.lerString();
        
        return new SalaBO(codigoSala,nomeSala, capacidade, adaptada);
    }
    
    public static void printSala(SalaBO c){
        System.out.println("Codigo da Sala: " + c.getCodigoSala());
        System.out.println("Nome da Sala: " + c.getNomeSala());        
        System.out.println("Capacidade: " + c.getCapacidade());
        System.out.println("Adaptada: " + c.getAdaptada());
    }
    
    public static void printList(ArrayList<SalaBO>lista){
        System.out.println("L1ista de Sala");
        for(SalaBO cadaSala:lista){
            printSala(cadaSala);
            System.out.println("---------");
        }
    }
}
