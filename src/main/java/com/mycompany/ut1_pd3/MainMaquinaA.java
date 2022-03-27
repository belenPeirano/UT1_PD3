package com.mycompany.ut1_pd3;

public class MainMaquinaA {

    public static void main(String[] args) {
        Perro perro = new Perro("tito");
        System.out.println(perro.getNombre());
        perro.ladrar();
        System.out.println(perro.respondeA("tito"));
    }
}
