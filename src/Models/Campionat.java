package Models;
import java.util.ArrayList;
import java.util.List;
public class Campionat {
    String nume;
    List<Echipa> echipe;

    public Campionat(String nume) {
        this.nume = nume;
        this.echipe = new ArrayList<Echipa>();
    }

    public void adaugaEchipa(Echipa e) {
        echipe.add(e);
    }

    public String getNume() {
        return nume;
    }

    public List<Echipa> getEchipa() {
        return echipe;
    }

    public Echipa calculareIesiredinGrupa() {
        Echipa echipa = echipe.get(0);
        for (int i = 0; i < echipe.size(); i++) {
            Echipa echipa1 = echipe.get(i);
            if (echipa.getPuncte() < echipa1.getPuncte())
                echipa = echipa1;
        }
        return echipa;
    }
}
