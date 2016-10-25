package Negocio;

public class RecursoBO {

    private int codRecurso;
    
    private String nomeRecurso;

    private int quantidadeRecurso;

    public RecursoBO(String nomeRecurso, int quantidadeRecurso) {
        this.nomeRecurso = nomeRecurso;
        this.quantidadeRecurso = quantidadeRecurso;
    }

    public int getQuantidadeRecurso() {
        return quantidadeRecurso;
    }

    public void setQuantidadeRecurso(int quantidadeRecurso) {
        this.quantidadeRecurso = quantidadeRecurso;
    }

    public int getCodRecurso() {
        return codRecurso;
    }

    public void setCodRecurso(int codRecurso) {
        this.codRecurso = codRecurso;
    }

    public String getNomeRecurso() {
        return nomeRecurso;
    }

    public void setNomeRecurso(String nomeRecurso) {
        this.nomeRecurso = nomeRecurso;
    }
    
}
