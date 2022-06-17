/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Prueba0301.servicio;

import Prueba0301.modelo.Dignidad;
import java.util.List;

/**
 *
 * @author HP OME
 */
public interface IDignidadServicio {
    
    public Dignidad crear(Dignidad capitan);
    public List<Dignidad> listar();
}
