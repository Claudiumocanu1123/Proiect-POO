package Models;

class Fundas extends Jucator {
    public int nrDeposedari;

    public Fundas( String nume,int nrDeposedari,int pasing, int shoting, int dribling, int forta, int viteza,int defending) {
        super(nume,nrDeposedari,pasing,shoting,dribling,forta,viteza,defending);
        this.nrDeposedari = nrDeposedari;

    }
    public String getNume() {
        return nume;
    }
    public int getNrDeposedari() {
        return nrDeposedari;
    }
    public int CalculeazaEficentaJucator(int numarMeciur)
    {
        return nrDeposedari/numarMeciur;
    }
}