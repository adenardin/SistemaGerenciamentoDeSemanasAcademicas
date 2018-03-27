//SALABO OK
package Negocio;

public class SalaBO {
    
    private int codigoSala;
    
    private String nomeSala;

    private int capacidade;

    private String adaptada;

    public SalaBO(int codigoSala, String nomeSala, int capacidade, String adaptada) {
        this.codigoSala = codigoSala;
        this.nomeSala = nomeSala;
        this.capacidade = capacidade;
        this.adaptada = adaptada;                
    }

    public int getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(int codigoSala) {
        this.codigoSala = codigoSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getAdaptada() {
        return adaptada;
    }

    public void setAdaptada(String adaptada) {
        this.adaptada = adaptada;
    }    
}