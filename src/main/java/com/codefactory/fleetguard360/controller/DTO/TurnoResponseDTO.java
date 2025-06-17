package com.codefactory.fleetguard360.controller.dto;

import java.util.Date;
import lombok.Data;

@Data
public class TurnoResponseDTO {
    private int id;
    private Date inicio;
    private Date fin;
    private String estado;
    private ConductorDTO conductor;
    private RutaDTO ruta;
}
