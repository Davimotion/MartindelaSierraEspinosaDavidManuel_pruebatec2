package com.mycompany.pruebatecnica2.persistence;

import com.mycompany.pruebatecnica2.logic.Ciudadano;
import com.mycompany.pruebatecnica2.logic.Turno;
import com.mycompany.pruebatecnica2.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {

    public PersistenceController() {
    }
    CiudadanoJpaController ciudaJpa = new CiudadanoJpaController();
    TurnoJpaController turnoJpa = new TurnoJpaController();

    public void crearCiudadano(Ciudadano ciudadano) {
        ciudaJpa.create(ciudadano);
    }

    public void crearTurno(Turno turno) {
        turnoJpa.create(turno);
    }

    public List<Ciudadano> traerCiudadano() {
        return ciudaJpa.findCiudadanoEntities();
    }

    public Turno traerTurno(Integer id) {
        return turnoJpa.findTurno(id);
    }

    public void borrarCiudadano(Integer id) {
        try {
            ciudaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarTurno(Integer id) {
        try {
            turnoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCiudadano(Ciudadano ciudadano) {
        try {
            ciudaJpa.edit(ciudadano);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarTurno(Turno turno) {
        try {
            turnoJpa.edit(turno);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
