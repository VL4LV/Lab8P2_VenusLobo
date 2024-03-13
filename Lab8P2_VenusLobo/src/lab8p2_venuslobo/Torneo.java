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
class Torneo {
    private String nombreTorneo;
    private ArrayList<Participante> participantes = new ArrayList();
    private boolean flagAbierto; 
    private boolean flagTerminar; 
    private Participante ganador; 

    public Torneo() {
    }

    public Torneo(String nombreTorneo, boolean flagAbierto, boolean flagTerminar, Participante ganador) {
        this.nombreTorneo = nombreTorneo;
        this.flagAbierto = flagAbierto;
        this.flagTerminar = flagTerminar;
        this.ganador = ganador;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    public boolean isFlagAbierto() {
        return flagAbierto;
    }

    public void setFlagAbierto(boolean flagAbierto) {
        this.flagAbierto = flagAbierto;
    }

    public boolean isFlagTerminar() {
        return flagTerminar;
    }

    public void setFlagTerminar(boolean flagTerminar) {
        this.flagTerminar = flagTerminar;
    }

    public Participante getGanador() {
        return ganador;
    }

    public void setGanador(Participante ganador) {
        this.ganador = ganador;
    }
    
    
    
    
}
