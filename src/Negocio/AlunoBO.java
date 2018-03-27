package Negocio;

import java.util.Date;

public class AlunoBO {

    public String nomeAluno;
    public int RA;
    public String eMail;
    public String telefone;
    public Date dataNascimento;
    public String senha;
    
    public AlunoBO(String nomeAluno, int RA, String eMail, String telefone, Date dataNascimento, String senha) {
        this.nomeAluno = nomeAluno;
        this.RA = RA;
        this.eMail = eMail;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean confirmaSenha() {
        return false;
    }

//    public PalestraBO consultaPalestrasAssistidas(int codPalestra) {
//        PalestraBO p = new PalestraBO();
//        return p;
//    }
}
