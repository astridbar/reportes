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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author astrid
 */
@Entity
// s ecrea el query para hacer la consulta de la vista 
@Table(name = "vista")
@NamedQueries({
    @NamedQuery(name = "reporte", query = "SELECT u.nombre, u.extension, d.nombre, d.fechaInicio, d.fechaFin, e.nombre, e.foto FROM Universidad u JOIN u.listaDiplomados d JOIN d.listaEstudiante e")
})
public class Consulta implements Serializable {
    
    // se inicializan las variagles 
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     @Column(name = "nombre")
    private String nombre;
      @Column
    private String extension;
       @Column(name = "nombre")
    private String diplomado;
        @Column(name = "fecha_inicial")
    private String fechaInicial;
         @Column(name = "fecha_fianl")
    private String fechaFinal;
     @Column
    private String foto;   
       @Column(name = "nombre")
    private String estudiante;    

    /**
     * se cea el constructor 
     * @param nombre
     * @param extension
     * @param diplomado
     * @param fechaInicial
     * @param fechaFinal
     * @param foto
     * @param estudiante
     */
    public Consulta(String nombre, String extension, String diplomado, String fechaInicial, String fechaFinal, String foto, String estudiante) {
        this.nombre = nombre;
        this.extension = extension;
        this.diplomado = diplomado;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.foto = foto;
        this.estudiante = estudiante;
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

    /**
     *
     * @return
     */
    public String getEstudiante() {
        return estudiante;
    }

    /**
     *
     * @param estudiante
     */
    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }
        
     

   
   
}
