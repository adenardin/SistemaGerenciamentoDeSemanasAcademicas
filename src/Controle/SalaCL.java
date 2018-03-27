/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.text.ParseException;
import java.util.ArrayList;

import Negocio.SalaBO;
import Persistencia.SalaBD;
import Visao.SalaIO;

/**
 *
 * @author ronaima
 */
public class SalaCL {
    
    public  static boolean newSala(){
        
        SalaBO s = null;
        
        try {
            s = SalaIO.getInstance();
        } catch (ParseException e) {
        }
        
        return SalaBD.save(s);
    }
	
    public static boolean newSala(SalaBO s) {
	return SalaBD.save(s);
    }
	
    public  static  ArrayList<SalaBO> showSala() {
        return SalaBD.getAll();
    }
	
    public static SalaBO findSalaCod(int cod) {
	SalaBO s = SalaBD.findSalaCod(cod);
        return s;
    }
	
	/**
    *
    * @param nom
    * @return
    */
   public static SalaBO findSalaNome(String nom){
        SalaBO s = SalaBD.findSalaNome(nom);
        return s;
   }    
	
    public static boolean updateSala(SalaBO s){
        return SalaBD.update(s);
    }
	
    public static boolean deleteSala(int cod){
        return SalaBD.delete(cod);
    }
}
