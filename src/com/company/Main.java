package com.company;

public class Main {


    String [] humørord = {"glad", "sur", "osv"};

    public static void main(String[] args) {

        Raflebæger yatsy = new Raflebæger();
        yatsy.ryst();
        System.out.println("Yatsy-bæger sum: " + yatsy.sum());
        System.out.println(yatsy.resultat());


        Raflebæger meyer = new Raflebæger(2);
        meyer.ryst();
        System.out.println("Mayer-bæger sum: " + meyer.sum());
        System.out.println(meyer.resultat());
    }

}
