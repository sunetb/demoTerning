package com.company;

import java.util.Random;

public class Terning {

    private int slag = -1;
    Random r = new Random();

    public Terning (){
        kast();
    }

    void kast(){
        slag = r.nextInt(6)+1;
    }

    int getVærdi(){

       return slag;
    }

    @Override
    public String toString() {
        switch (slag){
            case 1 : return ".";
            case 2 : return "..";
            case 3 : return "...";
            case 4 : return "::";
            case 5 : return ":.:";
            case 6: return ":::";
        }
        return "Fejl i terning toString() med værdien "+slag ;
    }
}
