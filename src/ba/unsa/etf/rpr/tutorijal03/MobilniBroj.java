package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;

    @Override public String ispisi(){
        String temp = new String();
        temp = "0" + mobilnaMreza + "/" + broj;
        return temp;
    }

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override public int hashCode(){
        return this.hashCode();
    }
}
