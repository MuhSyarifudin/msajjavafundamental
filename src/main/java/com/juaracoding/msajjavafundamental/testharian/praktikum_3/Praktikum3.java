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
        String strA = "";
        char strB;
        int intAngkaRandom = 0;
        do {
            intAngkaRandom = ran.nextInt(25);
        } while (intAngkaRandom < 12);

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < intAngkaRandom; i++) {
                if (i < 7) {
                    if (i == 0) {
                        String strHrfawl = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                        int intHrfAwl = ran.nextInt(26);
                        strB = strHrfawl.charAt(intHrfAwl);
                        strA = String.valueOf(strB);
//                        System.out.println("Karakter yang dihasilkan dari angka random "+intAngkaRandom);
                        System.out.print(strHrfawl.charAt(intHrfAwl));
                    } else if (i < 7) {
                        if (strA.equals("A") || strA.equals("I") || strA.equals("U") || strA.equals("E") || strA.equals("O")) {
                            if (i % 2 == 0) {
                                String strVokal = "aiueo";
                                int intVokal = ran.nextInt(5);
                                System.out.print(strVokal.charAt(intVokal));
                            } else {
                                String strKonsonan = "bcdfghjklmnpqrstvwxyz";
                                int intKonsonan = ran.nextInt(21);
                                System.out.print(strKonsonan.charAt(intKonsonan));
                            }
                        } else {
                            if (i % 2 == 0) {
                                String strKonsonan = "bcdfghjklmnpqrstvwxyz";
                                int intKonsonan = ran.nextInt(21);
                                System.out.print(strKonsonan.charAt(intKonsonan));
                            } else {
                                String strVokal = "aiueo";
                                int intVokal = ran.nextInt(5);
                                System.out.print(strVokal.charAt(intVokal));
                            }
                        }
                    }
                } else {
                    if (i % 2 == 0) {
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
            System.out.println();
        }
    }
}
