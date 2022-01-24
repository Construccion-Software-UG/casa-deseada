package edu.ug.model.clases;

import java.util.List;

public class Casa {

    private int id;
    private int numSolar;
    private double precio;
    private int numHabitaciones;
    private int numBaños;
    private int numPisos;
    private List<Acabado> acabados;

    public Casa(int id, int numSolar, double precio, int numHabitaciones, int numBaños, int numPisos) {
        this.id = id;
        this.numSolar = numSolar;
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
        this.numPisos = numPisos;
    }

    public Casa(){

    }

    public Casa(int numSolar, double precio, int numHabitaciones, int numBaños, int numPisos) {
        this.numSolar = numSolar;
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
        this.numPisos = numPisos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumSolar() {
        return numSolar;
    }

    public void setNumSolar(int numSolar) {
        this.numSolar = numSolar;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBaños() {
        return numBaños;
    }

    public void setNumBaños(int numBaños) {
        this.numBaños = numBaños;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public List<Acabado> getAcabados() {
        return acabados;
    }

    public void setAcabados(List<Acabado> acabados) {
        this.acabados = acabados;
    }
}
