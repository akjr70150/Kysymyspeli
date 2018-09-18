package fi.academy;

import java.util.ArrayList;
import java.util.Collections;

public class KysymysLista {

    private ArrayList<KysymysOlio> lista;

    public ArrayList<KysymysOlio> getLista() {
        alustaLista();
        return lista;
    }

    public void alustaLista() {
        ArrayList<KysymysOlio> kysymysList = new ArrayList<>();
        this.lista = kysymysList;

        KysymysOlio yks = new KysymysOlio("Voiko luoda ilmentymiä Javan rajapinoista?");
        yks.lisaaVastaus("1) Kyllä voi");
        yks.lisaaVastaus("2) Ei voi");
        yks.lisaaVastaus("3) Vain silloin kun on olemassa luokka, joka toteuttaa kyseisen rajapinnan");
        yks.setOikeanVaihtoehdonIndex(1);


        KysymysOlio kaksi = new KysymysOlio ("Mitä FileReader tekee?");
        kaksi.lisaaVastaus("1) Lukee tiedostosta");
        kaksi.lisaaVastaus("2) Avaa tiedoston");
        kaksi.lisaaVastaus("3) Kirjoittaa tiedostoon");
        kaksi.setOikeanVaihtoehdonIndex(1);

        KysymysOlio kolme = new KysymysOlio ("Mikä on HashMapin kantarajapinta?");
        kolme.lisaaVastaus("1) List");
        kolme.lisaaVastaus("2) Collection");
        kolme.lisaaVastaus("3) Map");
        kolme.setOikeanVaihtoehdonIndex(2);

        KysymysOlio nelja = new KysymysOlio ("Miten saat selville taulukossa olevien alkioiden määrän?");
        nelja.lisaaVastaus("1) .length");
        nelja.lisaaVastaus("2) .length()");
        nelja.lisaaVastaus("3) .size()");
        nelja.setOikeanVaihtoehdonIndex(0);


        KysymysOlio viisi = new KysymysOlio ("Mitä rajapintaa käytetään kokoelmien yhteydessä niiden läpikäyntiin?");
        viisi.lisaaVastaus("1) Iterator");
        viisi.lisaaVastaus("2) for each");
        viisi.lisaaVastaus("3) Scanner");
        viisi.setOikeanVaihtoehdonIndex(0);

        KysymysOlio kuusi = new KysymysOlio ("Mikä on konstruktorin paluutyyppi?");
        kuusi.lisaaVastaus("1) Object");
        kuusi.lisaaVastaus("2) Konstruktorilla ei ole paluutyyppiä");
        kuusi.lisaaVastaus("3) Konstruktorilla ei ole pauutyyppiä, mutta sillä on void-määritys");
        kuusi.setOikeanVaihtoehdonIndex(1);

        KysymysOlio seiska = new KysymysOlio ("Mitä sanaa tulee käyttää, että luokka perii toisen luokan?");
        seiska.lisaaVastaus("1) Inherits ");
        seiska.lisaaVastaus("2) Implements");
        seiska.lisaaVastaus("3) Extends ");
        seiska.setOikeanVaihtoehdonIndex(2);

        kysymysList.add(yks);
        kysymysList.add(kaksi);
        kysymysList.add(kolme);
        kysymysList.add(nelja);
        kysymysList.add(viisi);
        kysymysList.add(kuusi);
        kysymysList.add(seiska);



        Collections.shuffle(kysymysList);
    }
}
