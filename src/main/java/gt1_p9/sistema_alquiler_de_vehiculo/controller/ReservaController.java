package gt1_p9.sistema_alquiler_de_vehiculo.controller;

import gt1_p9.sistema_alquiler_de_vehiculo.dto.ReservaCreateDTO;
import gt1_p9.sistema_alquiler_de_vehiculo.dto.ReservaDTO;
import gt1_p9.sistema_alquiler_de_vehiculo.service.ReservaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/reservas")
@RequiredArgsConstructor
public class ReservaController {

    private final ReservaService reservaService;

    @PostMapping
    public ResponseEntity<ReservaDTO> create(@Valid @RequestBody ReservaCreateDTO dto) {
        ReservaDTO created = reservaService.create(dto);
        return ResponseEntity.status(201).body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservaDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(reservaService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<ReservaDTO>> getAll() {
        return ResponseEntity.ok(reservaService.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReservaDTO> update(@PathVariable Long id, @Valid @RequestBody ReservaCreateDTO dto) {
        return ResponseEntity.ok(reservaService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        reservaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
