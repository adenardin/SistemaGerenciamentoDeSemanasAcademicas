/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.ColaboradorBO;
import java.util.ArrayList;

/**
 *
 * @author ronaima
 */
public class ColaboradorBD {
    private static ArrayList<ColaboradorBO> base = new ArrayList();
    public static boolean save(ColaboradorBO item){
        base.add(item);
        return true;
    }
    
    public static ArrayList<ColaboradorBO> getAll(){
        return base;
        
    }
              
    public static ColaboradorBO findColaboradorCod(int cod){
        for(ColaboradorBO c: base){
            if(c.getCodColaborador()== cod){
                return c;
            }
        }
        return null;
    }
    
    public static ColaboradorBO findColaboradorNome(String nom){
        for(ColaboradorBO c: base){
            if(c.getNomeColaborador().equals(nom)){
                return c;
            }
        }
        return null;
    }    
    
    public static int posColaboradorCod(int cod){
        int linha = 0;
        for (ColaboradorBO c: base){
            if(c.getCodColaborador()== cod){
                return linha;
            }
            linha++;
        }
        return -1;
    }
    
     
    public static boolean delete(
            int codigo){
        int linha = posColaboradorCod(codigo);
        if(linha != -1){
            base.remove(linha);
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean update(ColaboradorBO dado){
        int linha = posColaboradorCod(dado.getCodColaborador());
        if(linha != -1){
            base.set(linha, dado);
            return true;
        }
        else{
            return false;
        }
    }
}
