package fi.academy;

import java.util.ArrayList;
import java.util.List;

public class KysymysOlio {

    private String kyssari;
    private List<String> vastaukset;
    private int oikeanVaihtoehdonIndex;

    public KysymysOlio(String kyssari){
        this.kyssari = kyssari;
        this.vastaukset = new ArrayList<>();

    }

    public String getKyssari() {
        return kyssari;
    }

    public void setKyssari(String kyssari) {
        this.kyssari = kyssari;
    }

    public List<String> getVastaukset() {
        return vastaukset;
    }

    public void setVastaukset(List<String> vastaukset) {
        this.vastaukset = vastaukset;
    }

    public int getOikeanVaihtoehdonIndex() {
        return oikeanVaihtoehdonIndex;
    }

    public void setOikeanVaihtoehdonIndex(int oikeanVaihtoehdonIndex) {
        this.oikeanVaihtoehdonIndex = oikeanVaihtoehdonIndex;
    }
    public void lisaaVastaus(String vastaus) {
        this.vastaukset.add(vastaus);
    }

    @Override
    public String toString() {
        return "Kysymys: " + kyssari +
                "\nVastausvaihtoehdot: " + vastaukset;
    }
}
