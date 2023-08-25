/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Estacionaria extends Consola {
    
    private int num_controles;
    private double almacenamiento;
    private String tipo_conexion;

    public Estacionaria() {
        super();
    }

    public Estacionaria(int num_controles, double almacenamiento, String tipo_conexion, String identificacion, String fabricante, int anios, double precio, String modelo) {
        super(identificacion, fabricante, anios, precio, modelo);
        this.num_controles = num_controles;
        this.almacenamiento = almacenamiento;
        this.tipo_conexion = tipo_conexion;
    }

    public int getNum_controles() {
        return num_controles;
    }

    public void setNum_controles(int num_controles) {
        this.num_controles = num_controles;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipo_conexion() {
        return tipo_conexion;
    }

    public void setTipo_conexion(String tipo_conexion) {
        this.tipo_conexion = tipo_conexion;
    }

    @Override
    public String toString() {
        return "Estacionaria" +  super.toString()+"num_controles=" + num_controles + ", almacenamiento=" + almacenamiento + ", tipo_conexion=" + tipo_conexion + '}';
    }
    
    
    
    
}
