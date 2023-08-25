/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_nahimhilsaca;

import java.util.Date;

/**
 *
 * @author nahim
 */
public class Juego {
    
    private String nombre;
    private String descripcion;
    private Date fecha;
    private double precio;
    private String estado;
    private boolean rentable;
    private String agregado;
    private int cant_disponible;

    public Juego() {
    }

    public Juego(String nombre, String descripcion, Date fecha, double precio, String estado, boolean rentable, String agregado, int cant_disponible) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.precio = precio;
        this.estado = estado;
        this.rentable = rentable;
        this.agregado = agregado;
        this.cant_disponible = cant_disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public String getAgregado() {
        return agregado;
    }

    public void setAgregado(String agregado) {
        this.agregado = agregado;
    }

    public int getCant_disponible() {
        return cant_disponible;
    }

    public void setCant_disponible(int cant_disponible) {
        this.cant_disponible = cant_disponible;
    }

    @Override
    public String toString() {
        return "Juego" + "nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha + ", precio=" + precio + ", estado=" + estado + ", rentable=" + rentable + ", agregado=" + agregado + ", cant_disponible=" + cant_disponible;
    }
    
    
    
    
    
}
