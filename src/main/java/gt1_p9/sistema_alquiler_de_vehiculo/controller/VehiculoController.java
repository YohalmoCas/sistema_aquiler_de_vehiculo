package gt1_p9.sistema_alquiler_de_vehiculo.controller;

import org.springframework.web.bind.annotation.RestController;

import gt1_p9.sistema_alquiler_de_vehiculo.dto.VehiculoDTO;
import gt1_p9.sistema_alquiler_de_vehiculo.model.Vehiculo;
import gt1_p9.sistema_alquiler_de_vehiculo.service.VehiculoService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/vehiculos")
@RequiredArgsConstructor
public class VehiculoController {
    
    private final VehiculoService vehiculoService;
    
    // Retorna el vehiculo especifico si existe
    @GetMapping("/{idVehiculo}")
    public ResponseEntity<Vehiculo> buscarVehiculo(@PathVariable Long idVehiculo){
        return vehiculoService.buscarVehiculo(idVehiculo)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }
    

    //Listar
    @GetMapping
    public ResponseEntity<List<Vehiculo>> getVehiculos(){
        return ResponseEntity.ok(vehiculoService.obtenerVehiculos());
    }
    

    // Registrar un vehiculo
    @PostMapping("/registrar")
    public ResponseEntity<Vehiculo> registrarVehiculo(@RequestBody VehiculoDTO vehiculoRequest){
        return ResponseEntity.ok(vehiculoService.registrarVehiculo(vehiculoRequest));
    }


    //Eliminar
    @DeleteMapping("/{idVehiculo}")
    public ResponseEntity<String> eliminar(@PathVariable Long idVehiculo) {
         vehiculoService.borrarVehiculo(idVehiculo);
         return
            ResponseEntity.ok(Map.of("message", "Vehiculo eliminado con exito", "idEliminado", idVehiculo).toString());
    }
}
