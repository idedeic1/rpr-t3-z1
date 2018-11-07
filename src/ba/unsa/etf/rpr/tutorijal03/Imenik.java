package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;


public class Imenik {
    private HashMap<TelefonskiBroj, String> kontakti = new HashMap<>();
    public void dajIme(){ };

    public void dodaj(String ime, TelefonskiBroj broj){
        kontakti.put(broj,ime);
    }

    public String dajBroj(String ime){
        Set set = kontakti.entrySet();
        Iterator iterator = set.iterator();

        return kontakti.get(ime);
    }

    public String dajIme(TelefonskiBroj broj){

        return (String)kontakti.get(broj);
    }

    public String naSlovo(char s){String tmp = "test"; return tmp;};
    //public Set<String> izGrada(Grad g){};

    /*public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> temp = new Set<TelefonskiBroj>() {};
        return temp;
    }*/
}
