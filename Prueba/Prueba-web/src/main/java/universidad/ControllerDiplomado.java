package universidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Datos.DDiplomados;
import Entity.Diplomado;
import Entity.Universidad;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import local.DiplomadoFacadeLocal;
import local.UniversidadFacadeLocal;

/**
 *
 * @author astrid
 */

@ViewScoped
@Named("diplomado")
public class ControllerDiplomado implements Serializable {
    
      // se inicializan las variables, y se instancian los pojos y los dto las clases facedelocal
   
    private String nombre;
    private String descripcion;
    private Date fecha;
    private Date fechaFinal;
    private int univer;
    DDiplomados diplomados;
    Diplomado diplomado;
    
    private ArrayList<SelectItem> Listadiplomados;
    @EJB 
    private DiplomadoFacadeLocal diplomadoFacade;
    @EJB
    private UniversidadFacadeLocal universidadFacade;   
    
     @Inject
    private ControllerEstudiante Cestudiante;
    
    private List<Universidad> universidad;
      
    /**
     *se crea el constructor 
     */
    public ControllerDiplomado() {
        universidad = new ArrayList();
    }
    
    /**
     *
     */
    @PostConstruct
    public void _init(){
        universidad = universidadFacade.findAll();
    }
    
    /**
     *se crea el metodo que agrega 
     */
    public void agregar(){
        universidad= universidadFacade.findAll();
    }
    /**
     * Metodo que retorna lista de diplomados
     * @return 
     */
    public List<Diplomado> listarDiplomado(){
        return diplomadoFacade.findAll();
    }
    /**
     * Metodo para insertar en ala base de datos los diplomados  
     */
    public void crearDiplomado(){
        
        Universidad universidad= universidadFacade.find(univer);
        Diplomado diploma=new Diplomado(nombre,fecha,fechaFinal,descripcion,universidad);
        List<Diplomado> listaDiplomado = new ArrayList<>();
        listaDiplomado.add(diploma);
        diploma.setUniversidad(universidad);
        diplomadoFacade.create(diploma);
        Cestudiante.agregar();
      
    }
    
    /**
     *metodo para editar el registro de los diplomados  
     */
    public void editarDiplomados(){
    diplomado.setNombre(nombre);
    diplomado.setFechaInicio(fecha);
    diplomado.setFechaFin(fechaFinal);
    diplomado.setDescripcion(descripcion);
    diplomadoFacade.edit(diplomado);
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
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    public int getUniver() {
        return univer;
    }

    /**
     *
     * @param univer
     */
    public void setUniver(int univer) {
        this.univer = univer;
    }

    /**
     *
     * @return
     */
    public DiplomadoFacadeLocal getDiplomadoFacade() {
        return diplomadoFacade;
    }

    /**
     *
     * @param diplomadoFacade
     */
    public void setDiplomadoFacade(DiplomadoFacadeLocal diplomadoFacade) {
        this.diplomadoFacade = diplomadoFacade;
    }

    /**
     *
     * @return
     */
    public UniversidadFacadeLocal getUniversidadFacade() {
        return universidadFacade;
    }

    /**
     *
     * @param universidadFacade
     */
    public void setUniversidadFacade(UniversidadFacadeLocal universidadFacade) {
        this.universidadFacade = universidadFacade;
    }

    /**
     *
     * @return
     */
    public ControllerEstudiante getCestudiante() {
        return Cestudiante;
    }

    /**
     *
     * @param Cestudiante
     */
    public void setCestudiante(ControllerEstudiante Cestudiante) {
        this.Cestudiante = Cestudiante;
    }

    /**
     *
     * @return
     */
    public List<Universidad> getUniversidad() {
        return universidad;
    }

    /**
     *
     * @param universidad
     */
    public void setUniversidad(List<Universidad> universidad) {
        this.universidad = universidad;
    }

    /**
     *
     * @return
     */
    public DDiplomados getDiplomados() {
        return diplomados;
    }

    /**
     *
     * @param diplomados
     */
    public void setDiplomados(DDiplomados diplomados) {
        this.diplomados = diplomados;
    }

    /**
     *
     * @return
     */
    public Diplomado getDiplomado() {
        return diplomado;
    }

    /**
     *
     * @param diplomado
     */
    public void setDiplomado(Diplomado diplomado) {
        this.diplomado = diplomado;
    }

    /**
     *
     * @return
     */
    public ArrayList<SelectItem> getListadiplomados() {
        return Listadiplomados;
    }

    /**
     *
     * @param Listadiplomados
     */
    public void setListadiplomados(ArrayList<SelectItem> Listadiplomados) {
        this.Listadiplomados = Listadiplomados;
    }

    
   /** public List<SelectItem> getListadiplomados() {
        this.Listadiplomados = new ArrayList<SelectItem>();
        List<Diplomado>DDiplomados = diplomadoFacade.findAll();
        this.universidad.clear();
        
        for (Diplomado diplo : DDiplomados) {
            if (diplo.getUniversidad().getId()==0) {
                SelectItem diplomadoItem = new SelectItem(diplo.getId(), diplo.getNombre());
                this.universidad.add(diplomadoItem);
            }
        }
        
        return universidad;
    }*/

 
  

   
}