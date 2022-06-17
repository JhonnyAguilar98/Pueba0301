/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba0301.modelo;

/**
 *
 * @author HP OME
 */
public class Dignidad {
    private String codigo;
    private String nombre;
    private String cargo;
    private int edad;

    public Dignidad(String codigo, String nombre, String cargo, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargo = cargo;
        this.edad = edad;
    }

    public Dignidad(Integer valueOf, String param) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "dignidad{" + "codigo=" + codigo + ", nombre=" + nombre + ", cargo=" + cargo + ", edad=" + edad + '}';
    }
    
    
}
