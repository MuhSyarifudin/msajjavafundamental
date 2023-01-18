package com.juaracoding.msajjavafundamental.testharian.praktikum_3;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Syarifudin a.k.a. Muhamad Syarifudin
Java Developer
Created on 19/01/2023 22:31
@Last Modified 19/01/2023 22:31
Version 1.1
*/

import java.util.Random;
public class Praktikum3 {
    /*
	Soal Nomor 2 Praktikum 3 Java Fundamental
    */
    public static void main(String[] args) {
        Random ran = new Random();
        int intAngkaRandom = 0;
        do {
        intAngkaRandom = ran.nextInt(25);
        } while (intAngkaRandom<12);

        for (int i = 0; i < intAngkaRandom;i++){

            if (i == 0) {
                String strHrfawl = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                int intHrfAwl = ran.nextInt(26);
                System.out.print(strHrfawl.charAt(intHrfAwl));
            }
            else if (i>0){
                if (i%2==0) {
                    String strKonsonan = "abcdefghijklmnopqrstuvwxyz";
                    int intKonsonan = ran.nextInt(26);
                    System.out.print(strKonsonan.charAt(intKonsonan));
                } else {
                    String strVokal = "aiueo";
                    int intVokal = ran.nextInt(5);
                    System.out.print(strVokal.charAt(intVokal));
                }
            }
        }

    }
}
