package gt1_p9.sistema_alquiler_de_vehiculo.controller;

import gt1_p9.sistema_alquiler_de_vehiculo.dto.ClienteDTO;
import gt1_p9.sistema_alquiler_de_vehiculo.model.Cliente;
import gt1_p9.sistema_alquiler_de_vehiculo.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    //Registrar
    @PostMapping
    public ResponseEntity<Cliente> create(@jakarta.validation.Valid @RequestBody ClienteDTO dto) {
        return ResponseEntity.status(201).body(clienteService.create(dto));
    }

    //Buscar
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.getById(id));
    }

    //Listar
    @GetMapping
    public ResponseEntity<List<Cliente>> getAll() {
        return ResponseEntity.ok(clienteService.getAll());
    }

    //Actualizar
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Long id, @jakarta.validation.Valid @RequestBody ClienteDTO dto) {
        return ResponseEntity.ok(clienteService.update(id, dto));
    }

    //Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
