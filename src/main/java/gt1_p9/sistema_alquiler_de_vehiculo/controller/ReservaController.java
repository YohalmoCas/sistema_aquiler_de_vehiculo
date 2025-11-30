package gt1_p9.sistema_alquiler_de_vehiculo.controller;

import gt1_p9.sistema_alquiler_de_vehiculo.dto.ReservaCreateDTO;
import gt1_p9.sistema_alquiler_de_vehiculo.model.Reserva;
import gt1_p9.sistema_alquiler_de_vehiculo.service.ReservaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservas")
@RequiredArgsConstructor
public class ReservaController {

    private final ReservaService reservaService;

    //Registrar
    @PostMapping
    public ResponseEntity<Reserva> create(@Valid @RequestBody ReservaCreateDTO dto) {
        return ResponseEntity.status(201).body(reservaService.create(dto));
    }

    //Buscar
    @GetMapping("/{id}")
    public ResponseEntity<Reserva> getById(@PathVariable Long id) {
        return reservaService.getPorId(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    //Listar
    @GetMapping
    public ResponseEntity<List<Reserva>> getAll() {
        return ResponseEntity.ok(reservaService.getAll());
    }

    //Actualizar
    @PutMapping("/{id}")
    public ResponseEntity<Reserva> update(@PathVariable Long id, @jakarta.validation.Valid @RequestBody ReservaCreateDTO dto) {
        return ResponseEntity.ok(reservaService.update(id, dto));
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        reservaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
