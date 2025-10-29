package gt1_p9.sistema_alquiler_de_vehiculo.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    // Está linea simula la base de datos temporalmente
    private List<String> reservasDB = new ArrayList<String>();


    // Retorna la lista de reservas
    @GetMapping()
    public ResponseEntity<List<String>> getReservas(){
        return ResponseEntity.ok(reservasDB);
    }


    // Retorna la reserva especifica si existe
    @GetMapping("/{usuario}")
    public ResponseEntity<String> buscarReserva(@PathVariable String usuario){
        String resv = "Reserva no encontrada";
        for(int i=0; i<reservasDB.size(); i++){
            if (reservasDB.get(i).equals(usuario)){
                resv = usuario;
                break;
            }
        }
        return ResponseEntity.ok(resv);
    }


    // Post para crear una reserva
    @PostMapping("/alquilar")
    public String hacerReserva(@RequestBody String newReserva){
        reservasDB.add(newReserva);
        return newReserva;
    }


    @DeleteMapping("{id}")
    public void borrarReserva(@PathVariable String id){
        for(int i=0; i<reservasDB.size(); i++){
            if (reservasDB.get(i).equals(id)){
                reservasDB.remove(i);
                break;
            }
        }
    }
}
