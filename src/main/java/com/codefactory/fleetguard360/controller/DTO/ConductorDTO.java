package com.codefactory.fleetguard360.controller.DTO;

import lombok.Data;
import java.util.regex.Pattern;

@Data
public class ConductorDTO {
    private int id;
    private String nombre;
    private String documentoIdentidad;
    private String telefono;
    private String email;
    private String password;

    public void setEmail(String email) {
        // Usamos un método separado para la validación
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    // Método separado para la validación del email
    private boolean isValidEmail(String email) {
        return email != null && Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", email);
    }
}
