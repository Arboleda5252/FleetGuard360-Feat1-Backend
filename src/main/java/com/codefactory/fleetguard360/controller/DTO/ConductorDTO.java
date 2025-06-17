package com.codefactory.fleetguard360.controller.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.regex.Pattern;

@Getter
@Setter
public class ConductorDTO {
    private int id;
    private String nombre;
    private String documentoIdentidad;
    private String telefono;
    private String password;
    private String email;

    private static final int MAX_EMAIL_LENGTH = 254;
    // Se modifica el patrón para usar cuantificadores posesivos y grupos no capturantes.
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[\\w\\-.]++@(?:(?:[\\w-]++\\.)++)[\\w-]{2,4}$");

    public void setEmail(String email) {
        if (email == null || email.length() > MAX_EMAIL_LENGTH) {
            throw new IllegalArgumentException("Email inválido");
        }
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;
    }
}

