package Negocio;

public class ConfirmacaoPresencaBO {

    private PalestraBO codigoPalestra;

    private AlunoBO RA;

    public ConfirmacaoPresencaBO(PalestraBO codigoPalestra, AlunoBO RA) {
        this.codigoPalestra = codigoPalestra;
        this.RA = RA;
    }

    public AlunoBO getRA() {
        return RA;
    }

    public void setRA(AlunoBO RA) {
        this.RA = RA;
    }

    public PalestraBO getCodigoPalestra() {
        return codigoPalestra;
    }

    public void setCodigoPalestra(PalestraBO codigoPalestra) {
        this.codigoPalestra = codigoPalestra;
    }
    
//    public boolean processaConfirmacaoPresencaBO(){
//        return false;
//    }
}
