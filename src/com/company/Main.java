package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Raflebæger yatzy = new Raflebæger(500);
        yatzy.ryst();
        //int[] test = {9,8,7,6,5,4,3,2,1};
        //yatzy.brugTestdata(test);


        System.out.println("Yatzy-bæger sum: " + yatzy.sum());
        System.out.println(yatzy.resultat());
        System.out.println(yatzy);//toString
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

        System.out.println("\n Nu sorterer vi! \n");

        yatzy.sorter();
        //yatzy.sorterNem();
        //System.out.println(yatzy.resultat());

        System.out.println("\n"); //Printer et afsnitstegn (dvs to incl. println)

        if (yatzy.lilleStraight()) System.out.println("Der er slået en lille straight");
        else System.out.println("Der er IKKE slået en lille straight");

        System.out.println("Par 2? " + yatzy.par(2));


    }

}
