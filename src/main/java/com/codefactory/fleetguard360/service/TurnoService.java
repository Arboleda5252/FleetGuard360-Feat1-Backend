package com.codefactory.fleetguard360.service;

import com.codefactory.fleetguard360.controller.DTO.TurnoDTO;
import com.codefactory.fleetguard360.controller.DTO.TurnoResponseDTO;
import com.codefactory.fleetguard360.mapper.TurnoMapper;
import com.codefactory.fleetguard360.repository.ConductorRepository;
import com.codefactory.fleetguard360.repository.RutaRepository;
import com.codefactory.fleetguard360.repository.TurnoRepository;
import com.codefactory.fleetguard360.repository.entities.Conductor;
import com.codefactory.fleetguard360.repository.entities.Ruta;
import com.codefactory.fleetguard360.repository.entities.Turno;
import org.springframework.stereotype.Service;

@Service
public class TurnoService {

    private final TurnoRepository turnoRepository;
    private final ConductorRepository conductorRepository;
    private final RutaRepository rutaRepository;
    private final TurnoMapper turnoMapper;

    public TurnoService(TurnoRepository turnoRepository,
                        ConductorRepository conductorRepository,
                        RutaRepository rutaRepository,
                        TurnoMapper turnoMapper) {
        this.turnoRepository = turnoRepository;
        this.conductorRepository = conductorRepository;
        this.rutaRepository = rutaRepository;
        this.turnoMapper = turnoMapper;
    }

    public TurnoResponseDTO crearTurno(TurnoDTO dto) {
        Conductor conductor = conductorRepository.findById(dto.conductorId)
                .orElseThrow(() -> new RuntimeException("Conductor no encontrado"));

        Ruta ruta = rutaRepository.findById(dto.rutaId)
                .orElseThrow(() -> new RuntimeException("Ruta no encontrada."));

        Turno turno = new Turno();
        turno.setInicio(dto.inicio);
        turno.setFin(dto.fin);
        turno.setEstado(dto.estado);
        turno.setConductorId(conductor);
        turno.setRuta(ruta);

        Turno turnoGuardado = turnoRepository.save(turno);
        return turnoMapper.turnoToTurnoResponseDTO(turnoGuardado);
    }
}
