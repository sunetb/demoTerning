package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Raflebæger {
        Terning[] terninger;

        public Raflebæger (){
                terninger = new Terning[5];
                for (int i = 0; i < terninger.length; i++) {
                        terninger[i] = new Terning();
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
                return "Raflebæger{" +
                        "terninger=" + Arrays.toString(terninger) +
                        '}';
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

                return resultat;
        }
        String resultat (){
                String res = "";
                for (Terning t : terninger){
                        res += " "+t.getVærdi();
                }
                return res;
        }

}
