package com.company;

import java.util.Random;

public class Terning {

    private int slag = -1;
    Random r = new Random();

    public Terning (){
        kast();
        System.out.println("Konstruktøren blev kaldt");
    }

    void kast(){
        slag = r.nextInt(6)+1;
    }

    int getVærdi(){

       return slag;
    }



}
