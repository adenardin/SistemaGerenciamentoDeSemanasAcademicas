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

    public PalestraBO(int codPalestra, String tituloPalestra, Date dataPalestra, Date horaInicioPalestra, Date duracaoPalestra, String descricaoPalestra, String conteudosPalestra) {
        this.codPalestra = codPalestra;
        this.tituloPalestra = tituloPalestra;
        this.dataPalestra = dataPalestra;
        this.horaInicioPalestra = horaInicioPalestra;
        this.duracaoPalestra = duracaoPalestra;
        this.descricaoPalestra = descricaoPalestra;
        this.conteudosPalestra = conteudosPalestra;
    }
    
    public int getIntcodigoPalestra() {
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

    public Date getHoraInicioPalestra() {
        return this.horaInicioPalestra;
    }

    public void setHoraInicioPalestra(Date horaInicioPalestra) {
        this.horaInicioPalestra = horaInicioPalestra;
    }

    public Date getDuracaoPalestra() {
        return this.duracaoPalestra;
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
}
