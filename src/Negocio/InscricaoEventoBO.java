/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author ronaima
 */
public class InscricaoEventoBO {
    public int raAluno;
    public int codEvento;    
    public int codInscricaoEvento;

    public InscricaoEventoBO(int raAluno, int codEvento, int codInscricaoEvento) {
        this.raAluno = raAluno;
        this.codEvento = codEvento;
        this.codInscricaoEvento = codInscricaoEvento;
    }

    public int getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(int raAluno) {
        this.raAluno = raAluno;
    }

    public int getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(int codEvento) {
        this.codEvento = codEvento;
    }

    public int getCodInscricaoEvento() {
        return codInscricaoEvento;
    }

    public void setCodInscricaoEvento(int codInscricaoEvento) {
        this.codInscricaoEvento = codInscricaoEvento;
    }

    
    
    
}
