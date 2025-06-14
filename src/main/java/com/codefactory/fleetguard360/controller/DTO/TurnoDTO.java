package com.codefactory.fleetguard360.controller.DTO;

import java.util.Date;
public class TurnoDTO {
    public Date inicio;
    public Date fin;
    public String estado;
    public int conductorId;
    public Integer rutaId;
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
    public int getConductorId() {
        return conductorId;
    }
    public void setConductorId(int conductorId) {
        this.conductorId = conductorId;
    }
    public Integer getRutaId() {
        return rutaId;
    }
    public void setRutaId(Integer rutaId) {
        this.rutaId = rutaId;
    }
}
