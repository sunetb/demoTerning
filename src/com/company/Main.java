package com.company;

import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {


        Raflebæger yatsy = new Raflebæger();
        yatsy.ryst();
        System.out.println("Yatsy-bæger sum: " + yatsy.sum());
        System.out.println(yatsy.resultat());
        System.out.println(yatsy);
        System.out.println("Er der slået en sekser? "+ yatsy.erErDerSlåetEn(6));
        System.out.println("Antal seksere: " + yatsy.antalSlået(6));

        //array
        System.out.println("Fundne seksere (array):");
        Terning[] sekserterninger = yatsy.terningerMedSlag(6);
        for (int i = 0; i < sekserterninger.length; i++) {
            System.out.println("|" + sekserterninger[i] + "|");
        }
        //ArrayList
        System.out.println("Fundne seksere (ArrayList):");
        ArrayList<Terning> sekserterningerNem = yatsy.terningerMedSlagNem(6);
        for (int i = 0; i < sekserterningerNem.size(); i++) {
            System.out.println("|" + sekserterningerNem.get(i) + "|");
        }


        Raflebæger meyer = new Raflebæger(2);
        meyer.ryst();
        System.out.println("Mayer-bæger sum: " + meyer.sum());
        System.out.println(meyer.resultat());
        System.out.println("Meyer-bæger sum: " + meyer.sum());
        System.out.println(meyer);
        System.out.println("Er der slået en sekser? "+ meyer.erErDerSlåetEn(6));

    }

}
