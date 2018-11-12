package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;
import java.util.Set;



public class Imenik {
    HashMap<String, TelefonskiBroj> imeBroj = new HashMap<>();

    void dodaj (String ime, TelefonskiBroj broj​){
        imeBroj.put(ime, broj​);
    }

    String dajBroj (String ime){
        TelefonskiBroj tb = imeBroj.get(ime);
        return tb.ispisi();
    }


    String pozivni(FiksniBroj.Grad g){
        String pom = new String();
        if(g == FiksniBroj.Grad.SARAJEVO){
            pom = "033";
        }
        if(g == FiksniBroj.Grad.TUZLA){
            pom = "035";
        }
        if(g == FiksniBroj.Grad.ZENICA){
            pom = "032";
        }
        if(g == FiksniBroj.Grad.BIHAC){
            pom = "037";
        }
        if(g == FiksniBroj.Grad.ORASJE){
            pom = "031";
        }
        if(g == FiksniBroj.Grad.GORAZDE){
            pom = "038";
        }
        if(g == FiksniBroj.Grad.TRAVNIK){
            pom = "030";
        }
        if(g == FiksniBroj.Grad.MOSTAR){
            pom = "036";
        }
        if(g == FiksniBroj.Grad.SIROKIBRIJEG){
            pom = "039";
        }
        if(g == FiksniBroj.Grad.LIVNO){
            pom = "034";
        }
        else if(g == FiksniBroj.Grad.BRCKO){
            pom = "049";
        }
        return pom;
    }


    public String naSlovo(char s){
        int brojac = 1;
        String s1 = new String();
        for (HashMap.Entry<String, TelefonskiBroj> entry : imeBroj.entrySet()) {
            if(entry.getKey().charAt(0) == s){
                s1 += String.valueOf(brojac);
                s1 += ". ";
                s1 += entry.getKey();
                s1 += " - ";
                s1 += entry.getValue().ispisi();
                brojac++;

            }
        }
        return s1;
    }

    public Set<String> izGrada(FiksniBroj.Grad g){
        String pom = pozivni(g);

        Set<String> skup = new TreeSet<>();
        for(HashMap.Entry<String, TelefonskiBroj> entry: imeBroj.entrySet()){
            if(entry.getValue().ispisi().substring(0, 3).equals(pom)) {
                skup.add(entry.getKey());
            }
        }

        return skup;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        Set<TelefonskiBroj> skup = new TreeSet<>();
        String pom = pozivni(g);

        for(HashMap.Entry<String, TelefonskiBroj> entry: imeBroj.entrySet()){
            if(entry.getValue().ispisi().substring(0, 3).equals(pom)) {
                skup.add(entry.getValue());
            }
        }

        return skup;
    }
}