/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_venuslobo;

/**
 *
 * @author ADMIN
 */
public class Admin extends User{
    private int numTorneos; 

    public Admin() {
    }

    public Admin(int numTorneos) {
        this.numTorneos = numTorneos;
    }

    public Admin(String nombre, String contrasena) {
        super(nombre, contrasena);
        this.numTorneos = numTorneos;
    }

    public int getNumTorneos() {
        return numTorneos;
    }

    public void setNumTorneos(int numTorneos) {
        this.numTorneos = numTorneos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}
