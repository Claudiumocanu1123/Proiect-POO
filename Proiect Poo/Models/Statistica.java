package Models;

import java.util.ArrayList;
import java.util.List;

public class Statistica {
    private List<Atacant> atacantList;
    private List<Mijlocas> mijlocasList;
    private List<Fundas> fundasList;
    private List<Portar> portarList;
    private List<Jucator> jucators;
    public Statistica()
    {
        this.atacantList = new ArrayList<>();
        this.mijlocasList = new ArrayList<>();
        this.fundasList = new ArrayList<>();
        this.portarList = new ArrayList<>();
        this.jucators = new ArrayList<>();
    }

    public Atacant golgheter()
    {
        Atacant atacant = atacantList.get(0);
        if(atacantList.isEmpty())
            return null;
        else
            for(int i = 1; i < atacantList.size(); i++)
            {
                Atacant atacant1 = atacantList.get(i);
                if(atacant1.getNrGoluri() > atacant.getNrGoluri())
                    atacant = atacant1;
            }
            return atacant;
    }

    public Mijlocas asistar()
    {
        Mijlocas asistar = mijlocasList.get(0);
        if(mijlocasList.isEmpty()) {
            return null;
        } else
            for(int i = 0; i < mijlocasList.size(); i++)
            {
                Mijlocas mijlocas = mijlocasList.get(i);
                if(asistar.getNrAsisturi() < mijlocas.getNrAsisturi())
                    asistar = mijlocas;
            }
            return asistar;
    }

    public Fundas fundas()
    {

        if(fundasList.isEmpty())
            return null;
        else {
            Fundas fundas = fundasList.get(0);
            for (int i = 0; i < fundasList.size(); i++) {
                Fundas fundas1 = fundasList.get(i);
                if (fundas1.getNrDeposedari() > fundas.getNrDeposedari())
                    fundas = fundas1;
            }
            return fundas;
        }
    }

    public Portar portar()
    {
        if(fundasList.isEmpty())
            return null;
        else
        {
        Portar portar = portarList.get(0);
        for(int i = 0; i < portarList.size(); i++) {
            Portar portar1 = portarList.get(i);
            if(portar1.getNrParade() > portar.getNrParade())
                portar = portar1;
        }
        return portar;
        }
    }
    public void afiseazaJucator()
    {
        System.out.println("Echipa turneului este: ");
        for(int i = 0; i < jucators.size(); i++) {
            System.out.println(jucators.get(i).toString());
        }
    }

public void adaugaAtacant(Atacant atacant) {
    atacantList.add(atacant);
}
public void adaugaMijlocas(Mijlocas mijlocas) {
    mijlocasList.add(mijlocas);
}
public void adaugaFundas(Fundas fundas) {
    fundasList.add(fundas);
}
public void adaugaPortar(Portar portar) {
    portarList.add(portar);
}
public void adaugaJucator(Jucator jucator) {
        jucators.add(jucator);

}
}






