/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import Datos.DDiplomados;
import local.DiplomadoFacadeLocal;
import Entity.Diplomado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author astrid
 */
@Stateless
public class DiplomadoFacade extends AbstractFacade<Diplomado> implements DiplomadoFacadeLocal {
    @PersistenceContext(unitName = "universidad")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiplomadoFacade() {
        super(Diplomado.class);
    }
    
       @Override
    public void CrearDipomado(DDiplomados diplomados) {
     
      Diplomado diplomado = new Diplomado();
      diplomado.setNombre(diplomados.getNombre());
      diplomado.setFechaInicio(diplomados.getFechaInicio());
      diplomado.setFechaFin(diplomados.getFechaFinal());
      diplomado.setDescripcion(diplomados.getDescription());
      create(diplomado);
    }
}
