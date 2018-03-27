package Negocio;

public class RecursoBO {
    
    private static int codigoRecurso;

    private static String nomeRecurso;

    private static int quantidadeRecurso;

    public RecursoBO(int codigoRecurso, String nomeRecurso, int quantidadeRecurso) {
    }

    public static int getCodigoRecurso() {
        return codigoRecurso;
    }

    public static void setCodigoRecurso(int codigoRecurso) {
        RecursoBO.codigoRecurso = codigoRecurso;
    }

    public static String getNomeRecurso() {
        return nomeRecurso;
    }

    public static void setNomeRecurso(String nomeRecurso) {
        RecursoBO.nomeRecurso = nomeRecurso;
    }

    public static int getQuantidadeRecurso() {
        return quantidadeRecurso;
    }

    public static void setQuantidadeRecurso(int quantidadeRecurso) {
        RecursoBO.quantidadeRecurso = quantidadeRecurso;
    }
    
    
}
