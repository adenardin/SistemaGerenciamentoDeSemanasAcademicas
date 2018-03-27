/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Negocio.ConfirmacaoPresencaBO;
import Persistencia.ConfirmacaoPresencaBD;
import Visao.Teclado;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronaima
 */
public class ConfirmacaoPresencaCL {
    
//    public  static  void showConfirmacaoPresenca(){
//        ConfirmacaoPresencaIO.printList(ConfirmacaoPresencaBD.getAll());
//    }
    
    public  static  ArrayList<ConfirmacaoPresencaBO> showConfirmacaoPresenca(){
        return ConfirmacaoPresencaBD.getAll();
    }
    
    
    
    public static ConfirmacaoPresencaBO findConfirmacaoPresencaCod(int codigoConfirmacaoPresenca){
        ConfirmacaoPresencaBO c= ConfirmacaoPresencaBD.findConfirmacaoPresencaCod(codigoConfirmacaoPresenca);
            return c;
//        if(c != null){
//            ConfirmacaoPresencaIO.printConfirmacaoPresenca(c);
//            }
//            else{//Depóis trocar por exceção
//            System.out.println("não encontrado");
//            }
    }   
    
    public static boolean deleteConfirmacaoPresenca(int CodigoConfirmacaoPresenca){
        return ConfirmacaoPresencaBD.delete(CodigoConfirmacaoPresenca);
    }
    
    public static boolean updateConfirmacaoPresenca(ConfirmacaoPresencaBO c){
        //ClienteBO c= ClienteIO.getInstance();
        return ConfirmacaoPresencaBD.update(c);
    }

    public static ConfirmacaoPresencaBO chooseConfirmacaoPresenca(){
        int CodigoBusca;
        String confirmacao;
        ConfirmacaoPresencaBO ConfirmacaoPresenca;
        do{
            System.out.println("Codigo: ");
            CodigoBusca = Teclado.lerInt();
            ConfirmacaoPresenca = ConfirmacaoPresencaBD.findConfirmacaoPresencaCod(CodigoBusca);
            if(ConfirmacaoPresenca != null){
                System.out.println("confirma? s/n ");
                confirmacao = Teclado.lerString();
            }
            else{
                System.out.println("Não encontrado! ");
                confirmacao = "N";
            }
        }
        while(!(confirmacao.equalsIgnoreCase("S")));
        return ConfirmacaoPresenca;
    }    
        
    public static boolean newConfirmacaoPresenca(ConfirmacaoPresencaBO ConfirmacaoPresenca){
        return ConfirmacaoPresencaBD.save(ConfirmacaoPresenca);
    }
    
//    public static ArrayList<PalestraConfirmacaoPresencaBO>getItens(int codigoVenda){
//        return PalestraConfirmacaoPresencaBD.findPalestraVendidos(codigoVenda);
//    }
}

