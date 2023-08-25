/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_nahimhilsaca;

import java.util.ArrayList;

/**
 *
 * @author nahim
 */
public class Consola {
    
   private String identificacion;
   private String fabricante;
   private int anios;
   private double precio;
   private ArrayList <Juego> Juegos_disponibles;
   private String modelo;

    public Consola() {
    }

    public Consola(String identificacion, String fabricante, int anios, double precio, String modelo) {
        this.identificacion = identificacion;
        this.fabricante = fabricante;
        this.anios = anios;
        this.precio = precio;
        this.modelo = modelo;
    }

    

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Juego> getJuegos_disponibles() {
        return Juegos_disponibles;
    }

    public void setJuegos_disponibles(ArrayList<Juego> Juegos_disponibles) {
        this.Juegos_disponibles = Juegos_disponibles;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return  "identificacion=" + identificacion + ", fabricante=" + fabricante + ", anios=" + anios + ", precio=" + precio + ", Juegos_disponibles=" + Juegos_disponibles + ", modelo=" + modelo ;
    }
   
   
    
}
