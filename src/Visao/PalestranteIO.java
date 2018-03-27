/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Negocio.PalestranteBO;
import java.text.ParseException;
import java.util.ArrayList;


/**
 *
 * @author ronaima
 */
public class PalestranteIO {
    public static PalestranteBO getInstance() throws ParseException{
        
        System.out.print("Cod Palestrante: ");
        int codPalestrante = Teclado.lerInt();
        System.out.print("Nome Palestrante: ");
        String nomePalestrante = Teclado.lerString();
        System.out.print("miniCurriculoPalestrante: ");
        String miniCurriculoPalestrante = Teclado.lerString();
        System.out.print("E-mail: ");
        String eMail = Teclado.lerString();
        System.out.print("Telefone: ");
        String telefone = Teclado.lerString();
//        System.out.print("Data de Nascimento: ");
//        String txtDataNascimento = Teclado.lerString();
//            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//            sdf.setLenient(false);
//            Date dataNascimentoColaborador = sdf.parse(txtDataNascimento);
//        System.out.print("Senha: ");
//        String senhaColaborador = Teclado.lerString();         
//        System.out.print("Staus: ");
//        String statusDeColaborador = Teclado.lerString(); 
//             boolean statusColaborador = Boolean.parseBoolean(statusDeColaborador);
                           //( codPalestrante,  nomePalestrante,  miniCurriculoPalestrante,  eMail, telefone )
        return new PalestranteBO(codPalestrante, nomePalestrante, miniCurriculoPalestrante, eMail, telefone);
    }
    
    public static void printPalestrante(PalestranteBO c){
        System.out.println("Cod Palestrante: " + c.getCodPalestrante());
        System.out.println("Nome Palestrante: " + c.getNomePalestrante());
        System.out.println("miniCurriculoPalestrante: " + c.getMiniCurriculoPalestrante());
        System.out.println("E-mail: " + c.geteMail());
        System.out.println("Telefone: " + c.getTelefone());
    }
    
    public static void printList(ArrayList<PalestranteBO>lista){
        System.out.println("Lista de Palestrante");
        for(PalestranteBO cadaPalestrante:lista){
            printPalestrante(cadaPalestrante);
            System.out.println("---------");
        }
    }
}
