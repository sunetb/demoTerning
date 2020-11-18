package com.company;

import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {


        Raflebæger yatzy = new Raflebæger();
        yatzy.ryst();
        System.out.println("Yatzy-bæger sum: " + yatzy.sum());
        System.out.println(yatzy.resultat());
        System.out.println(yatzy);
        System.out.println("Er der slået en sekser? "+ yatzy.erErDerSlåetEn(6));
        System.out.println("Antal seksere: " + yatzy.antalSlået(6));

        //array
        System.out.println("Fundne seksere (array):");
        Terning[] sekserterninger = yatzy.terningerMedSlag(6);
        for (int i = 0; i < sekserterninger.length; i++) {
            System.out.println("|" + sekserterninger[i] + "|");
        }
        //ArrayList
        System.out.println("Fundne seksere (ArrayList):");
        ArrayList<Terning> sekserterningerNem = yatzy.terningerMedSlagNem(6);
        for (int i = 0; i < sekserterningerNem.size(); i++) {
            System.out.println("|" + sekserterningerNem.get(i) + "|");
        }

        yatzy.sorter();

        Raflebæger meyer = new Raflebæger(2);
        meyer.ryst();
        System.out.println("Meyer-bæger sum: " + meyer.sum());
        System.out.println(meyer.resultat());
        System.out.println("Meyer-bæger sum: " + meyer.sum());
        System.out.println(meyer);
        System.out.println("Er der slået en sekser? "+ meyer.erErDerSlåetEn(6));

    }

}
