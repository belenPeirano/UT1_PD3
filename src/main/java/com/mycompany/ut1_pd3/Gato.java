
package com.mycompany.ut1_pd3;

/**
 *
 * @author belu_
 */
public class Gato {
    private String nombre;
    
    public Gato(String nombre){
        this.nombre = nombre ;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void maullar(){
        System.out.println("miau");
    }
    public boolean respondeA(String unNombre){
        return false;
    }
}
