/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Portatil extends Consola {
    private String tamanio;
    private int bateria;
    private boolean estuche;

    public Portatil() {
        super();
    }

    public Portatil(String tamanio, int bateria, boolean estuche, String identificacion, String fabricante, int anios, double precio, String modelo) {
        super(identificacion, fabricante, anios, precio, modelo);
        this.tamanio = tamanio;
        this.bateria = bateria;
        this.estuche = estuche;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }

    @Override
    public String toString() {
        
        return  "Portatil" +super.toString()+ "tamanio=" + tamanio + ", bateria=" + bateria + ", estuche=" + estuche ;
    }
    
    
    
    
    
    
}
