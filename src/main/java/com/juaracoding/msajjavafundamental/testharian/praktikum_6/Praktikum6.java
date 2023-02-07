package com.juaracoding.msajjavafundamental.testharian.praktikum_6;/*
Created By IntelliJ IDEA 2022.3.2 (Ultimate Edition)
Build #IU-223.8617.56, built on January 26, 2023
@Author Syarifudin a.k.a. Muhamad Syarifuidn
Java Developer
Created on 06/02/2023 12:43
@Last Modified 06/02/2023 12:43
Version 1.1
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum6 {
    /*
	Soal Nomor 2 Praktikum 6 Java Fundamental
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        int intValue;
        int i = 0;
        int j = 0;
        int intFind = 0;
        Boolean isFound = true;

        System.out.println("Angka yang anda input adalah : ");
        do {
            try{
            intValue = sc.nextInt();
            intArr.add(intValue);
            }catch (Exception e){
                j=-1;
            }
        }while(j!=-1);
        System.out.println("Angka yang anda inputkan adalah : "+intArr);
        System.out.print("Angka yang dicari adalah : ");
        intFind = sn.nextInt();
        for (int k=0;k<intArr.size();k++){
            if (intFind==intArr.get(k)){
                System.out.println("Angka "+intFind+" ditemukan pada index ke "+k+" urutan ke "+(k+1)+" dari data yang di input.");
                isFound = false;
                break;
            }
        }
        if (isFound){
            System.out.println("Angka "+intFind+" yang anda cari tidak ditemukan!");
        }
    }
}
