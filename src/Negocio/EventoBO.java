package Negocio;

import java.util.Date;

public class EventoBO {

    public int codEvento;    
    public String nomeEvento;
    public String descricaoEvento;
    public Date dataInicioInscricaoEvento;
    public Date dataFimInscricaoEvento;
    public Date dataInicioEvento;
    public Date dataFimEvento;
    public Date dataFimPublicacaoEvento;
    public String status;

    public EventoBO(int codEvento, String nomeEvento, String descricaoEvento, Date dataInicioInscricaoEvento, Date dataFimInscricaoEvento, Date dataInicioEvento, Date dataFimEvento, Date dataFimPublicacaoEvento, String status) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.descricaoEvento = descricaoEvento;
        this.dataInicioInscricaoEvento = dataInicioInscricaoEvento;
        this.dataFimInscricaoEvento = dataFimInscricaoEvento;
        this.dataInicioEvento = dataInicioEvento;
        this.dataFimEvento = dataFimEvento;
        this.dataFimPublicacaoEvento = dataFimPublicacaoEvento;
        this.status = status;
    }

    public EventoBO(String nomeEvento, String descricaoEvento, Date dataInicioInscricaoEvento, Date dataFimInscricaoEvento, Date dataInicioEvento, Date dataFimEvento, Date dataFimPublicacaoEvento, boolean Status) {
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
}
