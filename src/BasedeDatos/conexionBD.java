/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;


import Clases.Lanzadera;
import Clases.Mision;
import Clases.Nave;
import Clases.NoTripulado;
import Clases.PlanetaDestino;
import Clases.Tripulado;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class conexionBD {

    private conexionBD() {
    }

    public static conexionBD getInstance() {
        return conexionBDHolder.INSTANCE;
    }

    private static class conexionBDHolder {
        private static final conexionBD INSTANCE = new conexionBD();
        private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Estacion_Espacial_SofkaPU");
        private static final EntityManager em = emf.createEntityManager();
    }

    public EntityManager getEntity() {
        return conexionBDHolder.em;
    }

    public void persist(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
    
    public void merge(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.merge(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
        
    public void delete(Object object) {
        EntityManager em = getEntity();
        em.getTransaction().begin();
        try {
            em.remove(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
        
       public List<Nave> getAllNaves() {
        EntityManager em = getEntity();
        List<Nave> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM nave,lanzadera where nave.codigo=lanzadera.codigo AND nave.activo=1", Lanzadera.class).getResultList();
            lista.addAll(em.createNativeQuery("SELECT * FROM nave,notripulado where nave.codigo=notripulado.codigo AND nave.activo=1", NoTripulado.class).getResultList());
             lista.addAll(em.createNativeQuery("SELECT * FROM nave,tripulado where nave.codigo=tripulado.codigo AND nave.activo=1", Tripulado.class).getResultList());
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
    }
    public Nave getNave(int codigo) {
        return conexionBDHolder.em.find(Nave.class, codigo);
    }
       
        public List<PlanetaDestino> getAllPlanetas() {
        EntityManager em = getEntity();
        List<PlanetaDestino> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM planetadestino WHERE planetadestino.activo=1", PlanetaDestino.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
        }
        
        public PlanetaDestino getPlaneta(int codigo) {
        return conexionBDHolder.em.find(PlanetaDestino.class, codigo);
        }

        public List<Mision> getAllMisiones() {
        EntityManager em = getEntity();
        List<Mision> lista = null;
        em.getTransaction().begin();
        try {
            lista = em.createNativeQuery("SELECT * FROM mision", Mision.class).getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        return lista;
        }
        
        public Mision getMision(int codigo) {
        return conexionBDHolder.em.find(Mision.class, codigo);
        }
}

