package com.codefactory.fleetguard360.controller.dto;

public class AuthDTO {
    // Constructor privado para evitar la creación de instancias de AuthDTO
    private AuthDTO() {
        // Constructor vacío, no realiza ninguna acción
    }

    // Clase interna para la solicitud de login
    public static class LoginRequest {
        private String correo;
        private String password;

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    // Clase interna para la respuesta con el token
    public static class TokenResponse {
        private String token;

        public TokenResponse(String token) {
            this.token = token;
        }

        public String getToken() {
            return token;
        }
    }
}
