/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.EventoBO;
import java.util.ArrayList;

/**
 *
 * @author ronaima
 */
public class EventoBD {
    private static ArrayList<EventoBO> base = new ArrayList();
    public static boolean save(EventoBO item){
        base.add(item);
        return true;
    }
    
    public static ArrayList<EventoBO> getAll(){
        return base;
        
    }
              
    public static EventoBO findEventoCod(int codEvento){
        for(EventoBO c: base){
            if(c.getCodEvento()== codEvento){
                return c;
            }
        }
        return null;
    }
    
    public static EventoBO findEventoNome(String nom){
        for(EventoBO a: base){
            if(a.getNomeEvento().equals(nom)){
                return a;
            }
        }
        return null;
    }    
    
    public static int posEventoCod(int codEvento){
        int linha = 0;
        for (EventoBO c: base){
            if(c.getCodEvento()== codEvento){
                return linha;
            }
            linha++;
        }
        return -1;
    }
    
     
    public static boolean delete(
            int codEvento){
        int linha = posEventoCod(codEvento);
        if(linha != -1){
            base.remove(linha);
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean update(EventoBO dado){
        int linha = posEventoCod(dado.getCodEvento());
        if(linha != -1){
            base.set(linha, dado);
            return true;
        }
        else{
            return false;
        }
    }
}
