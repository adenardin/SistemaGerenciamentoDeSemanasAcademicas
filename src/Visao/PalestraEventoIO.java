/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Negocio.PalestraEventoBO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author ronaima
 */
public class PalestraEventoIO {
    public static PalestraEventoBO getInstance() throws ParseException{
        
        System.out.print("Codigo Evento: ");
        int codEvento = Teclado.lerInt();
        
        System.out.print("Nome Evento: ");
        String nomeEvento = Teclado.lerString();
        
        System.out.print("Descrição do Evento: ");
        String descricaoEvento = Teclado.lerString();
        
        System.out.print("Data Inicio Inscricao Evento: ");
        String dataInicioInscricaoDeEvento = Teclado.lerString();
            SimpleDateFormat diie = new SimpleDateFormat("dd/MM/yyyy");
            diie.setLenient(false);
            Date dataInicioInscricaoEvento = diie.parse(dataInicioInscricaoDeEvento);
            
        System.out.print("Data Fim Inscrição Evento: ");
        String dataFimInscricaoDeEvento = Teclado.lerString();
            SimpleDateFormat dfie = new SimpleDateFormat("dd/MM/yyyy");
            dfie.setLenient(false);
            Date dataFimInscricaoEvento = dfie.parse(dataFimInscricaoDeEvento);
            
        System.out.print("Data Inicio Evento: ");
        String dataInicioDeEvento = Teclado.lerString();  
            SimpleDateFormat die = new SimpleDateFormat("dd/MM/yyyy");
            die.setLenient(false);
            Date dataInicioEvento = die.parse(dataInicioDeEvento);
            
        System.out.print("Data Fim Evento: ");
        String dataFimDeEvento = Teclado.lerString();
            SimpleDateFormat dfe = new SimpleDateFormat("dd/MM/yyyy");
            dfe.setLenient(false);
            Date dataFimEvento = dfe.parse(dataFimDeEvento);
            
        System.out.print("Data Fim Publicaçao Evento: ");
        String dataFimPublicacaoDeEvento = Teclado.lerString();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            Date dataFimPublicacaoEvento = sdf.parse(dataFimPublicacaoDeEvento);
            
        System.out.print("Status Evento: ");
        String status = Teclado.lerString();         
                
        System.out.print("Codigo Palestra1: ");
        int codPalestra1 = Teclado.lerInt();
        
        System.out.print("Codigo Palestra2: ");
        int codPalestra2 = Teclado.lerInt();
        
        System.out.print("Codigo Palestra3: ");
        int codPalestra3 = Teclado.lerInt();
        
        return new PalestraEventoBO(codEvento, nomeEvento, descricaoEvento, dataInicioInscricaoEvento,dataFimInscricaoEvento,dataInicioEvento,dataFimEvento,dataFimPublicacaoEvento,status, codPalestra1 ,codPalestra2, codPalestra3 );
    }
    
    public static void printPalestraEvento(PalestraEventoBO c){
        System.out.println("Codigo Evento " + c.getCodEvento());
        System.out.println("Nome Evento: " + c.getNomeEvento());
        System.out.println("Data Inicio Inscricao Evento: " + c.getDataInicioInscricaoEvento());
        System.out.println("Data Fim Inscrição Evento: " + c.getDataFimInscricaoEvento());
        System.out.println("Data Inicio Evento: " + c.getDataInicioEvento());
        System.out.println("Data Fim Evento: " + c.getDataFimEvento());
        System.out.println("Data Fim Publicaçao Evento: " + c.getDataFimPublicacaoEvento());
        System.out.println("Status Evento: " + c.getStatus());
        System.out.println("Codigo Palestra1 " + c.getCodPalestra1());
        System.out.println("Codigo Palestra2 " + c.getCodPalestra2());
        System.out.println("Codigo Palestra3 " + c.getCodPalestra3());
    }
    
    public static void printList(ArrayList<PalestraEventoBO>lista){
        System.out.println("Lista de PalestraEvento");
        for(PalestraEventoBO cadaEvento:lista){
            printPalestraEvento(cadaEvento);
            System.out.println("---------");
        }
    }
}
