package Models;

 class Atacant extends Jucator {
    int nrGoluri;

    public Atacant(String nume,int nrGoluri,int shoting,int pasing,int dribling,int forta,int viteza,int defending) {
        super(nume,nrGoluri,shoting,pasing,dribling,forta,viteza,defending);
        this.nrGoluri = nrGoluri;
    }
    public int getNrGoluri() {
        return nrGoluri;
    }
    public String getNume()
    {
        return nume;
    }
    public int CalculeazaEficentaJucator(int numarMeciuriJucate) {
        return nrGoluri/numarMeciuriJucate;
    }

}