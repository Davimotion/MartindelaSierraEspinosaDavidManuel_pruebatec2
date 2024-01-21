package com.mycompany.pruebatecnica2.logic;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ciudadano implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCiudadano;
    private String nombre;
    private String apellidos;
    
    @OneToMany(mappedBy = "ciudadano")
    private List<Turno> listaTurnos;

    public Ciudadano() {
    }

    public Ciudadano(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Ciudadano(String nombre, String apellidos, List<Turno> listaTurnos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.listaTurnos = listaTurnos;
    }

    public Integer getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(Integer idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "id=" + idCiudadano + ", nombre=" + nombre + ", apellidos=" + apellidos + ", listaTurnos=" + listaTurnos + '}';
    }

    


  
}
