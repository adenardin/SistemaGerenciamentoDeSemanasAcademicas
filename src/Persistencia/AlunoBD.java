/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.AlunoBO;
import java.util.ArrayList;

/**
 *
 * @author ronaima
 */
public class AlunoBD {
    private static ArrayList<AlunoBO> base = new ArrayList();
    public static boolean save(AlunoBO item){
        base.add(item);
        return true;
    }
    
    public static ArrayList<AlunoBO> getAll(){
        return base;
        
    }
              
    public static AlunoBO findAlunoRa(int RA){
        for(AlunoBO a: base){
            if(a.getRA()== RA){
                return a;
            }
        }
        return null;
    }
    
    public static AlunoBO findAlunoNome(String nom){
        for(AlunoBO a: base){
            if(a.getNomeAluno().equals(nom)){
                return a;
            }
        }
        return null;
    }    
    
    public static int posAlunoRa(int RA){
        int linha = 0;
        for (AlunoBO c: base){
            if(c.getRA() == RA){
                return linha;
            }
            linha++;
        }
        return -1;
    }
    
     
    public static boolean delete(
            int codigo){
        int linha = posAlunoRa(codigo);
        if(linha != -1){
            base.remove(linha);
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean update(AlunoBO dado){
        int linha = posAlunoRa(dado.getRA());
        if(linha != -1){
            base.set(linha, dado);
            return true;
        }
        else{
            return false;
        }
    }
}
