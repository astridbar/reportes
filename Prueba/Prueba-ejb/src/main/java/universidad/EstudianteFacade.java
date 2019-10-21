/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import Datos.DEstudiantes;
import local.EstudianteFacadeLocal;
import Entity.Estudiante;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author astrid
 */
@Stateless
public class EstudianteFacade extends AbstractFacade<Estudiante> implements EstudianteFacadeLocal {
    @PersistenceContext(unitName = "universidad")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstudianteFacade() {
        super(Estudiante.class);
    }
    
     @Override
     public void CrearEstudiante (DEstudiantes estudiantes){
      Estudiante estudiante=new Estudiante();
      estudiante.setNombre(estudiantes.getNombre());
      estudiante.setEdad(estudiantes.getEdad());
      estudiante.setFoto(estudiantes.getFoto());
      create(estudiante);
     }
}
