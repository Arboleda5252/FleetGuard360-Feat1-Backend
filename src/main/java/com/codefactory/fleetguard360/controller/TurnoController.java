package com.codefactory.fleetguard360.controller;

import com.codefactory.fleetguard360.controller.DTO.TurnoDTO;
import com.codefactory.fleetguard360.controller.DTO.TurnoResponseDTO;
import com.codefactory.fleetguard360.service.TurnoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/turnos")
public class TurnoController {

    private final TurnoService turnoService;

    // Constructor injection
    public TurnoController(TurnoService turnoService) {
        this.turnoService = turnoService;
    }

    @PostMapping
    public ResponseEntity<TurnoResponseDTO> asignarTurno(@RequestBody TurnoDTO dto) {
        TurnoResponseDTO turno = turnoService.crearTurno(dto);
        return ResponseEntity.ok(turno);
    }
}
