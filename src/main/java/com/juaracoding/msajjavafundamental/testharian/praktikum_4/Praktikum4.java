package com.juaracoding.msajjavafundamental.testharian.praktikum_4;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Syarifudin a.k.a. Muhamad Syarifudin
Java Developer
Created on 30/01/2023 22:40
@Last Modified 30/01/2023 22:40
Version 1.1
*/


import java.util.Scanner;

public class Praktikum4 {
/*
	Soal Nomor 2 Praktikum 4 Java Fundamental
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int intPilih;
        int i;
        int r;
        int panjang;
        int lebar;
        int sisi;
        int alas;
        int tinggi;
        int diagonalSatu;
        int diagonalDua;

        System.out.println("==========================================");
        System.out.println("Pilih luas bangun datar : \n 1. Lingkaran \n 2. Persegi Panjang \n 3. Persegi \n 4. Segitiga \n 5. Belah Ketupat");
        System.out.print("Masukan nomor bangun datar yang akan di hitung: ");
        intPilih = sc.nextInt();
        System.out.println("==========================================");

        switch (intPilih) {
            case 1:
                System.out.print("Masukan jari-jari lingkaran : ");
                r = sc.nextInt();
                System.out.println("Luas lingkaran : " + getLingkaran(r) + " cm");
                break;
            case 2:
                System.out.print("Masukan panjang : ");
                panjang = sc.nextInt();
                System.out.print("Masukan lebar : ");
                lebar = sc.nextInt();
                System.out.println("Luas persegi panjang : " + getPersegiPanjang(panjang, lebar) + " cm");
                break;
            case 3:
                System.out.print("Masukan sisi : ");
                sisi = sc.nextInt();
                System.out.println(getPersegi(sisi));
                break;
            case 4:
                System.out.print("Masukan alas : ");
                alas = sc.nextInt();
                System.out.print("Masukan tinggi : ");
                tinggi = sc.nextInt();
                System.out.println("Luas segitiga : " + getSegitiga(alas, tinggi) + " cm");
                break;
            case 5:
                System.out.print("Masukan diagonal 1 : ");
                diagonalSatu = sc.nextInt();
                System.out.print("Masukan diagonal 2 : ");
                diagonalDua = sc.nextInt();
                System.out.println("Luas belah ketupat : " + getBelahKetupat(diagonalSatu, diagonalDua) + " cm");
                break;
            default:
                System.out.println("Maaf angka tidak ada di pilihan!");

        }
    }

    private static double getLingkaran(int r){
        double hasil;
        hasil = 3.14*Math.pow(r,2);
        return hasil;
    }

    private static Integer getPersegiPanjang(int panjang, int lebar){
        int hasil;
        hasil = panjang*lebar;
        return hasil;
    }

    private static double getPersegi(int sisi){
        double hasil;
        hasil = Math.pow(sisi,2);
        return hasil;
    }

    private static double getSegitiga(int alas, int tinggi){
        double hasil;
        hasil = 0.5*alas*tinggi;
        return hasil;
    }

    private static double getBelahKetupat(int d1,int d2){
        double hasil;
        hasil = 0.5*d1*d2;
        return hasil;
    }
}


