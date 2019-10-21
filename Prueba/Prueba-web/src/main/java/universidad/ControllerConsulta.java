/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import Entity.Consulta;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import local.ConsultaFacadeLocal;

/**
 *
 * @author astrid
 */
@ViewScoped
@Named("consulta")
public class ControllerConsulta {
    // se declaran la variables 
    
    @EJB
    ConsultaFacadeLocal consultaFacade;
    
    private List<Consulta> consulta;

    /**
     *
     */
    public ControllerConsulta() {
        consulta = new ArrayList();
    }

    /**
     *
     */
    @PostConstruct
    public void _init() {
        consulta = consultaFacade.findAll();
    }

    /**
     *
     */
    public void llenarLista() {
        consulta = consultaFacade.findAll();
    }

    /**
     *
     * @return
     */
    public List<Consulta> listar() {
        return consultaFacade.reporte();
    }
    
    /**
     *
     * @return
     */
    public List<Consulta> getListaView() {
        return consulta;
    }

    /**
     *
     * @param consulta
     */
    public void setLista(List<Consulta> consulta) {
        this.consulta = consulta;
    }
}
