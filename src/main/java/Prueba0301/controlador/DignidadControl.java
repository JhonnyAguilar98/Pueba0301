/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba0301.controlador;

import Prueba0301.modelo.Dignidad;
import Prueba0301.servicio.DignidadServicio;
import java.util.List;

/**
 *
 * @author HP OME
 */
public class DignidadControl {
    private final DignidadServicio dignidadServicio = new DignidadServicio();
    
    public Dignidad crear(String [] params){
        var dignidad = new Dignidad(params[0],params[1],params[2],Integer.valueOf(params[3]));
        this.dignidadServicio.crear(dignidad);
        return dignidad;
    }
    
    public List<Dignidad> listar()
    {
        return this.dignidadServicio.listar();
    }
}
