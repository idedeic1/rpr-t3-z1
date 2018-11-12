package ba.unsa.etf.rpr.tutorijal03;


import java.util.Scanner;
import java.util.Set;

import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.BIHAC;
import static ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad.SARAJEVO;

public class Program {
    public static void main(String[] args) {
        Imenik imenik = new Imenik();

        Scanner unos = new Scanner(System.in);

        System.out.println("1. Unos podataka\n" + "2. Na slovo\n" + "3. Iz grada\n" + "4. Iz grada brojevi");
        int pom = unos.nextInt();

        if(pom == 1){
            imenik.dodaj("Dedeic Ibrahim", new FiksniBroj(SARAJEVO, "123-123"));
            imenik.dodaj("Dodati korisnik", new FiksniBroj(BIHAC, "525-485"));
            imenik.dodaj("Anonimni kornsik", new MobilniBroj(64, "888-666"));
            imenik.dodaj("Strani korisnik", new MedunarodniBroj("+1", "25 85-75-89"));
        }
        if(pom == 2){
            String slovo = imenik.naSlovo('D');
            System.out.println(slovo);
        }
        if(pom == 3){
            Set<String> brojeviIzGrada = imenik.izGrada(BIHAC);
            for(String broj: brojeviIzGrada){
                System.out.println(broj + ",");
            }
        }
    }
}