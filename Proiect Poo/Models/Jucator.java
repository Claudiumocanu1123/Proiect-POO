package Models;

import java.util.List;

abstract public class Jucator {
    private List<Jucator> jucatorList;
    String nume;
    int viteza;
    int pasing;
    int defending;
    int shoting;
    int dribling;
    int forta;

    public Jucator(String nume, int viteza, int pasing, int shoting, int dribling, int forta, int i, int defending)
    {
        this.nume = nume;
        this.viteza = viteza;
        this.pasing = pasing;
        this.shoting = shoting;
        this.dribling = dribling;
        this.forta = forta;
        this.defending = defending;
    }
    public String getNume()
    {
        return nume;
    }
    public int getViteza()
    {
        return viteza;
    }
    public int getPasing()
    {
        return pasing;
    }
    public int getDefending()
    {
        return defending;
    }
    public int getShoting()
    {
        return shoting;
    }
    public int getDribling()
    {
        return dribling;
    }
    public int getForta()
    {
        return forta;
    }

    public String toString()
    {
        return nume;
    }
    public abstract int CalculeazaEficentaJucator(int numarMeciuriJucate);

}

