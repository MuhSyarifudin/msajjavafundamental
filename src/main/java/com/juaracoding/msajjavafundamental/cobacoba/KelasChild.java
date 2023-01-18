package com.juaracoding.msajjavafundamental.cobacoba;
/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Syarifudin a.k.a. Muhamad Syarifudin
Java Developer
Created on 19/01/2023 21:05
@Last Modified 19/01/2023 21:05
Version 1.1
*/


public class KelasChild extends KelasParent {

    public static void main(String[] args) {
        KelasParent kelasParent = new KelasParent();
        kelasParent.setId("1");
        kelasParent.setNamaDepan("Muhamad");
        kelasParent.setNamaBelakang("Syarifudin");
        System.out.println(kelasParent.getId()+". "+kelasParent.getNamaDepan()+" "+kelasParent.getNamaBelakang());
    }

}
