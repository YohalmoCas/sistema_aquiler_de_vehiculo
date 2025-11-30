package gt1_p9.sistema_alquiler_de_vehiculo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import gt1_p9.sistema_alquiler_de_vehiculo.dto.ReservaCreateDTO;
import gt1_p9.sistema_alquiler_de_vehiculo.model.Cliente;
import gt1_p9.sistema_alquiler_de_vehiculo.model.EstadoReserva;
import gt1_p9.sistema_alquiler_de_vehiculo.model.Reserva;
import gt1_p9.sistema_alquiler_de_vehiculo.model.Vehiculo;
import gt1_p9.sistema_alquiler_de_vehiculo.repository.ClienteRepository;
import gt1_p9.sistema_alquiler_de_vehiculo.repository.EstadoReservaRepository;
import gt1_p9.sistema_alquiler_de_vehiculo.repository.ReservaRepository;
import gt1_p9.sistema_alquiler_de_vehiculo.repository.VehiculoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservaService {

    private final ReservaRepository reservaRepo;
    private final ClienteRepository clienteRepository;
    private final VehiculoRepository vehiculoRepository;
    private final EstadoReservaRepository estadoReservaRepository;

    // Crear reserva
    public Reserva create(ReservaCreateDTO dto){

        Cliente cliente = clienteRepository.findById(dto.getId_cliente())
            .orElseThrow(() -> new NoSuchElementException("Cliente no encontrado"));

        Vehiculo vehiculo = vehiculoRepository.findById(dto.getId_vehiculo())
            .orElseThrow(() -> new NoSuchElementException("Vehículo no encontrado"));

        EstadoReserva estadoReserva = estadoReservaRepository.findById(1L)
            .orElseThrow(() -> new NoSuchElementException("Error en el estado"));
            
            Reserva newReserva = new Reserva();
            
        newReserva.setId_cliente(cliente);
        newReserva.setId_vehiculo(vehiculo);
        newReserva.setId_estado(estadoReserva);
        newReserva.setFecha_inicio(dto.getFecha_inicio());
        newReserva.setFecha_final(dto.getFecha_final());
        newReserva.setLugar_entrega(dto.getLugar_entrega());
        newReserva.setPrecio_total(800);

        return reservaRepo.save(newReserva);
    }

    
    // BUSCAR RESERVA
    public Optional<Reserva> getPorId(Long id){
        return Optional.ofNullable(reservaRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Reserva no encontrada")));
    }


    // LISTAR TODAS LAS RESERVAS
    public List<Reserva> getAll(){
        return reservaRepo.findAll();
    }


    // Actualizar una reserva
    public Reserva update(Long id, ReservaCreateDTO dto){
        return reservaRepo.findById(id)
            .map(r -> {
                Vehiculo vehiculo = vehiculoRepository.findById(dto.getId_vehiculo())
                    .orElseThrow(() -> new NoSuchElementException("Vehículo no encontrado"));

                EstadoReserva estadoReserva = estadoReservaRepository.findById(1L)
                    .orElseThrow(() -> new NoSuchElementException("Error en el estado"));
            
                r.setId_vehiculo(vehiculo);
                r.setId_estado(estadoReserva);
                r.setFecha_inicio(dto.getFecha_inicio());
                r.setFecha_final(dto.getFecha_final());
                r.setLugar_entrega(dto.getLugar_entrega());

                return reservaRepo.save(r);
            }).orElseThrow(() -> new NoSuchElementException("Reserva no encontrada"));
    }


    // Eliminar reservación
    public void delete(Long id){
        if (!reservaRepo.existsById(id))
            throw new NoSuchElementException("Reserva no encontrada");
        reservaRepo.deleteById(id);
    }
}
