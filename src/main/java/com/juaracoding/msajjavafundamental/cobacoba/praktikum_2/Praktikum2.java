package com.juaracoding.msajjavafundamental.cobacoba.praktikum_2;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Syarifudin a.k.a. Muhamad Syarifudin
Java Developer
Created on 18/01/2023 10:42
@Last Modified 18/01/2023 10:42
Version 1.1
*/

import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        String strNamaDepan = "";
        String strNamaBelakang = "";
        Scanner sn = new Scanner(System.in);
        char chInisial1;
        char chInisial2;

        System.out.print("Masukan nama depan : ");
        strNamaDepan = sn.nextLine();
        System.out.print("Masukan nama belakang : ");
        strNamaBelakang = sn.nextLine();

        chInisial1 = strNamaDepan.charAt(0);
        chInisial2 = strNamaBelakang.charAt(0);

        System.out.println("Inisial "+strNamaDepan.concat(" "+strNamaBelakang)+" adalah "+Character.toUpperCase(chInisial1)+Character.toUpperCase(chInisial2));



    }
}
/*
	Soal Nomor 2 Praktikum 2 Java Fundamental
*/
