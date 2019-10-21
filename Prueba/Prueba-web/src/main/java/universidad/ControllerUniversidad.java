package universidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Datos.DUniversidad;
import Entity.Universidad;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import local.UniversidadFacadeLocal;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author astrid
 */

@ViewScoped
@Named("universidad")
public class ControllerUniversidad implements Serializable {
    
    // se inicializan las variables, y se instancian los pojos y los dto las clases facedelocal
    private String nombre;
    private String extension;
    private Date fecha;
    private UploadedFile file;
    DUniversidad universid;    
    Universidad universida;
    
    @EJB 
    private UniversidadFacadeLocal universidadFacade;
   
    private ControllerDiplomado diplo;
   
    /**
     *
     */
    public ControllerUniversidad() {
    }

    /**
     *
     * @return
     */
    public List<Universidad> listarUniversidad() {
        return universidadFacade.findAll();
    }

    /**
     *
     */
    public void crearUniversidad() {
               Foto add = new Foto();
                String foto;
        try {
            foto = add.copyFile(file.getFileName(), file.getInputstream()); //obtenemos el nombre de la imagen almacenada
               universid.setNombre(nombre);
                universid.setExtension(extension);
                universid.setEscudo(foto);
                universid.setFecha(fecha);

                universidadFacade.CrearUniversidad1(universid);
                diplo.agregar();
        
        } catch (IOException ex) {
            Logger.getLogger(ControllerUniversidad.class.getName()).log(Level.SEVERE, null, ex);
        }
               
           }
    
    /**
     *
     */
    public void EditarUniversidad(){
    Universidad universida=new Universidad();
    universida.setNombre(nombre);
    universida.setExtension(extension);
    universida.setFecha(fecha);
    universidadFacade.edit(universida);
    }
    
    /**
     *
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
    public DUniversidad getUniversid() {
        return universid;
    }

    /**
     *
     * @param universid
     */
    public void setUniversid(DUniversidad universid) {
        this.universid = universid;
    }

    /**
     *
     * @return
     */
    public Universidad getUniversida() {
        return universida;
    }

    /**
     *
     * @param universida
     */
    public void setUniversida(Universidad universida) {
        this.universida = universida;
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
    public ControllerDiplomado getDiplo() {
        return diplo;
    }

    /**
     *
     * @param diplo
     */
    public void setDiplo(ControllerDiplomado diplo) {
        this.diplo = diplo;
    }

    
}
