/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.PalestranteBO;
import java.util.ArrayList;

/**
 *
 * @author ronaima
 */
public class PalestranteBD {
    private static ArrayList<PalestranteBO> base = new ArrayList();
    public static boolean save(PalestranteBO item){
        base.add(item);
        return true;
    }
    
    public static ArrayList<PalestranteBO> getAll(){
        return base;
        
    }
              
    public static PalestranteBO findPalestranteCodigo(int codigo){
        for(PalestranteBO a: base){
            if(a.getCodPalestrante()== codigo){
                return a;
            }
        }
        return null;
    }
    
    public static PalestranteBO findPalestranteNome(String nom){
        for(PalestranteBO a: base){
            if(a.getNomePalestrante().equals(nom)){
                return a;
            }
        }
        return null;
    }    
    
    public static int posPalestranteCod(int RA){
        int linha = 0;
        for (PalestranteBO c: base){
            if(c.getCodPalestrante()== RA){
                return linha;
            }
            linha++;
        }
        return -1;
    }
    
     
    public static boolean delete(
            int codigo){
        int linha = posPalestranteCod(codigo);
        if(linha != -1){
            base.remove(linha);
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean update(PalestranteBO dado){
        int linha = posPalestranteCod(dado.getCodPalestrante());
        if(linha != -1){
            base.set(linha, dado);
            return true;
        }
        else{
            return false;
        }
    }
}
