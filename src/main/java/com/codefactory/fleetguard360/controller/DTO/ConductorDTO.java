package com.codefactory.fleetguard360.controller.dto;

import lombok.Getter;
import java.util.regex.Pattern;

@Getter
public class ConductorDTO {
    private int id;
    private String nombre;
    private String documentoIdentidad;
    private String telefono;
    private String password;
    private String email;

    // Compile and store the pattern once to reuse in the setter.
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

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

    public void setEmail(String email) {
        if (email != null && EMAIL_PATTERN.matcher(email).matches()) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }
}
