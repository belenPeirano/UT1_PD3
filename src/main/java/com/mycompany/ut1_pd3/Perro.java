
package com.mycompany.ut1_pd3;

/**
 *
 * @author belu_
 */
public class Perro implements IMamifero{
    private String nombre;
    
    public Perro(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void ladrar(){
        System.out.println("wof");
    }
    public boolean respondeA(String unNombre){
        return this.nombre.equals(unNombre);
    }
    public void caminar();
    public void correr();
    public void saltar();
}
