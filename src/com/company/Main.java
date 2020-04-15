package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        double t;
        System.out.println("Podaj liczbę a: ");
        double a=scan.nextDouble();
        System.out.println("Podaj liczbe b: ");
        double b=scan.nextDouble();

        t=a;
        a=b;
        b=t;

        System.out.println("a = " + a + ", b = " +b );

    }
}




