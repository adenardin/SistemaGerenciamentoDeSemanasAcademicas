package Negocio;

public class PalestranteBO {

    private String nomePalestrante;

    private String miniCurriculoPalestrante;

    public PalestranteBO(String nomePalestrante, String miniCurriculoPalestrante) {
        this.nomePalestrante = nomePalestrante;
        this.miniCurriculoPalestrante = miniCurriculoPalestrante;
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
    
    
}
