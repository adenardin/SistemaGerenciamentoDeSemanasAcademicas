/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Negocio.InscricaoEventoBO;
import Persistencia.InscricaoEventoBD;
import java.util.ArrayList;


/**
 *
 * @author ronaima
 */
public class InscricaoEventoCL {
//	public  static boolean newInscricaoEvento(){
//        InscricaoEventoBO c = null;
//		try {
//			c = InscricaoEventoIO.getInstance();
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//        return InscricaoEventoBD.save(c);
//        }
	
	public static boolean newInscricaoEvento(InscricaoEventoBO p){
		return InscricaoEventoBD.save(p);
	}
	
	public  static  ArrayList<InscricaoEventoBO> showInscricaoEvento(){
        return InscricaoEventoBD.getAll();
        }
	
	public static InscricaoEventoBO findInscricaoEventoCod(int cod){
		InscricaoEventoBO c = InscricaoEventoBD.findInscricaoEventoCodigo(cod);
        return c;
        }
	
	/**
    *
    * @param nom
    * @return
    */
//   public static InscricaoEventoBO findInscricaoEventoNome(String nom){
//	   InscricaoEventoBO p = InscricaoEventoBD.findInscricaoEventoNome(nom);
//       return p;
//   }    
	
	public static boolean updateInscricaoEvento(InscricaoEventoBO p){
        return InscricaoEventoBD.update(p);
    }
	
	public static boolean deleteInscricaoEvento(int cod){
        return InscricaoEventoBD.delete(cod);
    }
}
