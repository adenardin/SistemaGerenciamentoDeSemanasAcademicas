/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Negocio.PalestraBO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author ronaima
 */
public class PalestraIO {
    public static PalestraBO getInstance() throws ParseException{
        
        System.out.print("Titulo Palestra: ");
        String tituloPalestra = Teclado.lerString();
        System.out.print("Codigo: ");
        int codPalestra = Teclado.lerInt();
        System.out.print("Data Palestra: ");
        String txtDataPalestra = Teclado.lerString();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            Date dataPalestra = sdf.parse(txtDataPalestra);
        System.out.print("Hora inicio palestra: ");
        String txthoraInicioPalestra = Teclado.lerString();
            sdf.setLenient(false);
            Date horaInicioPalestra = sdf.parse(txthoraInicioPalestra);
        System.out.print("Duracao da Palestra: ");
        String txtDuracaoPalestra = Teclado.lerString();
            sdf.setLenient(false);
            Date duracaoPalestra = sdf.parse(txtDuracaoPalestra);        
        System.out.print("DescricaoPalestra: ");
        String descricaoPalestra = Teclado.lerString();   
        System.out.print("Conteudos da Palestra");
        String conteudosPalestra = Teclado.lerString(); 
      
        return new PalestraBO(codPalestra, tituloPalestra,dataPalestra,  horaInicioPalestra, duracaoPalestra, descricaoPalestra, conteudosPalestra);
    }
    
    public static void printPalestra(PalestraBO c){
        System.out.println("Titulo Palestra: " + c.getTituloPalestra());
        System.out.println("Codigo Paletra: " + c.getCodPalestra());
        System.out.println("Data Palestra: " + c.getDataPalestra());
        System.out.println("Hora Inicio Palestra: " + c.getHoraInicioPalestra());
        System.out.println("Duração Palestra: " + c.getDuracaoPalestra());
        System.out.println("Descricao Palestra: " + c.getDescricaoPalestra());
        System.out.println("Conteudos da Palestra: " + c.getConteudosPalestra());
    }
    
    public static void printList(ArrayList<PalestraBO>lista){
        System.out.println("L1ista de Palestra");
        for(PalestraBO cadaPalestra:lista){
            printPalestra(cadaPalestra);
            System.out.println("---------");
        }
    }
}
