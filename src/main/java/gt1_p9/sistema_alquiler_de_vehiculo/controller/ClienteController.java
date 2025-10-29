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
@RequestMapping("/usuarios")
public class ClienteController {

    // Está linea simula la base de datos temporalmente
    private List<String> clientesDB = new ArrayList<String>();


    @GetMapping("clientes")
    public ResponseEntity<List<String>> getClientes(){
        return ResponseEntity.ok(clientesDB);
    }
    

    // Retorna el cliente especifico si existe
    @GetMapping("/clientes/{usuario}")
    public ResponseEntity<String> buscarCliente(@PathVariable String usuario){
        String usr = "Cliente no encontrado";
        for(int i=0; i<clientesDB.size(); i++){
            if (clientesDB.get(i).equals(usuario)){
                usr = usuario;
                break;
            }
        }
        return ResponseEntity.ok(usr);
    }


    // Post para registrar un cliente
    @PostMapping("/registrar")
    public String registrarCliente(@RequestBody String newCliente){
        clientesDB.add(newCliente);
        return newCliente;
    }
}
