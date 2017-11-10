/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaswing1;

/**
 *
 * @author DAM
 */
public class Prenda {
    private int codigo;
    private String descripcion;
    private double pCoste;
    private double pVenta;
    private String talla;
    private String color;
    private int stock;

    public Prenda(int codigo, String descripcion, double pCoste, double pVenta, String talla, String color, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.pCoste = pCoste;
        this.pVenta = pVenta;
        this.talla = talla;
        this.color = color;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getpCoste() {
        return pCoste;
    }

    public void setpCoste(double pCoste) {
        this.pCoste = pCoste;
    }

    public double getpVenta() {
        return pVenta;
    }

    public void setpVenta(double pVenta) {
        this.pVenta = pVenta;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
     
}
