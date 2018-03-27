/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.RecursoBO;
import java.util.ArrayList;

/**
 *
 * @author ronaima
 */
public class RecursoBD {
    private static ArrayList<RecursoBO> base = new ArrayList();
    public static boolean save(RecursoBO item){
        base.add(item);
        return true;
    }
    
    public static ArrayList<RecursoBO> getAll(){
        return base;
        
    }
              
    
    public static RecursoBO findPalestraCod(int codRecurso){
        for(RecursoBO a: base){
            if(a.getCodigoRecurso()== codRecurso){
                return a;
            }
        }
        return null;
    }
    
    public static RecursoBO findRecursoTitulo(String nom){
        for(RecursoBO a: base){
            if(a.getNomeRecurso().equals(nom)){
                return a;
            }
        }
        return null;
    }    
    
    public static int posRecursoCod(int codRecurso){
        int linha = 0;
        for (RecursoBO c: base){
            if(c.getCodigoRecurso()== codRecurso){
                return linha;
            }
            linha++;
        }
        return -1;
    }
    
     
    public static boolean delete(
            int codRecurso){
        int linha = posRecursoCod(codRecurso);
        if(linha != -1){
            base.remove(linha);
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean update(RecursoBO dado){
        int linha = posRecursoCod(dado.getCodigoRecurso());
        if(linha != -1){
            base.set(linha, dado);
            return true;
        }
        else{
            return false;
        }
    }
}
