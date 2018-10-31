package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Set;



public class Imenik {
    private HashMap<TelefonskiBroj, String> kontakti = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj){
        kontakti.put(broj,ime);
    }

    public String dajBroj(String ime){

        return kontakti.get(ime);
    }

    public String dajIme(TelefonskiBroj broj){

        return (String)kontakti.get(broj);
    }

    public String naSlovo(char s){}
    public Set<String> izGrada(Grad g){
        Set<String> temp;

        for(int i=0; i<kontakti.size(); i++){
            if(kontakti.containsValue(g.toString()))
                temp.add(kontakti.get(g.toString()));
        }
        return temp;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> temp;
    }

}
