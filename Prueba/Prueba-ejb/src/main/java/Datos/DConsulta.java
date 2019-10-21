/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author astrid
 */

public class DConsulta implements Serializable {
    private int id;
    private String nombre;
    private String extension;
    private String diplomado;
    private String fechaInicial;
    private String fechaFinal;
    private String foto;

    /**
     *
     * @param nombre
     * @param extension
     * @param diplomado
     * @param fechaInicial
     * @param fechaFinal
     * @param foto
     */
    public DConsulta(String nombre, String extension, String diplomado, String fechaInicial, String fechaFinal, String foto) {
        this.nombre = nombre;
        this.extension = extension;
        this.diplomado = diplomado;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.foto = foto;
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
    public String getDiplomado() {
        return diplomado;
    }

    /**
     *
     * @param diplomado
     */
    public void setDiplomado(String diplomado) {
        this.diplomado = diplomado;
    }

    /**
     *
     * @return
     */
    public String getFechaInicial() {
        return fechaInicial;
    }

    /**
     *
     * @param fechaInicial
     */
    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    /**
     *
     * @return
     */
    public String getFechaFinal() {
        return fechaFinal;
    }

    /**
     *
     * @param fechaFinal
     */
    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     *
     * @return
     */
    public String getFoto() {
        return foto;
    }

    /**
     *
     * @param foto
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    
    
}
