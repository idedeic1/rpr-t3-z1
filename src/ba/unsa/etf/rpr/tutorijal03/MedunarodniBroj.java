package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String broj;
    private String drzava;

    public MedunarodniBroj(String broj, String drzava) {
        this.broj = broj;
        this.drzava = drzava;
    }
    @Override public String ispisi(){
        String temp = new String();
        temp = drzava + broj;
        return temp;
    }
    @Override public int hashCode(){
        return this.hashCode();
    }
}
