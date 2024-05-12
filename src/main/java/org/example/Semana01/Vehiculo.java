package org.example.Semana01;
import java.util.*;
public class Vehiculo {
    Scanner sc = new Scanner(System.in);
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public Vehiculo(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo: " + marca + ", Modelo: " + modelo + ", Precio: " + precio;
    }

    public void ShowsData(){
        System.out.println(toString());
    }

}
