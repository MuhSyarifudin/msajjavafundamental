package com.juaracoding.msajjavafundamental.testharian.praktikum_2;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Syarifudin a.k.a. Muhamad Syarifudin
Java Developer
Created on 17/01/2023 22:21
@Last Modified 17/01/2023 22:21
Version 1.1
*/

import java.util.Scanner;

public class Praktikum2 {
    /*
	Soal Nomor 1 Praktikum 2 Java Fundamental
    */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int intX = 0;
        int intData = 0;
        float floAvg = 0;


        System.out.println("Masukan angka apapun yang anda inginkan : ");
        do {
            try{
            intX++;
            intData = sn.nextInt();
            floAvg += intData;
            } catch(Exception e){
                floAvg /= intX - 1;
                System.out.println("Rata-rata : "+floAvg);
                intX = -1;
            }

        }while(intX!=-1);

    }
}



