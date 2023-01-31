package com.juaracoding.msajjavafundamental.cobacoba.praktikum_4;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Syarifudin a.k.a. Muhamad Syarifudin
Java Developer
Created on 31/01/2023 0:01
@Last Modified 31/01/2023 0:01
Version 1.1
*/


import java.util.Random;

public class Praktikum4 {
    public static void main(String[] args) {
        String [] strProvider = {"gmail","hotmail","yahoo","ymail"};
        String [] strDomain = {".com",".edu",".co.id",".gov",};
        String strCharacter = "abcdefghijklmnopqrstuvwxyz";
        String strNumber = "0123456789";
        Random random = new Random();
        for (int i=0;i <= random.nextInt(25,40);i++) {
            System.out.print(strCharacter.charAt(random.nextInt(0, 28)));
        }
        for (int j=0;j<=1;j++){
            System.out.print(strNumber.charAt(random.nextInt(0,10)));
        }
        System.out.print("@");
        System.out.print(strProvider[random.nextInt(0,4)]);
        System.out.print(strDomain[random.nextInt(0,4)]);

    }
}
