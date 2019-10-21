/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import Datos.DUniversidad;
import Entity.Universidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author astrid
 */
@Local
public interface UniversidadFacadeLocal {

    void create(Universidad univeridad);

    void edit(Universidad univeridad);

    void remove(Universidad univeridad);

    Universidad find(Object id);

    List<Universidad> findAll();

    List<Universidad> findRange(int[] range);

    int count();
    
    
    public void CrearUniversidad1(DUniversidad universidad);
    
}
