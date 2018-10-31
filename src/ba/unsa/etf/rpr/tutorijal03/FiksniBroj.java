package ba.unsa.etf.rpr.tutorijal03;

enum Grad {
    SARAJEVO("033"),
    TUZLA("035"),
    ZENICA("032"),
    BRCKO("049"),
    TRAVNIK("030"),
    ORASJE("031"),
    LIVNO("034"),
    MOSTAR("036"),
    BIHAC("037"),
    GORAZDE("038"),
    SIROKIBRIJEG("039");

    private final String pozivni;
    private Grad(String s){
        pozivni = s;
    }

    public String toString() {
        return this.pozivni;
    }
}

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    @Override public String ispisi(){
        String temp = new String();
        temp = grad.toString() + "/" + broj;
        return temp;
    }
    @Override public int hashCode(){
        return this.hashCode();
    }

}
