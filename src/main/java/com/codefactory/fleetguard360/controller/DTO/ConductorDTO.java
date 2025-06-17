package com.codefactory.fleetguard360.controller.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.regex.Pattern;

@Getter
@Setter  // Lombok will automatically generate setters/getters for id, nombre, etc.
public class ConductorDTO {
    private int id;
    private String nombre;
    private String documentoIdentidad;
    private String telefono;
    private String password;
    private String email;

    // Compile the pattern once (and stay safe from repeated compilation and backtracking)
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

    // Custom setter for email that reuses the static pattern and adds an early length check:
    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    // Private helper method to encapsulate email validation logic.
    private boolean isValidEmail(String email) {
        // Quick check to avoid pathological cases: limit input length.
        if (email == null || email.length() > 254) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
}
