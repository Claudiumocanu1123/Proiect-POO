package Models;

class Mijlocas extends Jucator {

    public int nrAsisturi;

    public Mijlocas(String nume,int nrAsisturi,int pasing,int shoting,int dribling,int forta,int viteza,int defending) {
        super(nume,nrAsisturi,pasing,shoting,dribling,forta,viteza,defending);
        this.nrAsisturi = nrAsisturi;
    }
    public int getNrAsisturi() {
        return nrAsisturi;
    }
    public String getNume() {
        return nume;
    }
    public int CalculeazaEficentaJucator(int numarMeciuriJucate)
    {
        return nrAsisturi/numarMeciuriJucate;
    }

}