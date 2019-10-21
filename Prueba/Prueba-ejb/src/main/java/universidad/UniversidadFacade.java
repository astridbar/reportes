/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import Datos.DUniversidad;
import local.UniversidadFacadeLocal;
import Entity.Universidad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author astrid
 */
@Stateless
public class UniversidadFacade extends AbstractFacade<Universidad> implements UniversidadFacadeLocal {
    @PersistenceContext(unitName = "universidad")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UniversidadFacade() {
        super(Universidad.class);
    }
    
     @Override
    public void CrearUniversidad1(DUniversidad universidad){
      Universidad universida=new Universidad();
      universida.setNombre(universidad.getNombre());
      universida.setExtension(universidad.getExtension());
      universida.setEscudo(universidad.getEscudo());
      universida.setFecha(universidad.getFecha());
      create(universida);}
}
