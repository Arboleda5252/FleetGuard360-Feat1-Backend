package com.codefactory.fleetguard360.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void enviarNotificacion(String tipo, String mensaje) {
        // Lógica para enviar notificación
        System.out.println("Notificación enviada: " + tipo + " - " + mensaje);
    }

    // Agrega más métodos según necesidades
}
