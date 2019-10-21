/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author astrid
 */
public class DDiplomados implements Serializable {
    private int id;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFinal;
    private String Description;
    private List<DEstudiantes> estudiante;

    /**
     *
     * @param nombre
     * @param fechaInicio
     * @param fechaFinal
     * @param Description
     */
    public DDiplomados(String nombre, Date fechaInicio, Date fechaFinal, String Description) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.Description = Description;
    }

    /**
     *
     */
    public DDiplomados() {
    }
    
    /**
     *
     * @return
     */
    public String getDescription() {
        return Description;
    }

    /**
     *
     * @param Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     *
     * @param fechaInicio
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     *
     * @return
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     *
     * @param fechaFinal
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     *
     * @return
     */
    public List<DEstudiantes> getEstudiante() {
        return estudiante;
    }

    /**
     *
     * @param estudiante
     */
    public void setEstudiante(List<DEstudiantes> estudiante) {
        this.estudiante = estudiante;
    }

}

  