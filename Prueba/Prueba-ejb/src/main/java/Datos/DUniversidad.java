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
public class DUniversidad implements Serializable{
    private int id;
    private String nombre;
    private String extension;
    private String escudo;
    private Date fecha;
    private List<DDiplomados> diplomado;

    /**
     *
     * @param nombre
     * @param extension
     * @param escudo
     * @param fecha
     */
    public DUniversidad(String nombre, String extension,String escudo, Date fecha) {
        this.nombre = nombre;
        this.extension = extension;
        this.escudo = escudo;
        this.fecha = fecha;
    }

    /**
     *
     */
    public DUniversidad() {
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
    public List<DDiplomados> getDiplomado() {
        return diplomado;
    }

    /**
     *
     * @param diplomado
     */
    public void setDiplomado(List<DDiplomados> diplomado) {
        this.diplomado = diplomado;
    }
}
    
  