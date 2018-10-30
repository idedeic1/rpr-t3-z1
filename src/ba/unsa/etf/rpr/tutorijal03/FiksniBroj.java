package ba.unsa.etf.rpr.tutorijal03;

enum Grad {SARAJEVO, TUZLA, ZENICA, BRCKO, TRAVNIK, ORASJE, LIVNO, MOSTAR, BIHAC, GORAZDE, SIROKIBRIJEG}
public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    @Override public String ispisi(){
        String temp = new String();
        if(this.grad == Grad.SARAJEVO) temp = "033/" + broj;
        if(this.grad == Grad.TUZLA) temp = "035/" + broj;
        if(this.grad == Grad.ZENICA) temp = "032/" + broj;
        if(this.grad == Grad.BRCKO) temp = "049/" + broj;
        if(this.grad == Grad.BIHAC) temp = "037/" + broj;
        if(this.grad == Grad.TRAVNIK) temp = "030/" + broj;
        if(this.grad == Grad.MOSTAR) temp = "036/" + broj;
        if(this.grad == Grad.ORASJE) temp = "031/" + broj;
        if(this.grad == Grad.LIVNO) temp = "034/" + broj;
        if(this.grad == Grad.GORAZDE) temp = "038/" + broj;
        if(this.grad == Grad.SIROKIBRIJEG) temp = "039/" + broj;
        return temp;
    }
    @Override public int hashCode(){
        return this.hashCode();
    }

}
