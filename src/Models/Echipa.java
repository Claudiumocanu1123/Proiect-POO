package Models;

import java.util.ArrayList;
import java.util.List;

public class Echipa {

    String nume;
    public List<Jucator> jucators;
    int puncte;

    public Echipa(String nume,int puncte) {
        this.nume = nume;
        this.jucators = new ArrayList<>();
        this.puncte = puncte;
    }
    public void adaugaJucator(Jucator jucator) {
        jucators.add(jucator);
    }
    public List<Jucator> getJucators() {
        return jucators;
    }
    public String getNume()
        {
            return nume;
        }
     public String toString() {
        return nume;
     }
    public int getPuncte()
    {
        return puncte;
    }
    public int medieEchipa()
    {
        int media = 0;
        for(int i = 0; i<jucators.size(); i++)
        {
            media = (media + jucators.get(i).getViteza()+jucators.get(i).getDefending()+jucators.get(i).getPasing()+jucators.get(i).getShoting()+jucators.get(i).getForta()+jucators.get(i).getDribling());
        }
        media = media /6;
        return media;
    }
}









