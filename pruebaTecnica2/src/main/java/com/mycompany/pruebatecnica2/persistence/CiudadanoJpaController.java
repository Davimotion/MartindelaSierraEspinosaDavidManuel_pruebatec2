
package com.mycompany.pruebatecnica2.persistence;

import com.mycompany.pruebatecnica2.logic.Ciudadano;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.pruebatecnica2.logic.Turno;
import com.mycompany.pruebatecnica2.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class CiudadanoJpaController implements Serializable {

    public CiudadanoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
        public CiudadanoJpaController() {
        emf = Persistence.createEntityManagerFactory("TurnosPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ciudadano ciudadano) {
        if (ciudadano.getListaTurnos() == null) {
            ciudadano.setListaTurnos(new ArrayList<Turno>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Turno> attachedListaTurnos = new ArrayList<Turno>();
            for (Turno listaTurnosTurnoToAttach : ciudadano.getListaTurnos()) {
                listaTurnosTurnoToAttach = em.getReference(listaTurnosTurnoToAttach.getClass(), listaTurnosTurnoToAttach.getIdTurno());
                attachedListaTurnos.add(listaTurnosTurnoToAttach);
            }
            ciudadano.setListaTurnos(attachedListaTurnos);
            em.persist(ciudadano);
            for (Turno listaTurnosTurno : ciudadano.getListaTurnos()) {
                Ciudadano oldCiudadanoOfListaTurnosTurno = listaTurnosTurno.getCiudadano();
                listaTurnosTurno.setCiudadano(ciudadano);
                listaTurnosTurno = em.merge(listaTurnosTurno);
                if (oldCiudadanoOfListaTurnosTurno != null) {
                    oldCiudadanoOfListaTurnosTurno.getListaTurnos().remove(listaTurnosTurno);
                    oldCiudadanoOfListaTurnosTurno = em.merge(oldCiudadanoOfListaTurnosTurno);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Ciudadano ciudadano) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ciudadano persistentCiudadano = em.find(Ciudadano.class, ciudadano.getIdCiudadano());
            List<Turno> listaTurnosOld = persistentCiudadano.getListaTurnos();
            List<Turno> listaTurnosNew = ciudadano.getListaTurnos();
            List<Turno> attachedListaTurnosNew = new ArrayList<Turno>();
            for (Turno listaTurnosNewTurnoToAttach : listaTurnosNew) {
                listaTurnosNewTurnoToAttach = em.getReference(listaTurnosNewTurnoToAttach.getClass(), listaTurnosNewTurnoToAttach.getIdTurno());
                attachedListaTurnosNew.add(listaTurnosNewTurnoToAttach);
            }
            listaTurnosNew = attachedListaTurnosNew;
            ciudadano.setListaTurnos(listaTurnosNew);
            ciudadano = em.merge(ciudadano);
            for (Turno listaTurnosOldTurno : listaTurnosOld) {
                if (!listaTurnosNew.contains(listaTurnosOldTurno)) {
                    listaTurnosOldTurno.setCiudadano(null);
                    listaTurnosOldTurno = em.merge(listaTurnosOldTurno);
                }
            }
            for (Turno listaTurnosNewTurno : listaTurnosNew) {
                if (!listaTurnosOld.contains(listaTurnosNewTurno)) {
                    Ciudadano oldCiudadanoOfListaTurnosNewTurno = listaTurnosNewTurno.getCiudadano();
                    listaTurnosNewTurno.setCiudadano(ciudadano);
                    listaTurnosNewTurno = em.merge(listaTurnosNewTurno);
                    if (oldCiudadanoOfListaTurnosNewTurno != null && !oldCiudadanoOfListaTurnosNewTurno.equals(ciudadano)) {
                        oldCiudadanoOfListaTurnosNewTurno.getListaTurnos().remove(listaTurnosNewTurno);
                        oldCiudadanoOfListaTurnosNewTurno = em.merge(oldCiudadanoOfListaTurnosNewTurno);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = ciudadano.getIdCiudadano();
                if (findCiudadano(id) == null) {
                    throw new NonexistentEntityException("The ciudadano with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ciudadano ciudadano;
            try {
                ciudadano = em.getReference(Ciudadano.class, id);
                ciudadano.getIdCiudadano();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ciudadano with id " + id + " no longer exists.", enfe);
            }
            List<Turno> listaTurnos = ciudadano.getListaTurnos();
            for (Turno listaTurnosTurno : listaTurnos) {
                listaTurnosTurno.setCiudadano(null);
                listaTurnosTurno = em.merge(listaTurnosTurno);
            }
            em.remove(ciudadano);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Ciudadano> findCiudadanoEntities() {
        return findCiudadanoEntities(true, -1, -1);
    }

    public List<Ciudadano> findCiudadanoEntities(int maxResults, int firstResult) {
        return findCiudadanoEntities(false, maxResults, firstResult);
    }

    private List<Ciudadano> findCiudadanoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ciudadano.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Ciudadano findCiudadano(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ciudadano.class, id);
        } finally {
            em.close();
        }
    }

    public int getCiudadanoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Ciudadano> rt = cq.from(Ciudadano.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
