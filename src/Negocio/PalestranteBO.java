package Negocio;

public class PalestranteBO {

    private int codPalestrante;
    private String nomePalestrante;
    private String miniCurriculoPalestrante;
    private String eMail;
    private String telefone;

    public PalestranteBO(int codPalestrante, String nomePalestrante, String miniCurriculoPalestrante, String eMail, String telefone ) {
        this.codPalestrante = codPalestrante;
        this.nomePalestrante = nomePalestrante;
        this.miniCurriculoPalestrante = miniCurriculoPalestrante;
        this.eMail = eMail;
        this.telefone = telefone;
    }

    public int getCodPalestrante() {
        return codPalestrante;
    }

    public void setCodPalestrante(int codPalestrante) {
        this.codPalestrante = codPalestrante;
    }
        
    public String getMiniCurriculoPalestrante() {
        return miniCurriculoPalestrante;
    }

    public void setMiniCurriculoPalestrante(String miniCurriculoPalestrante) {
        this.miniCurriculoPalestrante = miniCurriculoPalestrante;
    }

    public String getNomePalestrante() {
        return nomePalestrante;
    }

    public void setNomePalestrante(String nomePalestrante) {
        this.nomePalestrante = nomePalestrante;
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
    
    
    
    
}
