package com.company;

import java.util.Random;

public class Terning implements Comparable<Terning>{

    private int antalSider = 6;
    private int slag = -1;
    Random r = new Random();


    public Terning (){
        kast();
    }

    public Terning (int værdi){
        slag = værdi;
    }

    public void kast(){
        slag = r.nextInt(antalSider)+1;
    }

    public int getVærdi(){
        return slag;
    }

    public void setVærdi(int i) throws SnydException{
        if (i > antalSider){
            throw new SnydException("Du snyder! Max værdi: "+antalSider + " Du prøver at sætte terningen til at vise "+i);
        }
        slag = i;
    }
    @Override
    public int compareTo(Terning anden){
        if (this.getVærdi() == anden.getVærdi()) return 0;
        else if(this.getVærdi() < anden.getVærdi()) return -1;
        return 1;
    }

    public boolean equals (Terning anden){
        return this.getVærdi() == anden.getVærdi();
    }

    @Override
    public String toString() {
        switch (slag){
            case 1 : return ".";
            case 2 : return "..";
            case 3 : return "...";
            case 4 : return "::";
            case 5 : return ":.:";
            case 6 : return ":::";
        }
        return "Fejl i terning toString() med værdien "+slag ;
    }
}
