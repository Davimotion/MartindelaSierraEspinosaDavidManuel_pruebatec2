package com.mycompany.pruebatecnica2.logic;

import java.io.Serializable;
import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Turno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTurno;
    
    private LocalDate fecha;
    private boolean espera;
    private boolean atendido;

    @ManyToOne
    @JoinColumn(name = "ciudadano_id")        
    private Ciudadano ciudadano;

    public Turno() {
    }

    public Turno(LocalDate fecha, boolean espera, boolean atendido, Ciudadano ciudadano) {
        this.fecha = fecha;
        this.espera = espera;
        this.atendido = atendido;
        this.ciudadano = ciudadano;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isEspera() {
        return espera;
    }

    public void setEspera(boolean espera) {
        this.espera = espera;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    @Override
    public String toString() {
        return "Turno{" + "id=" + idTurno + ", fecha=" + fecha + ", espera=" + espera + ", atendido=" + atendido + ", ciudadano=" + ciudadano + '}';
    }

    

    
        
}
