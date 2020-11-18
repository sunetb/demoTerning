package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Raflebæger {
        Terning[] terninger;

        public Raflebæger (){
                terninger = new Terning[5];

                for (int i = 0; i < terninger.length; i++) {
                        Terning t = new Terning();
                        terninger[i] =t;

                 }

        }
        Raflebæger (int antalTerninger){
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
                                return true;
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







        Terning[] terningerMedSlag (int slag){

                //1: Tæl hvor mange
                int res = 0;
                for (Terning t : terninger){
                        if (t.getVærdi() == slag)
                                res++;
                }

                //2: Opret array og kopier referencer til objekterne over
                int index = 0;
                Terning[] resultat = new Terning[res];
                for (int i = 0; i < terninger.length; i++) {
                        if (terninger[i].getVærdi() == slag) {
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

                // 2,3,4,5
                        if (resultat.size() == 0) return new ArrayList<Terning>();
                        Terning t = resultat.get(0);
                        resultat.remove(0);
                        resultat.add(t);

                return resultat;
        }





        String resultat (){
                String res = "";
                for (Terning t : terninger){
                        res += " "+t.getVærdi();
                }
                return res;
        }

        void sorter (){

                //Bubble

                boolean byt = false;

                long starttid = System.currentTimeMillis();

                for (int grænse = terninger.length-1; grænse >= 0; grænse--) {
                        for (int j = 0; j < grænse; j++) {
                                Terning temp = terninger[j];
                                if(j < terninger.length && temp.getVærdi() > terninger[j+1].getVærdi()){

                                        //byt
                                        terninger[j] = terninger[j+1];
                                        terninger[j+1] = temp;
                                        byt = true;

                                }

                        }
                        //Optional: Har vi kørt en hel runde uden at bytte nogen?
                        if (byt = false) break;
                        byt = false;
                }
                long sluttid = System.currentTimeMillis();
                System.out.println("Antal milisekunder: "+(sluttid-starttid));
                System.out.println("Test sortering: " + resultat());
        }

}
