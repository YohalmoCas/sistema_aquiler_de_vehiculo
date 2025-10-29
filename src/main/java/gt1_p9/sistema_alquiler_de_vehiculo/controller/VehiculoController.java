package gt1_p9.sistema_alquiler_de_vehiculo.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    // Está linea simula la base de datos temporalmente
    private List<String> vehiculosDB = new ArrayList<String>();


    @GetMapping("vehiculos")
    public ResponseEntity<List<String>> getVehhiculos(){
        return ResponseEntity.ok(vehiculosDB);
    }
    

    // Retorna el vehiculo especifico si existe
    @GetMapping("/vehiculos/{usuario}")
    public ResponseEntity<String> buscarVehiculo(@PathVariable String usuario){
        String vhc = "Vehiculo no encontrado";
        for(int i=0; i<vehiculosDB.size(); i++){
            if (vehiculosDB.get(i).equals(usuario)){
                vhc = usuario;
                break;
            }
        }
        return ResponseEntity.ok(vhc);
    }


    // Post para registrar un vehiculo
    @PostMapping("/registrar")
    public String registrarVehiculo(@RequestBody String newVehiculo){
        vehiculosDB.add(newVehiculo);
        return newVehiculo;
    }
}
