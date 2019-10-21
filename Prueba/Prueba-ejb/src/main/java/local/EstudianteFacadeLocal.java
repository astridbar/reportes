/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local;

import Datos.DEstudiantes;
import Entity.Estudiante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author astrid
 */
@Local
public interface EstudianteFacadeLocal {

    void create(Estudiante estudiante);

    void edit(Estudiante estudiante);

    void remove(Estudiante estudiante);

    Estudiante find(Object id);

    List<Estudiante> findAll();

    List<Estudiante> findRange(int[] range);

    int count();
    
    public void CrearEstudiante(DEstudiantes estudiante);
}
