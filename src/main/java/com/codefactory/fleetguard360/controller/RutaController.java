
package com.codefactory.fleetguard360.controller;
import com.codefactory.fleetguard360.controller.DTO.RutaDTO;
import com.codefactory.fleetguard360.repository.entities.Ruta;
import com.codefactory.fleetguard360.service.RutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/rutas")
public class RutaController {
    @Autowired

    private RutaService rutaService;
    @PostMapping
    public ResponseEntity<Ruta> crear(@RequestBody RutaDTO dto) {
        return ResponseEntity.ok(rutaService.crearRuta(dto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Ruta> actualizar(@PathVariable int id, @RequestBody RutaDTO dto) {
        return ResponseEntity.ok(rutaService.actualizarRuta(id, dto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {
        rutaService.eliminarRuta(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping
    public ResponseEntity<List<Ruta>> listar() {
        return ResponseEntity.ok(rutaService.listarRutas());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Ruta> obtener(@PathVariable int id) {
        return ResponseEntity.ok(rutaService.obtenerRutaPorId(id));
    }
}
