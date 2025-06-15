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
        // Validación simple de email
        if (email != null && Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }
}


