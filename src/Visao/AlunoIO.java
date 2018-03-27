/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Negocio.AlunoBO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author ronaima
 */
public class AlunoIO {
    public static AlunoBO getInstance() throws ParseException{
        
        System.out.print("Nome: ");
        String txtNomeAluno = Teclado.lerString();
        System.out.print("RA: ");
        int intRA = Teclado.lerInt();
        System.out.print("E-mail: ");
        String txtEmail = Teclado.lerString();
        System.out.print("Telefone: ");
        String txtTelefone = Teclado.lerString();
        System.out.print("Data de Nascimento: ");
        String txtDataNascimento = Teclado.lerString();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            Date dataDeNascimento = sdf.parse(txtDataNascimento);
        
        System.out.print("Senha: ");
        String txtSenha = Teclado.lerString();         
       
        return new AlunoBO(txtNomeAluno,intRA, txtEmail, txtTelefone,dataDeNascimento,txtSenha);
    }
    
    public static void printAluno(AlunoBO c){
        System.out.println("Nome: " + c.getNomeAluno());
        System.out.println("RA: " + c.getRA());
        System.out.println("Email: " + c.geteMail());
        System.out.println("Telefone: " + c.getTelefone());
        System.out.println("Data de Nascimento: " + c.getDataNascimento());
        System.out.println("Senha: " + c.getSenha());
    }
    
    public static void printList(ArrayList<AlunoBO>lista){
        System.out.println("L1ista de Aluno");
        for(AlunoBO cadaAluno:lista){
            printAluno(cadaAluno);
            System.out.println("---------");
        }
    }
}
