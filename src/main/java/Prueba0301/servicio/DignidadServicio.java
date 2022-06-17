/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba0301.servicio;

import Prueba0301.modelo.Dignidad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP OME
 */
public class DignidadServicio implements IDignidadServicio{
    
    private final List<Dignidad> dignidadList = new ArrayList<>();
    
    @Override
    public Dignidad crear(Dignidad dignidad) {
        this.dignidadList.add(dignidad);
        return dignidad;
    }

    @Override
    public List<Dignidad> listar() {
        return this.dignidadList;
    }
    
}
