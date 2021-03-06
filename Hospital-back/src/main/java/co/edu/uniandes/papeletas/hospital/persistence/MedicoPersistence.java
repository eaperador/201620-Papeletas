/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.papeletas.hospital.persistence;


import co.edu.uniandes.papeletas.hospital.entities.CitaEntity;
import co.edu.uniandes.papeletas.hospital.entities.MedicoEntity;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Nicolas
 */
@Stateless
public class MedicoPersistence {
    
 private static final Logger LOGGER = Logger.getLogger(MedicoPersistence.class.getName());
 
  @PersistenceContext(unitName = "PapeletasPU")
    protected EntityManager em;
  
  public MedicoEntity find (Long id) {
        LOGGER.log(Level.INFO, "Consultando medico con id={0}", id);
        return em.find(MedicoEntity.class, id);
    }
   
    
    
    public List <MedicoEntity> findAll () {
        LOGGER.info("Consultando todos los  medicos");
        Query q = em.createQuery("select u from MedicoEntity u");
        return q.getResultList();
    }
    
    public MedicoEntity create (MedicoEntity entity) {
        LOGGER.info("Creando un medico nuevo");
        em.persist(entity);
        LOGGER.info("medico creado");
        return entity;
    }
    
    public MedicoEntity update (MedicoEntity entity) {
        LOGGER.log(Level.INFO, "Actualizando medico con id={0}", entity.getId());
        return em.merge(entity);
    }
    
    public void delete(Long id) {
        LOGGER.log(Level.INFO, "Borrando  medico con id={0}", id);
        MedicoEntity entity = em.find(MedicoEntity.class, id);
        em.remove(entity);
    }
    
      public MedicoEntity findByName(String name){
         LOGGER.log(Level.INFO, "Consultando medico con name = {0}", name);
        TypedQuery<MedicoEntity> q
                = em.createQuery("select u from MedicoEntity u where u.name = :name", MedicoEntity.class);
        q = q.setParameter("name", name); 
        return q.getSingleResult();
    }
      
      

}