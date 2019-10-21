/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author astrid
 */
@Entity
@Table(name = "estudiante")
public class Estudiante implements Serializable {
    // se crean las variables 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column
    private String nombre;
    @Column
    private int edad ;
    @Column
    private String foto;
    
    private Diplomado diplomados;

    /**
     *se cea el constructor 
     * @param nombre
     * @param edad
     * @param foto
     * @param diplomados
     */
    public Estudiante(String nombre, int edad, String foto, Diplomado diplomados) {
        this.nombre = nombre;
        this.edad = edad;
        this.foto = foto;
        this.diplomados = diplomados;
    }

    /**
     *
     */
    public Estudiante() {
 
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
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
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

    /**
     *
     * @return
     */
    public Diplomado getDiplomados() {
        return diplomados;
    }

    /**
     *
     * @param diplomados
     */
    public void setDiplomados(Diplomado diplomados) {
        this.diplomados = diplomados;
    }
    
    
}