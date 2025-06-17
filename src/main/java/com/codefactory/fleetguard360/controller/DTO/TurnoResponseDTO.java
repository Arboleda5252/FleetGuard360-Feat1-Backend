package com.codefactory.fleetguard360.controller.dto;

import java.util.Date;

public class TurnoResponseDTO {
    private int id;
    private Date inicio;
    private Date fin;
    private String estado;
    private ConductorDTO conductor;
    private RutaDTO ruta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ConductorDTO getConductor() {
        return conductor;
    }

    public void setConductor(ConductorDTO conductor) {
        this.conductor = conductor;
    }

    public RutaDTO getRuta() {
        return ruta;
    }

    public void setRuta(RutaDTO ruta) {
        this.ruta = ruta;
    }
}
