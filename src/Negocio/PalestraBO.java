package Negocio;

import java.util.Date;

public class PalestraBO {

    public int codPalestra;
    public String tituloPalestra;
    public Date dataPalestra;
    public Date horaInicioPalestra;
    public Date duracaoPalestra;
    public String descricaoPalestra;
    public String conteudosPalestra;
    private int codPalestrante;
    
    //new  PalestraBO(    codPalestra,        tituloPalestra,      dataPalestra,        horaInicioPalestra,        duracaoPalestra,        descricaoPalestra,        conteudosPalestra,     codPalestrante);    
    public PalestraBO(int codPalestra, String tituloPalestra, Date dataPalestra, Date   horaInicioPalestra, Date   duracaoPalestra, String descricaoPalestra, String conteudosPalestra, int codPalestrante) {
        this.codPalestra = codPalestra;
        this.tituloPalestra = tituloPalestra;
        this.dataPalestra = dataPalestra;
        this.horaInicioPalestra = horaInicioPalestra;
        this.duracaoPalestra = duracaoPalestra;
        this.descricaoPalestra = descricaoPalestra;
        this.conteudosPalestra = conteudosPalestra;
        this.codPalestrante = codPalestrante;
    }

    public PalestraBO(int codPalestra, String tituloPalestra, Date dataPalestra, Date horaInicioPalestra, Date duracaoPalestra, String descricaoPalestra, String conteudosPalestra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getIntcodigoPalestra() {
        return this.codPalestra;
    }
    
    public int setIntcodigoPalestra() {
        return this.codPalestra;
    }

    public String getTituloPalestra() {
        return this.tituloPalestra;
    }

    public void setTituloPalestra(String tituloPalestra) {
        this.tituloPalestra = tituloPalestra;
    }

    public Date getDataPalestra() {
        return this.dataPalestra;
    }

    public void setDataPalestra(Date dataPalestra) {
        this.dataPalestra = dataPalestra;
    }

    public int getCodPalestra() {
        return codPalestra;
    }

    public void setCodPalestra(int codPalestra) {
        this.codPalestra = codPalestra;
    }

    public Date getHoraInicioPalestra() {
        return horaInicioPalestra;
    }

    public void setHoraInicioPalestra(Date horaInicioPalestra) {
        this.horaInicioPalestra = horaInicioPalestra;
    }

    public Date getDuracaoPalestra() {
        return duracaoPalestra;
    }

    public void setDuracaoPalestra(Date duracaoPalestra) {
        this.duracaoPalestra = duracaoPalestra;
    }

    

    public String getDescricaoPalestra() {
        return this.descricaoPalestra;
    }

    public void setDescricaoPalestra(String descricaoPalestra) {
        this.descricaoPalestra = descricaoPalestra;
    }

    public String getConteudosPalestra() {
        return this.conteudosPalestra;
    }

    public void setConteudosPalestra(String conteudosPalestra) {
        this.conteudosPalestra = conteudosPalestra;
    }    
    
    public void selecaoPalestrante() {
    }

    public void selecaoSalaPalestra() {
    }

    public void selecaoMultiplaRecursosNecessarios() {
    }

    public void selecaoMultiplaEquipeApoio() {
    }

    public CertificadoBO gerarCertificado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getCodPalestrante() {
        return codPalestrante;
    }

    public void setCodPalestrante(int codPalestrante) {
        this.codPalestrante = codPalestrante;
    }
}
