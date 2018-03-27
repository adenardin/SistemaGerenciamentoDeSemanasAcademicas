package Negocio;

public class ConfirmacaoPresencaBO {

    private int codigoEvento;
    private int RA;
    private int Cod;

    public ConfirmacaoPresencaBO(int codigoEvento, int RA, int Cod) {
        this.codigoEvento = codigoEvento;
        this.RA = RA;
        this.Cod = Cod;
    }

    public int getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(int codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public int getCod() {
        return Cod;
    }

    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    public Object getCodEvento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
