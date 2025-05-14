package Models;

class Portar extends Jucator {
    public int nrParade;

    public Portar( String nume,int nrParade,int pasing,int shoting,int dribling,int forta,int viteza,int defending) {
        super(nume,nrParade,pasing,shoting,dribling,forta,viteza,defending);
        this.nrParade = nrParade;
    }
    public String getNume() {
        return nume;
    }
    public int getNrParade() {
        return nrParade;
    }
    public int CalculeazaEficentaJucator(int numarMeciur)
    {
        return nrParade/numarMeciur;
    }
}
