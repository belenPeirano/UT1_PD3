package com.mycompany.ut1_pd3;

public class MainMaquina {

    public static void main(String[] args) {
        Gato gato = new Gato("michi");
        System.out.println(gato.getNombre());
        gato.maullar();
        System.out.println(gato.respondeA("michi"));
    }
}
