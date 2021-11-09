package com.company;

import java.util.ArrayList;
import java.util.Arrays;


public class Raflebæger {
        private Terning[] terninger;

        public Raflebæger (){
                terninger = new Terning[5];
                for (int i = 0; i < terninger.length; i++) {
                        Terning t = new Terning();
                        terninger[i] =t;
                 }
        }

        public Raflebæger (int antalTerninger){
                terninger = new Terning[antalTerninger];
                for (int i = 0; i < terninger.length; i++) {
                        terninger[i] = new Terning();
                }
        }

        void ryst(){
                for (Terning t : terninger){
                        t.kast();
                }
        }

        int sum (){
                int resultat = 0;
                for (Terning t : terninger){
                        resultat += t.getVærdi();
                }
                return resultat;
        }

        @Override
        public String toString() {
                String res = "Raflebæger: ";
                for (Terning t : terninger){
                        res += t + " ";
               }
                return res;
        }

        boolean erErDerSlåetEn(int slag){
                 for (Terning t : terninger){
                        if (t.getVærdi() == slag){
                               return true; //stopper med det samme hvis vi finder en
                        }
                }
                return false;
        }

        int antalSlået(int slag){
                int res = 0;
                for (Terning t : terninger){
                        if (t.getVærdi() == slag)
                                res++;
                }
                return res;
        }

      public Terning[] terningerMedSlag (int slag){

                //1: Tæl først hvor mange. Ellers ved vi ikke hvor lang listen skal være
                int antal = 0;
                for (Terning t : terninger){
                        if (t.getVærdi() == slag)
                                antal++;
                }

                //2: Opret array og kopier (referencer til) objekterne ind i den nye liste
                int index = 0;
                Terning[] resultat = new Terning[antal];
                for (int i = 0; i < terninger.length; i++) {
                        if (terninger[i].getVærdi() ==slag) {
                                resultat[index] = terninger[i];
                                index++;
                        }
                }
                return resultat;
        }

        ArrayList<Terning> terningerMedSlagNem (int slag){

                ArrayList<Terning> resultat = new ArrayList<>();
                //1: Læg dem i listen med det samme
                for (Terning t : terninger){
                        if (t.getVærdi() == slag)
                                resultat.add(t);
                }
                return resultat; //færdig
        }

        String resultat (){
                String res = "";
                for (Terning t : terninger){
                        res += " "+t.getVærdi();
                }
                return res;
        }

        boolean lilleStraight (){
                boolean straight = erErDerSlåetEn(1) && erErDerSlåetEn(2) && erErDerSlåetEn(3) && erErDerSlåetEn(4);
                return straight;
        }

        boolean par(int værdi){
                return antalSlået(værdi) > 1;
        }

        void sorter (){

                //Bubble sort

                //Til test
                System.out.println("Usorteret: ");
                System.out.println(resultat());
                System.out.println("__________________");
                long antalSammenligninger = 0;
                long starttid = System.currentTimeMillis();

                //Til optimering
                boolean byt = false;

                int længde = terninger.length;
                for (int i = 0; i < længde; i++) {
                        for (int j = 1; j < længde-i; j++) {

                                if(terninger[j-1].getVærdi() > terninger[j].getVærdi()){
                                        //byt
                                        Terning temp = terninger[j];
                                        terninger[j] = terninger[j-1];
                                        terninger[j-1] = temp;
                                        //byt = true; //Til optimering
                                        System.out.println(resultat() + "      Byt indeks: "+ (j-1) + " og " + j + "    (Loop: Ydre: i="+i + " Indre: j=" + j + ")" ); //til test
                                }
                                antalSammenligninger++;


                        }
                        //Optional: Har vi kørt en hel runde i ydre loop uden at bytte?
                        //if (!byt) break;
                        //else byt = false;
               }

                //Til test
                long sluttid = System.currentTimeMillis();
                System.out.println("Test sortering: " + resultat());
                System.out.println("Milisekunder: "+(sluttid-starttid));
                System.out.println("Sammenligninger: " + antalSammenligninger);
        }

        void sorterNem (){
                Arrays.sort(terninger);
                //kræver en compareTo() i Terningen-klassen
                // og "implements Comparable<Terning>"
        }

        void brugTestdata (int[] data){
                Terning[] testdata = new Terning[data.length];
                for (int i = 0; i < data.length; i++){
                        testdata[i] = new Terning(data[i]);
                }
                terninger = testdata;
        }


}
