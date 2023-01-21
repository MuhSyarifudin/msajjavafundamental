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
            String consonantSet = "bcdfghjklmnpqrstvwxyz";
            String vocalSet = "aiueo";
            Random random = new Random();
            String result = "";
            int wordLength = random.nextInt(12, 25);

            for (int i = 0; i < wordLength; i++) {
                if (i < 7) {
                    if (i == 0) {
                        result += (char)(random.nextInt(26) + 'a');
                        result = result.toUpperCase();
                    } else {
                        if (vocalSet.indexOf(result) > 0) {
                            if (i % 2 == 0) {
                                result += vocalSet.charAt(random.nextInt(vocalSet.length()));
                            }
                        } else {
                            if (i % 2 == 0) {
                                result += consonantSet.charAt(random.nextInt(consonantSet.length()));
                            } else {
                                result += vocalSet.charAt(random.nextInt(vocalSet.length()));
                            }
                        }
                    }
                } else {
                    result += (char)(random.nextInt(26) + 'a');
                }
            }

            System.out.println(result);
        }
    }
