/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;


/**
 *
 * @author astrid
 */
@Entity
@Table(name = "diplomados")
public class Diplomado implements Serializable{
    // se crean las variables
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")    
    private int id;
     
    @Column
    private String nombre;
    @Column
    private Date fechaInicio;
    @Column
    private Date fechaFin; 
    @Column
    private String Descripcion;
    
    @OneToMany(mappedBy="Estudiante", cascade=CascadeType.ALL ,fetch=FetchType.LAZY)
    @JoinColumn(name = "diplomado_id",nullable=false)   
    private List<Estudiante> estudiante;
    
    @ManyToOne
    private Universidad universidad;

    /**
     *se cea el constructor 
     * @param nombre
     * @param fechaInicio
     * @param fechaFin
     * @param Descripcion
     * @param universidad
     */
    public Diplomado(String nombre, Date fechaInicio, Date fechaFin, String Descripcion, Universidad universidad) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.Descripcion = Descripcion;
        this.universidad = universidad;
    }
    
    /**
     *
     */
    public Diplomado() {
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
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     *
     * @param fechaFin
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     *
     * @param Descripcion
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     *
     * @return
     */
    public List<Estudiante> getEstudiante() {
        return estudiante;
    }

    /**
     *
     * @param estudiante
     */
    public void setEstudiante(List<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }

    /**
     *
     * @return
     */
    public Universidad getUniversidad() {
        return universidad;
    }

    /**
     *
     * @param universidad
     */
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

}