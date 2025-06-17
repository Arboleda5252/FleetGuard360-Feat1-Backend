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

    private static final int MAX_EMAIL_LENGTH = 254;
    // Compile the pattern once (and avoid repeated compilation/backtracking issues)
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

    /**
     * Sets the email after validating it. Uses a centralized validation method.
     *
     * @param email The email to set.
     * @throws IllegalArgumentException if the email is invalid.
     */
    public void setEmail(String email) {
        this.email = validateEmail(email);
    }

    /**
     * Validates the provided email.
     *
     * Performs an early check on the email's length to avoid potential
     * stack overflow issues from catastrophic backtracking with large inputs.
     *
     * @param email The email to be validated.
     * @return the email if valid.
     * @throws IllegalArgumentException if the email is null, too long, or does not match the pattern.
     */
    private static String validateEmail(String email) {
        if (email == null || email.length() > MAX_EMAIL_LENGTH) {
            throw new IllegalArgumentException("Email inválido");
        }
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Email inválido");
        }
        return email;
    }
}
