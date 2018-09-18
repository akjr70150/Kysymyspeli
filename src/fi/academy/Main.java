package fi.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tervetuloa laadukkaiden Java-pelien jännittävään maailmaan.");
        System.out.println("Muistathan, että Java-pelien pelaaminen voi olla hyvin koukuttavaa. Pelaa vastuullisesti");
        System.out.println("Valitse haluamasi peli: 1 tai 2");
        Scanner skanneri = new Scanner(System.in);
        while (true) {
            int pelivalinta = Integer.parseInt(skanneri.nextLine());
            if (pelivalinta == 1) {
                JavaVisa uusiVisa = new JavaVisa();
                uusiVisa.kaynnista();
            } else if (pelivalinta == 2) {
                Peli uusiPeli = new Peli();
                uusiPeli.kaynnistaPeli();
            } else {
                System.out.println("Antamasi komento ei ole validi. Syötä 1 tai 2");
            }

        }
    }
}
