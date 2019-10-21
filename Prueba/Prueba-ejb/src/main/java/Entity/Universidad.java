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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author astrid
 */
@Entity
@Table(name = "universidad")
public class Universidad implements Serializable{
    // se crean las variabales
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") 
    private int id;
    @Column
    private String nombre;
    @Column
    private String extension;
    
    @Column
    private String escudo;
    
    @Column(name="fundacion")
    private Date fecha;
    
    @OneToMany(mappedBy="Diplomado", cascade=CascadeType.ALL ,fetch=FetchType.LAZY)
    @JoinColumn(name = "universidad_id",nullable=false)
    private List<Diplomado> diplomado;

    /**
     *se cea el constructor 
     * @param nombre
     * @param extension
     * @param escudo
     * @param fecha
     */
    public Universidad(String nombre, String extension, String escudo, Date fecha) {
        this.nombre = nombre;
        this.extension = extension;
        this.escudo = escudo;
        this.fecha = fecha;
    }

    /**
     *
     */
    public Universidad() {
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
    public String getExtension() {
        return extension;
    }

    /**
     *
     * @param extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     *
     * @return
     */
    public String getEscudo() {
        return escudo;
    }

    /**
     *
     * @param escudo
     */
    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    /**
     *
     * @return
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return
     */
    public List<Diplomado> getDiplomado() {
        return diplomado;
    }

    /**
     *
     * @param diplomado
     */
    public void setDiplomado(List<Diplomado> diplomado) {
        this.diplomado = diplomado;
    }
 
 }