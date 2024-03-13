/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_venuslobo;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Participante extends User {

    private ArrayList<Torneo> torneosParticipando = new ArrayList();
    private ArrayList<Torneo> torneosGanados = new ArrayList();

    public Participante() {
    }

    public Participante(String nombre, String contrasena) {
        super(nombre, contrasena);
    }

    public ArrayList<Torneo> getTorneosParticipando() {
        return torneosParticipando;
    }

    public void setTorneosParticipando(ArrayList<Torneo> torneosParticipando) {
        this.torneosParticipando = torneosParticipando;
    }

    public ArrayList<Torneo> getTorneosGanados() {
        return torneosGanados;
    }

    public void setTorneosGanados(ArrayList<Torneo> torneosGanados) {
        this.torneosGanados = torneosGanados;
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
