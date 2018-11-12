package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava, broj;

    MedunarodniBroj(String drzava1, String broj1){
        this.drzava = drzava1;
        this.broj = broj1;
    }

    public int compareTo(Object o){
        return this.broj.compareTo(((MedunarodniBroj) o).broj);
    }

    public String ispisi(){
        String s = new String();
        s += drzava;
        s += broj;

        return s;
    }

    public int hashCode(){
        return 0;
    }
}