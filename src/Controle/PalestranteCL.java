/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.text.ParseException;
import java.util.ArrayList;

import Negocio.PalestranteBO;
import Persistencia.PalestranteBD;
import Visao.PalestranteIO;

/**
 *
 * @author ronaima
 */
public class PalestranteCL {
	public  static boolean newPalestrante(){
        PalestranteBO c = null;
		try {
			c = PalestranteIO.getInstance();
		} catch (ParseException e) {
			e.printStackTrace();
		}
        return PalestranteBD.save(c);
    }
	
	public static boolean newPalestrante(PalestranteBO p){
		return PalestranteBD.save(p);
	}
	
	public  static  ArrayList<PalestranteBO> showPalestrante(){
        return PalestranteBD.getAll();
    }
	
	public static PalestranteBO findPalestranteCod(int cod){
		PalestranteBO c = PalestranteBD.findPalestranteCodigo(cod);
        return c;
    }
	
	/**
    *
    * @param nom
    * @return
    */
   public static PalestranteBO findPalestranteNome(String nom){
	   PalestranteBO p = PalestranteBD.findPalestranteNome(nom);
       return p;
   }    
	
	public static boolean updatePalestrante(PalestranteBO p){
        return PalestranteBD.update(p);
    }
	
	public static boolean deletePalestrante(int RA){
        return PalestranteBD.delete(RA);
    }
}
