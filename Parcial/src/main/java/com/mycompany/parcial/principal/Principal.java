
package com.mycompany.parcial.principal;

import com.mycompany.parcial.clases.Motocicletas_1;
import com.mycompany.parcial.clases.service.Motocicletas_1FacadeREST;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Gabriel
 */
public class Principal {

    
    public static void Metodo1(EntityManager entityManager, String codigo_barras){
    
    CriteriaBuilder builder=entityManager.getCriteriaBuilder();
    
    CriteriaQuery <Motocicletas_1FacadeREST> query=builder.createQuery(Motocicletas_1FacadeREST.class);
    
    Root<Motocicletas_1FacadeREST> root=query.from(Motocicletas_1FacadeREST.class);
    
    query.where(builder.equal(root.get("codigoBarras"), codigo_barras));
    
    try{
    Motocicletas_1FacadeREST motocicletas=entityManager.createQuery(query).getSingleResult();
    
        System.out.println(motocicletas);
    }catch(IllegalArgumentException iae){
        System.err.println(iae.getMessage());
        }
    }
   
    public static void main(String[] args) {
        
        EntityManager entityManager=Persistence.createEntityManagerFactory("com.mycompany_Parcial_war_1.0-SNAPSHOTPU")
                 .createEntityManager();
        
        Principal.Metodo1(entityManager, "3");
        
    }
    
}
