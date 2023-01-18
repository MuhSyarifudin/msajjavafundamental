package com.juaracoding.msajjavafundamental.testharian.praktikum_1;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Syarifudin a.k.a. Muhamad Syarifudin
Java Developer
Created on 13/01/2023 19:15
@Last Modified 13/01/2023 19:15
Version 1.1
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        char chKata;
        int intX = 0;
        int intH = 0;
        String strKata = "";

        System.out.print("Masukan kata : ");
        strKata = sn.nextLine();
        for (int i = 0;i<strKata.length();i++){
            chKata = strKata.charAt(i);
            intX = chKata;
            if ( (intX>=32 && intX<=90) ) {
                intH += chKata;
            }
        }
        System.out.println("Hasil : "+intH);

    }
}
