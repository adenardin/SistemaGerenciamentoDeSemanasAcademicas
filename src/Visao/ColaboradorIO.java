/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Negocio.ColaboradorBO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author ronaima
 */
public class ColaboradorIO {
    public static ColaboradorBO getInstance() throws ParseException{
        
        System.out.print("Nome: ");
        String nomeColaborador = Teclado.lerString();
        System.out.print("Cod colaborador: ");
        int codColaborador = Teclado.lerInt();
        System.out.print("E-mail: ");
        String eMailColaborador = Teclado.lerString();
        System.out.print("Telefone: ");
        String telefoneColaborador = Teclado.lerString();
        System.out.print("Data de Nascimento: ");
        String txtDataNascimento = Teclado.lerString();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            Date dataNascimentoColaborador = sdf.parse(txtDataNascimento);
        System.out.print("Senha: ");
        String senhaColaborador = Teclado.lerString();         
        System.out.print("Staus: ");
        String statusDeColaborador = Teclado.lerString(); 
             boolean statusColaborador = Boolean.parseBoolean(statusDeColaborador);
             
        return new ColaboradorBO(codColaborador, nomeColaborador, eMailColaborador, telefoneColaborador, dataNascimentoColaborador,senhaColaborador, statusColaborador);
    }
    
    public static void printColaborador(ColaboradorBO c){
        System.out.println("Nome: " + c.getNomeColaborador());
        System.out.println("Cod colaborador: " + c.getCodColaborador());
        System.out.println("Email: " + c.geteMailColaborador());
        System.out.println("Telefone: " + c.getTelefoneColaborador());
        System.out.println("Data de Nascimento: " + c.getDataNascimencolaborador());
        System.out.println("Senha: " + c.getSenhaColaborador());
        if(c.getStatusColaborador()){
            System.out.println("Status: sim" );
        }
        else{        
            System.out.println("Status: Nao " );
        }
    }
    
    public static void printList(ArrayList<ColaboradorBO>lista){
        System.out.println("Lista de Colaborador");
        for(ColaboradorBO cadaColaborador:lista){
            printColaborador(cadaColaborador);
            System.out.println("---------");
        }
    }    
}
