package com.codefactory.fleetguard360.controller.dto;

import java.util.Date;

public class UsuarioDTO {
    private String email;
    private String rol;
    private Date bloqueoHasta;
    private int intentosFallidos;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getBloqueoHasta() {
        return bloqueoHasta;
    }

    public void setBloqueoHasta(Date bloqueoHasta) {
        this.bloqueoHasta = bloqueoHasta;
    }

    public int getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }
}
