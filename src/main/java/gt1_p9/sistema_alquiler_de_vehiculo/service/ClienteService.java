package gt1_p9.sistema_alquiler_de_vehiculo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import gt1_p9.sistema_alquiler_de_vehiculo.dto.ClienteDTO;
import gt1_p9.sistema_alquiler_de_vehiculo.model.Cliente;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private Long newId = 1L;

    private final Map<Long, Cliente> clienteMap;

    // Crear reserva
    public ClienteDTO create(ClienteDTO dto){

        Cliente newCliente = new Cliente();

        newCliente.setId_cliente(newId);
        newCliente.setDui(dto.getDui());
        newCliente.setNombre(dto.getNombre());
        newCliente.setApellido(dto.getApellido());
        newCliente.setTelefono(dto.getTelefono());
        newCliente.setEmail(dto.getEmail());
        newCliente.setDireccion(dto.getDireccion());
        newCliente.setNacionalidad(dto.getNacionalidad());

        clienteMap.put(newCliente.getId_cliente(), newCliente);

        return dto;
    }


    // Buscar reserva
    public ClienteDTO getById(Long id){
        if (clienteMap.containsKey(id)){
            Cliente newCliente = clienteMap.get(id);
            ClienteDTO newClienteDTO = new ClienteDTO();
            
            newClienteDTO.setDui(newCliente.getDui());
            newClienteDTO.setNombre(newCliente.getNombre());
            newClienteDTO.setApellido(newCliente.getApellido());
            newClienteDTO.setTelefono(newCliente.getTelefono());
            newClienteDTO.setEmail(newCliente.getEmail());
            newClienteDTO.setDireccion(newCliente.getDireccion());
            newClienteDTO.setNacionalidad(newCliente.getNacionalidad());
            return newClienteDTO;

        } else{
            return null;
        }
    }


    // Lista todas las reservas
    public List<ClienteDTO> getAll(){
        List<ClienteDTO> newList = new ArrayList<>();

        for(Long i: clienteMap.keySet()){
            Cliente cliente = clienteMap.get(i);

            newList.add(getById(cliente.getId_cliente()));
        }

        return newList;
    }


    // Actualizar una reserva
    public ClienteDTO update(Long id, ClienteDTO dto){
        
        if (!clienteMap.containsKey(id)){
            return null;
        }

        Cliente oldCliente = clienteMap.get(id);

        oldCliente.setDui(dto.getDui());
        oldCliente.setNombre(dto.getNombre());
        oldCliente.setApellido(dto.getApellido());
        oldCliente.setTelefono(dto.getTelefono());
        oldCliente.setEmail(dto.getEmail());
        oldCliente.setDireccion(dto.getDireccion());
        oldCliente.setNacionalidad(dto.getNacionalidad());

        ClienteDTO newClienteDTO = getById(id);

        return newClienteDTO;
    }


    // Eliminar reservación
    public void delete(Long id){
        if (!clienteMap.containsKey(id)){
            return;
        }

        clienteMap.remove(id);
    }
}
