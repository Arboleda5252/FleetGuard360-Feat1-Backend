package com.codefactory.fleetguard360.service;

import org.springframework.stereotype.Service;

@Service
public class DriverService {

    public String obtenerInfoConductor(int idConductor) {
        // Lógica para obtener información del conductor por ID
        return "Información del conductor con ID: " + idConductor;
    }

    // Agrega más métodos según necesidad
}
