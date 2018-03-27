/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Date;

/**
 *
 * @author faculdade.ads
 */
public class PalestraEventoBO {
   public int codEvento;    
    public String nomeEvento;
    public String descricaoEvento;
    public Date dataInicioInscricaoEvento;
    public Date dataFimInscricaoEvento;
    public Date dataInicioEvento;
    public Date dataFimEvento;
    public Date dataFimPublicacaoEvento;
    public String status;
    public int codPalestra1;
    public int codPalestra2;
    public int codPalestra3;
    
//    public String tituloPalestra;
//    public Date dataPalestra;
//    public String horaInicioPalestra;
//    public String duracaoPalestra;
//    public String descricaoPalestra;
//    public String conteudosPalestra;

    public PalestraEventoBO(int codEvento, String nomeEvento, String descricaoEvento, Date dataInicioInscricaoEvento, Date dataFimInscricaoEvento, Date dataInicioEvento, Date dataFimEvento, Date dataFimPublicacaoEvento, String status, int codPalestra1, int codPalestra2, int codPalestra3) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.descricaoEvento = descricaoEvento;
        this.dataInicioInscricaoEvento = dataInicioInscricaoEvento;
        this.dataFimInscricaoEvento = dataFimInscricaoEvento;
        this.dataInicioEvento = dataInicioEvento;
        this.dataFimEvento = dataFimEvento;
        this.dataFimPublicacaoEvento = dataFimPublicacaoEvento;
        this.status = status;
        this.codPalestra1 = codPalestra1;
        this.codPalestra2 = codPalestra2;
        this.codPalestra3 = codPalestra3;
    }

    public int getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(int codEvento) {
        this.codEvento = codEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public Date getDataInicioInscricaoEvento() {
        return dataInicioInscricaoEvento;
    }

    public void setDataInicioInscricaoEvento(Date dataInicioInscricaoEvento) {
        this.dataInicioInscricaoEvento = dataInicioInscricaoEvento;
    }

    public Date getDataFimInscricaoEvento() {
        return dataFimInscricaoEvento;
    }

    public void setDataFimInscricaoEvento(Date dataFimInscricaoEvento) {
        this.dataFimInscricaoEvento = dataFimInscricaoEvento;
    }

    public Date getDataInicioEvento() {
        return dataInicioEvento;
    }

    public void setDataInicioEvento(Date dataInicioEvento) {
        this.dataInicioEvento = dataInicioEvento;
    }

    public Date getDataFimEvento() {
        return dataFimEvento;
    }

    public void setDataFimEvento(Date dataFimEvento) {
        this.dataFimEvento = dataFimEvento;
    }

    public Date getDataFimPublicacaoEvento() {
        return dataFimPublicacaoEvento;
    }

    public void setDataFimPublicacaoEvento(Date dataFimPublicacaoEvento) {
        this.dataFimPublicacaoEvento = dataFimPublicacaoEvento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCodPalestra1() {
        return codPalestra1;
    }

    public void setCodPalestra1(int codPalestra1) {
        this.codPalestra1 = codPalestra1;
    }

    public int getCodPalestra2() {
        return codPalestra2;
    }

    public void setCodPalestra2(int codPalestra2) {
        this.codPalestra2 = codPalestra2;
    }

    public int getCodPalestra3() {
        return codPalestra3;
    }

    public void setCodPalestra3(int codPalestra3) {
        this.codPalestra3 = codPalestra3;
    }

   
    
}
