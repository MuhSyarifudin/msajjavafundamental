package com.juaracoding.msajjavafundamental.cobacoba.praktikum_5;/*
Created By IntelliJ IDEA 2022.3.2 (Ultimate Edition)
Build #IU-223.8617.56, built on January 26, 2023
@Author Syarifudin a.k.a. Muhamad Syarifuidn
Java Developer
Created on 03/02/2023 23:58
@Last Modified 03/02/2023 23:58
Version 1.1
*/

import java.util.Scanner;

public class Praktikum5 {
    /*
	Soal Nomor 2 Praktikum 5 Java Fundamental
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intStar = 0;

        System.out.print("Masukan jumlah bintang : ");
        intStar = sc.nextInt();

        for (int i = 1;i<=intStar;i++) {
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
