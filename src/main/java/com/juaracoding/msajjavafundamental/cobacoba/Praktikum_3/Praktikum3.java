package com.juaracoding.msajjavafundamental.cobacoba.Praktikum_3;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Syarifudin a.k.a. Muhamad Syarifudin
Java Developer
Created on 19/01/2023 22:21
@Last Modified 19/01/2023 22:21
Version 1.1
*/

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Praktikum3 {
    /*
	Soal Nomor 1 Praktikum 3 Java Fundamental
    */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int intInputDetik = 0;
        int intMenit = 0;
        int intDetik = 0;
        int intJumlahMenit = 0;

        System.out.print("Masukkan jumlah detik : ");
        intInputDetik = sn.nextInt();
        intMenit = intInputDetik/60;
        intDetik = intInputDetik%60;

        System.out.println(intInputDetik+" detik sama dengan "+intMenit+" menit "+intDetik+" detik.");

    }

}
