/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.SalaBO;
import java.util.ArrayList;

/**
 *
 * @author ronaima
 */
public class SalaBD {
    
    private static ArrayList<SalaBO> base = new ArrayList();
    
    public static boolean save(SalaBO item){
        base.add(item);
        return true;
    }
    
    public static ArrayList<SalaBO> getAll(){
        return base;
        
    }
              
    
    public static SalaBO findSalaCod(int codSala){
        for(SalaBO a: base){
            if(a.getCodigoSala()== codSala){
                return a;
            }
        }
        return null;
    }
    
    public static SalaBO findSalaNome(String nom){
        for(SalaBO a: base){
            if(a.getNomeSala().equals(nom)){
                return a;
            }
        }
        return null;
    }    
    
    public static int posSalaCod(int codSala){
        int linha = 0;
        for (SalaBO c: base){
            if(c.getCodigoSala()== codSala){
                return linha;
            }
            linha++;
        }
        return -1;
    }
    
     
    public static boolean delete(
            int codSala){
        int linha = posSalaCod(codSala);
        if(linha != -1){
            base.remove(linha);
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean update(SalaBO dado){
        int linha = posSalaCod(dado.getCodigoSala());
        if(linha != -1){
            base.set(linha, dado);
            return true;
        }
        else{
            return false;
        }
    }
}
