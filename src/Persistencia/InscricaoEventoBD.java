/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.InscricaoEventoBO;
import java.util.ArrayList;

/**
 *
 * @author ronaima
 */
public class InscricaoEventoBD {
    private static ArrayList<InscricaoEventoBO> base = new ArrayList();
    public static boolean save(InscricaoEventoBO item){
        base.add(item);
        return true;
    }
    
    public static ArrayList<InscricaoEventoBO> getAll(){
        return base;
        
    }
              
    public static InscricaoEventoBO findInscricaoEventoCodigo(int codigo){
        for(InscricaoEventoBO a: base){
            if(a.getCodEvento()== codigo){
                return a;
            }
        }
        return null;
    }
    
//    public static InscricaoEventoBO findInscricaoEventoNome(String nom){
//        for(InscricaoEventoBO a: base){
//            if(a.getNomeInscricaoEvento().equals(nom)){
//                return a;
//            }
//        }
//        return null;
//    }    
    
    public static int posInscricaoEventoCod(int RA){
        int linha = 0;
        for (InscricaoEventoBO c: base){
            if(c.getCodEvento()== RA){
                return linha;
            }
            linha++;
        }
        return -1;
    }
    
     
    public static boolean delete(
            int codigo){
        int linha = posInscricaoEventoCod(codigo);
        if(linha != -1){
            base.remove(linha);
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean update(InscricaoEventoBO dado){
        int linha = posInscricaoEventoCod(dado.getCodEvento());
        if(linha != -1){
            base.set(linha, dado);
            return true;
        }
        else{
            return false;
        }
    }
}
