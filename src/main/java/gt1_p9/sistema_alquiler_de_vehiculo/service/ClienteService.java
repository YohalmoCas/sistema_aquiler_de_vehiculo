package gt1_p9.sistema_alquiler_de_vehiculo.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import gt1_p9.sistema_alquiler_de_vehiculo.dto.ClienteDTO;
import gt1_p9.sistema_alquiler_de_vehiculo.model.Cliente;
import gt1_p9.sistema_alquiler_de_vehiculo.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    // Crear reserva
    public Cliente create(ClienteDTO dto){

        Cliente newCliente = new Cliente();

        newCliente.setDui(dto.getDui());
        newCliente.setNombre(dto.getNombre());
        newCliente.setApellido(dto.getApellido());
        newCliente.setTelefono(dto.getTelefono());
        newCliente.setEmail(dto.getEmail());
        newCliente.setDireccion(dto.getDireccion());
        newCliente.setNacionalidad(dto.getNacionalidad());

        return clienteRepository.save(newCliente);
    }


    // Buscar reserva
    public Cliente getById(Long id){
        return clienteRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Cliente no encontrado"));
    }


    // Lista todas las reservas
    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }


    // Actualizar una reserva
    public Cliente update(Long id, ClienteDTO dto){

        return clienteRepository.findById(id)
            .map(c -> {
                c.setDui(dto.getDui());
                c.setNombre(dto.getNombre());
                c.setApellido(dto.getApellido());
                c.setTelefono(dto.getTelefono());
                c.setEmail(dto.getEmail());
                c.setDireccion(dto.getDireccion());
                c.setNacionalidad(dto.getNacionalidad());

                return clienteRepository.save(c);
            }).orElseThrow(() -> new NoSuchElementException("Cliente no encontrado"));
    }


    // Eliminar reservación
    public void delete(Long id){
        if (!clienteRepository.existsById(id))
            throw new NoSuchElementException("Cliente no encontrado");
        clienteRepository.deleteById(id);
    }
}
