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
                // Tästä käynnistetään peli 1
            } else if (pelivalinta == 2) {
                //Tästä käynnistetään peli 2
            } else {
                System.out.println("Antamasi komento ei ole validi. Syötä 1 tai 2");
            }

        }
    }
}
