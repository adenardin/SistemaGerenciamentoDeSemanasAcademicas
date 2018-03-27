package Negocio;

import java.util.Date;

public class ColaboradorBO {

    public int codColaborador;    
    public String nomeColaborador;
    public String eMailColaborador;
    public String telefoneColaborador;
    public Date dataNascimentoColaborador;
    public String senhaColaborador;
    public boolean statusColaborador;

    public ColaboradorBO(int codColaborador, String nomeColaborador, String eMailColaborador, String telefoneColaborador, Date dataNascimentoColaborador, String senhaColaborador, boolean statusColaborador) {
        this.codColaborador = codColaborador;
        this.nomeColaborador = nomeColaborador;
        this.eMailColaborador = eMailColaborador;
        this.telefoneColaborador = telefoneColaborador;
        this.dataNascimentoColaborador = dataNascimentoColaborador;
        this.senhaColaborador = senhaColaborador;
        this.statusColaborador = statusColaborador;
    }
    
    public int getCodColaborador() {
        return codColaborador;
    }

    public void setCodColaborador(int codColaborador) {
        this.codColaborador = codColaborador;
    }

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
    }

    public String geteMailColaborador() {
        return eMailColaborador;
    }

    public void seteMailColaborador(String eMailColaborador) {
        this.eMailColaborador = eMailColaborador;
    }

    public String getTelefoneColaborador() {
        return telefoneColaborador;
    }

    public void setTelefoneColaborador(String telefoneColaborador) {
        this.telefoneColaborador = telefoneColaborador;
    }

    public Date getDataNascimencolaborador() {
        return dataNascimentoColaborador;
    }

    public void setDataNascimencolaborador(Date dataNascimencolaborador) {
        this.dataNascimentoColaborador = dataNascimencolaborador;
    }

    public String getSenhaColaborador() {
        return senhaColaborador;
    }

    public void setSenhaColaborador(String senhaColaborador) {
        this.senhaColaborador = senhaColaborador;
    }
    
    public boolean getStatusColaborador() {
        return statusColaborador;
    }

    public void setStatusColaborador(boolean statusColaborador) {
        this.statusColaborador = statusColaborador;
    }

    

    
    
}
