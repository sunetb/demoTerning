package com.company;

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

        String resultat (){
                String res = "";
                for (Terning t : terninger){
                        res += " "+t.getVærdi();
                }
                return res;
        }

}
