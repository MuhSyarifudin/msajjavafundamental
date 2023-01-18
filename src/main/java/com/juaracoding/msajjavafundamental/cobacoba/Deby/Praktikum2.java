package com.juaracoding.msajjavafundamental.cobacoba.Deby;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Syarifudin a.k.a. Muhamad Syarifudin
Java Developer
Created on 19/01/2023 22:50
@Last Modified 19/01/2023 22:50
Version 1.1
*/

import java.util.Scanner;

    public class Praktikum2 {
        /*
        Soal Nomor 1 Praktikum 2 Java Fundamental
        */
        public static void main(String[] args) {

            //deklarasi dan inisialisasi
            Scanner sc = new Scanner(System.in);
            int i = 0, n=0,x;
            double jum = 0.0,doJmlhAngka = 0.0,rata;

            try {
                System.out.print("Masukkan jumlah angka: ");
                n = sc.nextInt();//input
                do {
                    i++;
                    System.out.print("Masukan data ke " + i + " : ");
                    x = sc.nextInt();
                    jum += x;
                } while (i < n);

            } catch (Exception e){
            }  //exception handling utk input karakter

            doJmlhAngka = n;
            rata = jum / doJmlhAngka;
            System.out.println("Rata-rata: " + rata);//output
            System.out.println("Jumlah :" + jum);
            System.exit(0);//keluar dari sistem
        }
    }

