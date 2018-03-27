/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.PalestraBO;
import java.util.ArrayList;

/**
 *
 * @author ronaima
 */
public class PalestraBD {
    private static ArrayList<PalestraBO> base = new ArrayList();
    public static boolean save(PalestraBO item){
        base.add(item);
        return true;
    }
    
    public static ArrayList<PalestraBO> getAll(){
        return base;
        
    }
              
    /**
     *
     * @param codPalestra
     * @return
     */
    public static PalestraBO findPalestraCod(int codPalestra){
        for(PalestraBO a: base){
            if(a.getIntcodigoPalestra()== codPalestra){
                return a;
            }
        }
        return null;
    }
    
    public static PalestraBO findPalestraTitulo(String nom){
        for(PalestraBO a: base){
            if(a.getTituloPalestra().equals(nom)){
                return a;
            }
        }
        return null;
    }    
    
    public static int posPalestraCod(int codPalestra){
        int linha = 0;
        for (PalestraBO c: base){
            if(c.getIntcodigoPalestra()== codPalestra){
                return linha;
            }
            linha++;
        }
        return -1;
    }
    
    /**
     *
     * @param nom
     * @return
     */
    public static PalestraBO findTituloPalestra(String nom){
        for(PalestraBO a: base){
            if(a.getTituloPalestra().equals(nom)){
                return a;
            }
        }
        return null;
    }
    
     
    public static boolean delete(int codPalestra){
        int linha = posPalestraCod(codPalestra);
        if(linha != -1){
            base.remove(linha);
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean update(PalestraBO dado){
        int linha = posPalestraCod(dado.getIntcodigoPalestra());
        if(linha != -1){
            base.set(linha, dado);
            return true;
        }
        else{
            return false;
        }
    }
}
