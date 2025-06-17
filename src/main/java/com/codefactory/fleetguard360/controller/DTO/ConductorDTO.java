package com.codefactory.fleetguard360.controller.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.regex.Pattern;

@Getter
public class ConductorDTO {
    private int id;
    private String nombre;
    private String documentoIdentidad;
    private String telefono;
    private String password;
    private String email;

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Custom setter with validation
    public void setEmail(String email) {
        if (email != null && Pattern.matches("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$", email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }
}


