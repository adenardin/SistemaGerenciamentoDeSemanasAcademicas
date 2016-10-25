package Negocio;

public class PalestranteBO {

    private int codPalestrante;
    
    private String nomePalestrante;

    private String miniCurriculoPalestrante;

    public PalestranteBO(int codPalestrante, String nomePalestrante, String miniCurriculoPalestrante) {
        this.codPalestrante = codPalestrante;
        this.nomePalestrante = nomePalestrante;
        this.miniCurriculoPalestrante = miniCurriculoPalestrante;
    }

    public String getMiniCurriculoPalestrante() {
        return miniCurriculoPalestrante;
    }

    public void setMiniCurriculoPalestrante(String miniCurriculoPalestrante) {
        this.miniCurriculoPalestrante = miniCurriculoPalestrante;
    }

    public int getCodPalestrante() {
        return codPalestrante;
    }

    public void setCodPalestrante(int codPalestrante) {
        this.codPalestrante = codPalestrante;
    }

    public String getNomePalestrante() {
        return nomePalestrante;
    }

    public void setNomePalestrante(String nomePalestrante) {
        this.nomePalestrante = nomePalestrante;
    }
   
}
