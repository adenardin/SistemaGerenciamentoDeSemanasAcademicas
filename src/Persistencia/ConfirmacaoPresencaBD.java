/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.ConfirmacaoPresencaBO;
import java.util.ArrayList;

/**
 *
 * @author ronaima
 */
public class ConfirmacaoPresencaBD {
    private static ArrayList<ConfirmacaoPresencaBO> base = new ArrayList();
    public static boolean save(ConfirmacaoPresencaBO item){
        base.add(item);
        return true;
    }
    
    public static ArrayList<ConfirmacaoPresencaBO> getAll(){
        return base;
        
    }
              
    public static ConfirmacaoPresencaBO findConfirmacaoPresencaCod(int cod){
        for(ConfirmacaoPresencaBO a: base){
            if(a.getCod()== cod){
                return a;
            }
        }
        return null;
    }
    
//    public static ConfirmacaoPresencaBO findConfirmacaoPresencaNome(String nom){
//        for(ConfirmacaoPresencaBO a: base){
//            if(a.getNomeAluno().equals(nom)){
//                return a;
//            }
//        }
//        return null;
//    }    
    
    public static int posConfirmacaoPresencaCod(int cod){
        int linha = 0;
        for (ConfirmacaoPresencaBO c: base){
            if(c.getCod() == cod){
                return linha;
            }
            linha++;
        }
        return -1;
    }
    
     
    public static boolean delete(
            int codigo){
        int linha = posConfirmacaoPresencaCod(codigo);
        if(linha != -1){
            base.remove(linha);
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean update(ConfirmacaoPresencaBO dado){
        int linha = posConfirmacaoPresencaCod(dado.getCod());
        if(linha != -1){
            base.set(linha, dado);
            return true;
        }
        else{
            return false;
        }
    }
}
