package com.mycompany.pruebatecnica2.logic;

import com.mycompany.pruebatecnica2.persistence.PersistenceController;
import java.util.List;

public class Controller {

    public Controller() {
    }

    PersistenceController controlPersis = new PersistenceController();

    public void crearCiudadano(Ciudadano ciudadano) {
        controlPersis.crearCiudadano(ciudadano);
    }

    public void crearTurno(Turno turno) {
        controlPersis.crearTurno(turno);
    }

    public List<Ciudadano> traerCiudadano() {
        return controlPersis.traerCiudadano();
    }

    public Turno traerTurno(Integer id) {
        return controlPersis.traerTurno(id);
    }

    public void borrarCiudadano(Integer id) {
        controlPersis.borrarCiudadano(id);
    }

    public void borrarTurno(Integer id) {
        controlPersis.borrarTurno(id);
    }
    
    public void editarCiudadano(Ciudadano ciudadano){
        controlPersis.editarCiudadano(ciudadano);
    }
    
    public void editarTurno(Turno turno){
        controlPersis.editarTurno(turno);
    }
    
}
