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


public class KelasParent {
    private String id;
    private String namaDepan;
    private String namaBelakang;

    public KelasParent() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public KelasParent(String id, String namaDepan, String namaBelakang) {
        super();
        this.id = id;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    public String getId() {
        return id;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }
}
