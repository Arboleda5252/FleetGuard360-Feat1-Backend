package com.codefactory.fleetguard360.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private static final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public void enviarNotificacion(String tipo, String mensaje) {
        // Lógica para enviar notificación
        logger.info("Notificación enviada: {} - {}", tipo, mensaje);
    }

    // Agrega más métodos según necesidades
}
