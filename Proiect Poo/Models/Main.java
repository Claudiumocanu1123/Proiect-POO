package Models;

public class Main {
    public static void main(String[] args) {
        Statistica worldCup = new Statistica();
        Echipa echipa1 = new Echipa("Spania", 9);
        Echipa echipa2 = new Echipa("Portugalia",6);
        Echipa echipa3 = new Echipa("Maroco",6);
        Echipa echipa4 = new Echipa("Romania",12);



        //Echipa1 Spania
        Atacant morata = new Atacant("Morata",2, 80, 90, 95, 72, 70, 50);
        Atacant yamal = new Atacant("Yamal",9, 80, 80, 90, 100, 100, 100);
        Mijlocas pedri = new Mijlocas("Pedri", 6,80,90,95,72,70,50);
        Mijlocas gavi = new Mijlocas("Gavi",8,90,95,94,72,71,59);
        Mijlocas olmo = new Mijlocas("Olmo",6,70,60,96,79,79,59);
        Mijlocas casado = new Mijlocas("Casado",9,80,90,95,72,70,50);
        Fundas puyol = new Fundas("Puyol",1,70,80,56,91,95,96);
        Fundas ramos = new Fundas("Ramos",5,98,91,41,51,98,99 );
        Fundas carvajal = new Fundas("Carvajal",1,70,80,56,91,95,96);
        Fundas Alba = new Fundas("Alba",1,70,80,56,91,95,96);
        Portar Casillas = new Portar("Casillas",1,70,80,56,91,95,96);
        echipa1.adaugaJucator(morata);
        echipa1.adaugaJucator(yamal);
        echipa1.adaugaJucator(pedri);
        echipa1.adaugaJucator(gavi);
        echipa1.adaugaJucator(olmo);
        echipa1.adaugaJucator(casado);
        echipa1.adaugaJucator(puyol);
        echipa1.adaugaJucator(ramos);
        echipa1.adaugaJucator(carvajal);
        echipa1.adaugaJucator(Alba);
        echipa1.adaugaJucator(Casillas);
        System.out.println("Lotul primei echipe este: ");
        for(int i = 0; i < echipa1.getJucators().size(); i++)
            System.out.println(echipa1.getJucators().get(i));

        //Echipa2 Portugalia
        Atacant Ronaldo = new Atacant("Ronaldo",2, 99, 95, 96, 96, 92, 91);
        Atacant Leao = new Atacant("Leao",9, 80, 80, 90, 97, 98, 91);
        Mijlocas Vitinha = new Mijlocas("Vitinha", 6,86,70,55,42,40,80);
        Mijlocas Paulista = new Mijlocas("Paulista",8,90,95,94,72,71,59);
        Mijlocas Renato = new Mijlocas("Renato",6,70,60,96,79,79,59);
        Mijlocas Perreira = new Mijlocas("Perreira",9,80,90,95,72,70,50);
        Fundas Pepe = new Fundas("Pepe",1,70,80,56,91,95,96);
        Fundas Dias = new Fundas("Dias",5,98,91,41,51,98,99 );
        Fundas Semedo = new Fundas("Semedo",1,70,80,56,91,95,96);
        Fundas Mendes = new Fundas("Mendes",1,70,80,56,91,95,96);
        Portar Digo = new Portar("Diogo",1,70,80,56,91,95,96);
        echipa2.adaugaJucator(Ronaldo);
        echipa2.adaugaJucator(Vitinha);
        echipa2.adaugaJucator(Paulista);
        echipa2.adaugaJucator(Renato);
        echipa2.adaugaJucator(Leao);
        echipa2.adaugaJucator(Perreira);
        echipa2.adaugaJucator(Pepe);
        echipa2.adaugaJucator(Dias);
        echipa2.adaugaJucator(Semedo);
        echipa2.adaugaJucator(Mendes);
        echipa2.adaugaJucator(Digo);
        System.out.println("Lotul celei de a doua echipe este: ");
        for(int i = 0; i < echipa2.getJucators().size(); i++)
            System.out.println(echipa2.getJucators().get(i));




        //Echipa3 Marroco
        Atacant Igamane = new Atacant("Igamane",2, 80, 90, 95, 72, 70, 50);
        Atacant Rahimi = new Atacant("Rahimi",9, 80, 80, 90, 100, 100, 100);
        Mijlocas Amrabat = new Mijlocas("Amrabat", 6,80,90,95,72,70,50);
        Mijlocas Belammari = new Mijlocas("Belammari",8,90,95,94,72,71,59);
        Mijlocas Nadir = new Mijlocas("Nadir",6,70,60,96,79,79,59);
        Mijlocas Adli = new Mijlocas("Adli",9,80,90,95,72,70,50);
        Fundas Hakimi = new Fundas("Hakimi",1,70,80,56,91,95,96);
        Fundas Mazraoui = new Fundas("Mazraoui",5,98,91,41,51,98,99 );
        Fundas Aguerd = new Fundas("Aguerd",1,70,80,56,91,95,96);
        Fundas Aznou = new Fundas("Aznou",1,70,80,56,91,95,96);
        Portar Bono = new Portar("Bono",1,70,80,56,91,95,96);
        echipa3.adaugaJucator(Igamane);
        echipa3.adaugaJucator(Rahimi);
        echipa3.adaugaJucator(Amrabat);
        echipa3.adaugaJucator(Belammari);
        echipa3.adaugaJucator(Nadir);
        echipa3.adaugaJucator(Adli);
        echipa3.adaugaJucator(Hakimi);
        echipa3.adaugaJucator(Mazraoui);
        echipa3.adaugaJucator(Aguerd);
        echipa3.adaugaJucator(Aznou);
        echipa3.adaugaJucator(Bono);
        System.out.println("Lotul celei de a treia echipe este: ");
        for(int i = 0; i < echipa3.getJucators().size(); i++)
            System.out.println(echipa3.getJucators().get(i));



        //Echipa4 Romania
        Atacant Alibec = new Atacant("Alibec",2, 80, 90, 95, 72, 70, 50);
        Atacant Coman = new Atacant("Coman",9, 80, 80, 90, 100, 100, 100);
        Mijlocas Chipciu = new Mijlocas("Chipchiu", 6,80,90,95,72,70,50);
        Mijlocas Hagi = new Mijlocas("Hagi",8,90,95,94,72,71,59);
        Mijlocas Stanciu = new Mijlocas("Stanciu",6,70,60,96,79,79,59);
        Mijlocas Dragomir = new Mijlocas("Dragomir",9,80,90,95,72,70,50);
        Fundas Dragusin = new Fundas("Dragusin",1,70,80,56,91,95,96);
        Fundas Ratiu = new Fundas("Ratiu",5,98,91,41,51,98,99 );
        Fundas Manea = new Fundas("Manea",1,70,80,56,91,95,96);
        Fundas Burca = new Fundas("Burca",1,70,80,56,91,95,96);
        Portar Nita = new Portar("Nita",1,70,80,56,91,95,96);
        echipa4.adaugaJucator(Alibec);
        echipa4.adaugaJucator(Coman);
        echipa4.adaugaJucator(Chipciu);
        echipa4.adaugaJucator(Hagi);
        echipa4.adaugaJucator(Stanciu);
        echipa4.adaugaJucator(Dragomir);
        echipa4.adaugaJucator(Dragusin);
        echipa4.adaugaJucator(Ratiu);
        echipa4.adaugaJucator(Manea);
        echipa4.adaugaJucator(Burca);
        echipa4.adaugaJucator(Nita);
        System.out.println("Lotul celei de a patra echipa este: ");
        for(int i = 0; i < echipa4.getJucators().size(); i++)
            System.out.println(echipa4.getJucators().get(i));



        // Echipa 5 - Germania
        Echipa echipa5 = new Echipa("Germania",12);
        echipa5.adaugaJucator(new Atacant("Müller", 5, 85, 80, 88, 76, 79, 60));
        echipa5.adaugaJucator(new Atacant("Werner", 7, 90, 77, 90, 75, 88, 55));
        echipa5.adaugaJucator(new Mijlocas("Kroos", 6, 93, 75, 80, 65, 68, 65));
        echipa5.adaugaJucator(new Mijlocas("Gündogan", 5, 85, 80, 85, 70, 75, 60));
        echipa5.adaugaJucator(new Mijlocas("Musiala", 4, 88, 82, 90, 68, 80, 58));
        echipa5.adaugaJucator(new Mijlocas("Goretzka", 6, 82, 78, 75, 85, 82, 70));
        echipa5.adaugaJucator(new Fundas("Süle", 3, 70, 60, 65, 88, 74, 90));
        echipa5.adaugaJucator(new Fundas("Tah", 2, 72, 58, 63, 85, 73, 89));
        echipa5.adaugaJucator(new Fundas("Schlotterbeck", 4, 76, 55, 67, 82, 78, 85));
        echipa5.adaugaJucator(new Fundas("Hummels", 3, 68, 60, 65, 86, 70, 88));
        echipa5.adaugaJucator(new Portar("Neuer", 10, 60, 45, 50, 90, 68, 92));
        System.out.println("Lotul echipei 5 este:");
        for (Jucator j : echipa5.getJucators())
            System.out.println(j);



        // Echipa 6 - Argentina
        Echipa echipa6 = new Echipa("Argentina",9);
        echipa6.adaugaJucator(new Atacant("Messi", 10, 95, 85, 99, 70, 85, 40));
        echipa6.adaugaJucator(new Atacant("Lautaro", 6, 88, 78, 85, 74, 83, 45));
        echipa6.adaugaJucator(new Mijlocas("De Paul", 5, 85, 72, 82, 78, 82, 62));
        echipa6.adaugaJucator(new Mijlocas("Paredes", 4, 80, 68, 75, 76, 78, 65));
        echipa6.adaugaJucator(new Mijlocas("Lo Celso", 3, 78, 65, 80, 74, 77, 60));
        echipa6.adaugaJucator(new Mijlocas("Enzo", 4, 82, 70, 77, 79, 80, 63));
        echipa6.adaugaJucator(new Fundas("Otamendi", 2, 65, 55, 60, 84, 68, 90));
        echipa6.adaugaJucator(new Fundas("Tagliafico", 3, 72, 60, 67, 76, 75, 85));
        echipa6.adaugaJucator(new Fundas("Romero", 2, 70, 58, 62, 82, 74, 88));
        echipa6.adaugaJucator(new Fundas("Montiel", 3, 68, 54, 66, 78, 76, 87));
        echipa6.adaugaJucator(new Portar("Emiliano", 9, 62, 40, 45, 88, 70, 91));
        System.out.println("Lotul echipei 6 este:");
        for (Jucator j : echipa6.getJucators())
            System.out.println(j);


        // Echipa 7 - Anglia
        Echipa echipa7 = new Echipa("Anglia",1);
        echipa7.adaugaJucator(new Atacant("Kane", 8, 88, 85, 87, 75, 78, 50));
        echipa7.adaugaJucator(new Atacant("Rashford", 7, 90, 76, 88, 72, 91, 52));
        echipa7.adaugaJucator(new Mijlocas("Bellingham", 5, 86, 77, 85, 80, 83, 67));
        echipa7.adaugaJucator(new Mijlocas("Foden", 4, 89, 79, 90, 74, 82, 55));
        echipa7.adaugaJucator(new Mijlocas("Mount", 3, 82, 74, 84, 72, 80, 58));
        echipa7.adaugaJucator(new Mijlocas("Rice", 6, 80, 70, 75, 86, 77, 72));
        echipa7.adaugaJucator(new Fundas("Walker", 4, 76, 60, 68, 80, 90, 88));
        echipa7.adaugaJucator(new Fundas("Stones", 2, 70, 58, 64, 85, 76, 87));
        echipa7.adaugaJucator(new Fundas("Maguire", 3, 65, 55, 60, 82, 70, 85));
        echipa7.adaugaJucator(new Fundas("Shaw", 3, 68, 60, 67, 81, 75, 86));
        echipa7.adaugaJucator(new Portar("Pickford", 9, 60, 45, 50, 85, 70, 90));
        System.out.println("Lotul echipei 7 este:");
        for (Jucator j : echipa7.getJucators())
            System.out.println(j);



        // Echipa 8 - Franța
        Echipa echipa8 = new Echipa("Franta",6);
        echipa8.adaugaJucator(new Atacant("Mbappe", 12, 98, 80, 99, 75, 100, 50));
        echipa8.adaugaJucator(new Atacant("Giroud", 6, 84, 78, 85, 78, 75, 45));
        echipa8.adaugaJucator(new Mijlocas("Griezmann", 7, 88, 82, 87, 72, 80, 60));
        echipa8.adaugaJucator(new Mijlocas("Rabiot", 4, 80, 70, 76, 79, 78, 65));
        echipa8.adaugaJucator(new Mijlocas("Camavinga", 5, 82, 75, 80, 81, 84, 67));
        echipa8.adaugaJucator(new Mijlocas("Tchouaméni", 4, 78, 70, 72, 85, 77, 70));
        echipa8.adaugaJucator(new Fundas("Varane", 2, 72, 60, 65, 88, 76, 90));
        echipa8.adaugaJucator(new Fundas("Koundé", 3, 74, 60, 68, 82, 80, 87));
        echipa8.adaugaJucator(new Fundas("Hernandez", 3, 76, 58, 69, 84, 82, 88));
        echipa8.adaugaJucator(new Fundas("Upamecano", 2, 70, 56, 65, 86, 79, 89));
        echipa8.adaugaJucator(new Portar("Maignan", 10, 65, 48, 55, 87, 72, 93));
        System.out.println("Lotul echipei 8 este:");
        for (Jucator j : echipa7.getJucators())
            System.out.println(j);


        Campionat grupa1 = new Campionat("Grupa1");
                grupa1.adaugaEchipa(new Echipa("Spania",9));
                grupa1.adaugaEchipa(new Echipa("Portugalia",6));
                grupa1.adaugaEchipa(new Echipa("Morroco",6));
                grupa1.adaugaEchipa(new Echipa("Romania",12));
          System.out.println("Echipa care a reusit sa iasa din grupa 1 este");
          Echipa e1 =  grupa1.calculareIesiredinGrupa();
             System.out.println(e1.toString());


        Campionat grupa2 = new Campionat("Grupa2");
            grupa2.adaugaEchipa(new Echipa("Germania",6));
            grupa2.adaugaEchipa(new Echipa("Argentina",12));
            grupa2.adaugaEchipa(new Echipa("France",6));
            grupa2.adaugaEchipa(new Echipa("Anglia",8));
        System.out.println("Echipa care a reusit sa iasa din grupa 2 este");
        Echipa e2 = grupa2.calculareIesiredinGrupa();
         System.out.println(e2.toString());


        int rezultatRomania = echipa4.medieEchipa();
        int rezultatArgentina = echipa6.medieEchipa();
        System.out.println("Rezultatul romaniei este: "+rezultatRomania);
        System.out.println("Rezultatul argentina este: "+rezultatArgentina);
        if(rezultatRomania > rezultatArgentina)
            System.out.println("Romania este Campiona Mondiala la fotbal");
        else
            System.out.println("Argentina este Campiona Mondiala la fotbal");


        worldCup.adaugaAtacant(new Atacant("Messi", 2, 80, 90, 95, 72, 70, 50));
        worldCup.adaugaAtacant(new Atacant("Ronaldo", 9, 80, 80, 90, 100, 100, 100));
        worldCup.adaugaAtacant(new Atacant("Cavani", 4, 92, 90, 91, 89, 76, 78));
        worldCup.adaugaAtacant(new Atacant("Ibrahimovic", 5, 80, 98, 96, 82, 91, 90));
        worldCup.adaugaAtacant(new Atacant("Neymar", 6, 80, 90, 95, 72, 70, 50));

        worldCup.adaugaMijlocas(new Mijlocas("modric", 6,80,90,95,72,70,50));
        worldCup.adaugaMijlocas(new Mijlocas("pedri", 8,90,95,94,72,71,59));
        worldCup.adaugaMijlocas(new Mijlocas("benzema",6,70,60,96,79,79,59));
        worldCup.adaugaMijlocas(new Mijlocas("gabit",9,80,90,95,72,70,50));

        worldCup.adaugaFundas(new Fundas("Puyol",1,70,80,56,91,95,96));
        worldCup.adaugaFundas(new Fundas("Ratiu",2,56,75,76,75,79,91));
        worldCup.adaugaFundas(new Fundas("Cannavaro",4,91,94,93,82,81,80));
        worldCup.adaugaFundas(new Fundas("Ramos",5,98,91,41,51,98,99));

        worldCup.adaugaPortar(new Portar("Martinez",9,76,79,76,80,91,82));
        worldCup.adaugaPortar(new Portar("Donnaruma",8,80,82,83,84,85,86));
        worldCup.adaugaPortar(new Portar("Neur",12,78,92,83,76,89,98));
        worldCup.adaugaPortar(new Portar("Casillas",13,70,70,80,81,89,98));

        worldCup.adaugaJucator(new Atacant("Ronaldo",9,80,80,90,100,100,100));
        worldCup.adaugaJucator(new Atacant("Messi", 2,80,90,95,72,70,50));
        worldCup.adaugaJucator(new Mijlocas("modric", 6,80,90,95,72,70,50));
        worldCup.adaugaJucator(new Mijlocas("pedri", 8,90,95,94,72,71,59));
        worldCup.adaugaJucator(new Mijlocas("benzema",6,70,60,96,79,79,59));
        worldCup.adaugaJucator(new Mijlocas("gabit",9,80,90,95,72,70,50));
        worldCup.adaugaJucator(new Fundas("Puyol",1,70,80,56,91,95,96));
        worldCup.adaugaJucator(new Fundas("Ratiu",2,56,75,76,75,79,91));
        worldCup.adaugaJucator(new Fundas("Cannavaro",4,91,94,93,82,81,80));
        worldCup.adaugaJucator(new Fundas("Ramos",5,98,91,41,51,98,99));
        worldCup.adaugaJucator(new Portar("Casillas",13,70,70,80,81,89,98));




        Atacant a1 = worldCup.golgheter();
        Mijlocas m1 = worldCup.asistar();
        Fundas f1 = worldCup.fundas();
        Portar p1 = worldCup.portar();

        Atacant a2 = new Atacant("Alibec", 30,80,90,95,72,70,50);
        Mijlocas m2 = new Mijlocas("Stanciu",20,80,98,98,72,70,50);
        Fundas f2 = new Fundas("Dragusin", 100,81,80,87,86,89,87);
        Portar p2 = new Portar("Nita",50,90,71,82,83,84,85);


        System.out.println("Atcantul Romaniei: "+a2.getNume()+"a avut o eficenta la mondial destul de buna si aceasta este: " + a2.CalculeazaEficentaJucator(10));
        System.out.println("Mijlocasul Romaniei: "+m2.getNume()+"a avut o eficenta la mondial destul de buna si aceasta este: " + m2.CalculeazaEficentaJucator(10));
        System.out.println("Fundasul Romaniei: "+f2.getNume()+"a avut o eficenta la mondial destul de buna si aceasta este: " + f2.CalculeazaEficentaJucator(10));
        System.out.println("Portarul Romaniei: "+p2.getNume()+"a avut o eficenta la mondial destul de buna si aceasta este: " + p2.CalculeazaEficentaJucator(10));



        System.out.println("Cel mai bun marcator de la campionatul mondial de fotbal este: " + a1.getNume());
        System.out.println("Cel mai bun mijlocas de la campionarul mondial de fotbal este: " + m1.getNume());
        System.out.println("Cel mai bun fundas de la campionarul mondial de fotbal este: " + f1.getNume());
        System.out.println("Cel mai bun portar de la campionatul Mondial este: " + p1.getNume());
        worldCup.afiseazaJucator();


    }
}
