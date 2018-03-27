/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.PalestraEventoBO;
import java.util.ArrayList;

/**
 *
 * @author ronaima
 */
public class PalestraEventoBD {
    private static ArrayList<PalestraEventoBO> base = new ArrayList();
    public static boolean save(PalestraEventoBO item){
        base.add(item);
        return true;
    }
    
    public static ArrayList<PalestraEventoBO> getAll(){
        return base;
        
    }
              
    public static PalestraEventoBO findPalestraEventoCod(int codEvento){
        for(PalestraEventoBO c: base){
            if(c.getCodEvento()== codEvento){
                return c;
            }
        }
        return null;
    }
    
    public static PalestraEventoBO findPalestraEventoNome(String nom){
        for(PalestraEventoBO a: base){
            if(a.getNomeEvento().equals(nom)){
                return a;
            }
        }
        return null;
    }    
    
    public static int posPalestraEventoCod(int codEvento){
        int linha = 0;
        for (PalestraEventoBO c: base){
            if(c.getCodEvento()== codEvento){
                return linha;
            }
            linha++;
        }
        return -1;
    }
    
     
    public static boolean delete(
            int codEvento){
        int linha = posPalestraEventoCod(codEvento);
        if(linha != -1){
            base.remove(linha);
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean update(PalestraEventoBO dado){
        int linha = posPalestraEventoCod(dado.getCodEvento());
        if(linha != -1){
            base.set(linha, dado);
            return true;
        }
        else{
            return false;
        }
    }
}
