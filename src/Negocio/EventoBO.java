package Negocio;

import java.util.Date;

public class EventoBO {

    private String nomeEvento;

    private String descricaoEvento;

    private Date dataInicioInscricaoEvento;

    private Date dataFimInscricaoEvento;

    private Date dataInicioEvento;

    private Date dataFimEvento;

    private Date dataFimPublicacaoEvento;

    private boolean Status;

    public EventoBO getPeriodoExecucao() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public EventoBO getDataInicioInscricaoEvento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public EventoBO getNomeEvento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void detalheEvento() {
    }

    public EventoBO(String nomeEvento, String descricaoEvento, Date dataInicioInscricaoEvento, Date dataFimInscricaoEvento, Date dataInicioEvento, Date dataFimEvento, Date dataFimPublicacaoEvento, boolean Status) {
    }
}
