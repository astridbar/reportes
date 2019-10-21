package universidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Datos.DEstudiantes;
import Entity.Diplomado;
import Entity.Estudiante;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import local.DiplomadoFacadeLocal;
import local.EstudianteFacadeLocal;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author astrid
 */

@ViewScoped
@Named("estudiante")
public class ControllerEstudiante implements Serializable {
   // se inicializan las variables, y se instancian los pojos y los dto las clases facedelocal
   
    private String nombre;
    private int edad;
    private String diplo;
    private String foto;
    private int dipo;
     private UploadedFile file;
    
    @EJB 
    private EstudianteFacadeLocal estudianteFacade;
    
    @EJB 
    private DiplomadoFacadeLocal diplomadoFacade;
    DEstudiantes estudiantes;
    private ArrayList<SelectItem> ListaEstudiantes;
    private List<Diplomado> diplomados;
    
    private Estudiante estudante;
    
    /**
     *se crea el construtor con un arreglo de diplomados 
     */
    public ControllerEstudiante() {
        diplomados = new ArrayList();
    }

    /**
     *
     */
    @PostConstruct
    public void _init() {
        diplomados = diplomadoFacade.findAll();
    }

    /**
     *se crea el metodo agegar para añadir un diplomado
     */
    public void agregar() {
        diplomados = diplomadoFacade.findAll();
    }

    /**
     *
     * @return
     */
    public List<Estudiante> listarEstudiante() {
        return estudianteFacade.findAll();
    }

    /**
     *se crea el metodo para registrar en la base d edatos 
     */
    public void crearEstudiante() {
     
                Foto add = new Foto();
        try {
            foto = add.copyFile(file.getFileName(), file.getInputstream());
             Diplomado dip = diplomadoFacade.find(dipo);
                Estudiante est = new Estudiante(nombre,edad, foto, dip);
                List<Estudiante> listaEstudiante = new ArrayList<>();
                listaEstudiante.add(est);
                estudianteFacade.create(est);
        } catch (IOException ex) {
            Logger.getLogger(ControllerEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
               

    }

    /**
     *se crea el metodo para cargar la foto 
     * @param event
     */
    public void handleFileUpload(FileUploadEvent event) {
        if (event != null) {
            file = event.getFile();
        }
        FacesMessage msg = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
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
    public String getDiplo() {
        return diplo;
    }

    /**
     *
     * @param diplo
     */
    public void setDiplo(String diplo) {
        this.diplo = diplo;
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
    public int getDipo() {
        return dipo;
    }

    /**
     *
     * @param dipo
     */
    public void setDipo(int dipo) {
        this.dipo = dipo;
    }

    /**
     *
     * @return
     */
    public UploadedFile getFile() {
        return file;
    }

    /**
     *
     * @param file
     */
    public void setFile(UploadedFile file) {
        this.file = file;
    }

    /**
     *
     * @return
     */
    public EstudianteFacadeLocal getEstudianteFacade() {
        return estudianteFacade;
    }

    /**
     *
     * @param estudianteFacade
     */
    public void setEstudianteFacade(EstudianteFacadeLocal estudianteFacade) {
        this.estudianteFacade = estudianteFacade;
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
    public DEstudiantes getEstudiantes() {
        return estudiantes;
    }

    /**
     *
     * @param estudiantes
     */
    public void setEstudiantes(DEstudiantes estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     *
     * @return
     */
    public ArrayList<SelectItem> getListaEstudiantes() {
        return ListaEstudiantes;
    }

    /**
     *
     * @param ListaEstudiantes
     */
    public void setListaEstudiantes(ArrayList<SelectItem> ListaEstudiantes) {
        this.ListaEstudiantes = ListaEstudiantes;
    }

    /**
     *
     * @return
     */
    public List<Diplomado> getDiplomados() {
        return diplomados;
    }

    /**
     *
     * @param diplomados
     */
    public void setDiplomados(List<Diplomado> diplomados) {
        this.diplomados = diplomados;
    }

    /**
     *
     * @return
     */
    public Estudiante getEstudante() {
        return estudante;
    }

    /**
     *
     * @param estudante
     */
    public void setEstudante(Estudiante estudante) {
        this.estudante = estudante;
    }


    
    
}
