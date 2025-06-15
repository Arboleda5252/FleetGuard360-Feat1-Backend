package com.codefactory.fleetguard360.controller.DTO;

public class RutaDTO {
    // Hacer 'id' una constante final si es necesario que no cambie.
    private static final int ID_CONSTANTE = 1; // Ajustar según el valor real o quitar si no es necesario
    private int id;
    private String nombre;
    private String origen;
    private String destino;

    // Constructor sin argumentos (por defecto)
    public RutaDTO() {
    }

    // Constructor con todos los parámetros
    public RutaDTO(int id, String nombre, String origen, String destino) {
        this.id = id;
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
    }

    // Getter y Setter para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para origen
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    // Getter y Setter para destino
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "RutaDTO [id=" + id + ", nombre=" + nombre + ", origen=" + origen + ", destino=" + destino + "]";
    }
}
