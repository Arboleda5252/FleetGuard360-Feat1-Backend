package com.codefactory.fleetguard360.controller;

import com.codefactory.fleetguard360.controller.DTO.AuthDTO;
import com.codefactory.fleetguard360.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;

    // Constructor injection
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthDTO.TokenResponse> login(@RequestBody AuthDTO.LoginRequest request) {
        String token = authService.login(request.getCorreo(), request.getPassword());
        return ResponseEntity.ok(new AuthDTO.TokenResponse(token));
    }
}
