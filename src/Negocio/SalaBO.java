package Negocio;

public class SalaBO {

    private int codSala;
    
    private String nomeSala;

    private int capacidadeSala;

    private boolean adaptadaSala;

    public SalaBO(int codSala, String nomeSala, int capacidadeSala, boolean adaptadaSala) {
        this.codSala = codSala;
        this.nomeSala = nomeSala;
        this.capacidadeSala = capacidadeSala;
        this.adaptadaSala = adaptadaSala;
    }

    public boolean isAdaptadaSala() {
        return adaptadaSala;
    }

    public void setAdaptadaSala(boolean adaptadaSala) {
        this.adaptadaSala = adaptadaSala;
    }

    public int getCodSala() {
        return codSala;
    }

    public void setCodSala(int codSala) {
        this.codSala = codSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public int getCapacidadeSala() {
        return capacidadeSala;
    }

    public void setCapacidadeSala(int capacidadeSala) {
        this.capacidadeSala = capacidadeSala;
    }

}
