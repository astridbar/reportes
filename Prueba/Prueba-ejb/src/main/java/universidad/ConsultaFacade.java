/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import local.ConsultaFacadeLocal;
import Entity.Consulta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author astrid
 */
@Stateless
public class ConsultaFacade extends AbstractFacade<Consulta> implements ConsultaFacadeLocal {
    @PersistenceContext(unitName = "universidad")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConsultaFacade() {
        super(Consulta.class);
    }
    
    @Override
    public List<Consulta> reporte(){
        TypedQuery<Consulta> consulta = em.createNamedQuery("reporte",Consulta.class);
        List<Consulta> listaReporte = consulta.getResultList();
        
        List<Consulta> listaTemp = new ArrayList();
        Iterator it = listaReporte.iterator();
        
        while(it.hasNext()){
            Object[] obj = (Object[]) it.next();
            Consulta consultar  = new Consulta(String.valueOf(obj[0]), String.valueOf(obj[1]), String.valueOf(obj[2]), String.valueOf(obj[3]), String.valueOf(obj[4]), String.valueOf(obj[5]), String.valueOf(obj[6]));        
            listaTemp.add(consultar);
        }
        
        return listaTemp;
    }
}
