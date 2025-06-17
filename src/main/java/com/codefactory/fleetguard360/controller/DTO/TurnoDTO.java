package com.codefactory.fleetguard360.controller.dto;

import java.util.Date;
import lombok.Data;

@Data
public class TurnoDTO {
    private Date inicio;
    private Date fin;
    private String estado;
    private int conductorId;
    private Integer rutaId;
}
