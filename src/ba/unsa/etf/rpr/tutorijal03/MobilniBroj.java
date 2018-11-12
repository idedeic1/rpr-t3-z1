package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;

    MobilniBroj(int mobilnaMreza1, String broj1){
        this.mobilnaMreza = mobilnaMreza1;
        this.broj = broj1;
    }

    public int compareTo(Object o){
        MobilniBroj mb = (MobilniBroj) o;
        return this.broj.compareTo(mb.broj);
    }

    public String ispisi(){
        String s = new String();
        s += "0";
        s += String.valueOf(mobilnaMreza);
        s += "/";
        s += broj;
        return s;
    }

    public int hashCode(){
        return 0;
    }
}