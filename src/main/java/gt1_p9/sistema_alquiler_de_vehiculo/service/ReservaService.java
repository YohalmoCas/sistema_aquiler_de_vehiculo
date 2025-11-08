package gt1_p9.sistema_alquiler_de_vehiculo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import gt1_p9.sistema_alquiler_de_vehiculo.dto.ReservaCreateDTO;
import gt1_p9.sistema_alquiler_de_vehiculo.dto.ReservaDTO;
import gt1_p9.sistema_alquiler_de_vehiculo.model.Reserva;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservaService {
    private Long newId = 1L;

    private final Map<Long, Reserva> reservaMap;

    // Crear reserva
    public ReservaDTO create(ReservaCreateDTO dto){
        for(Long i: reservaMap.keySet()){
            Reserva reserva = reservaMap.get(i);

            LocalDate fi1 = reserva.getFecha_inicio();
            LocalDate fi2 = dto.getFecha_inicio();

            if (fi1.isEqual(fi2)){
                return null;

            } else if(fi1.isBefore(fi2)){
                LocalDate ff1 = reserva.getFecha_final();

                if (ff1.isBefore(fi2)){
                    return null;
                }
            } else{
                LocalDate ff2 = dto.getFecha_final();

                if (fi1.isBefore(ff2)){
                    return null;
                }
            }
        }

        Reserva newReserva = new Reserva();

        newReserva.setId_reserva(newId);
        newReserva.setId_cliente(dto.getId_cliente());
        newReserva.setId_vehiculo(dto.getId_vehiculo());
        newReserva.setId_estado(2L);
        newReserva.setFecha_inicio(dto.getFecha_inicio());
        newReserva.setFecha_final(dto.getFecha_final());
        newReserva.setLugar_entrega(dto.getLugar_entrega());
        newReserva.setPrecio_total(800);

        reservaMap.put(newReserva.getId_reserva(), newReserva);
        newId += 1;

        ReservaDTO newReservaDTO = getById(newReserva.getId_reserva());

        return newReservaDTO;
    }


    // Buscar reserva
    public ReservaDTO getById(Long id){
        if (reservaMap.containsKey(id)){
            Reserva newReserva = reservaMap.get(id);
            ReservaDTO newReservaDTO = new ReservaDTO();
            
            newReservaDTO.setId_cliente(newReserva.getId_cliente());
            newReservaDTO.setId_vehiculo(newReserva.getId_vehiculo());
            newReservaDTO.setId_estado(newReserva.getId_estado());
            newReservaDTO.setFecha_inicio(newReserva.getFecha_inicio());
            newReservaDTO.setFecha_final(newReserva.getFecha_final());
            newReservaDTO.setFecha_final(newReserva.getFecha_final());
            newReservaDTO.setLugar_entrega(newReserva.getLugar_entrega());
            newReservaDTO.setPrecio_total(newReserva.getPrecio_total());
            return newReservaDTO;

        } else{
            return null;
        }
    }


    // Lista todas las reservas
    public List<ReservaDTO> getAll(){
        List<ReservaDTO> newList = new ArrayList<>();

        for(Long i: reservaMap.keySet()){
            Reserva reserva = reservaMap.get(i);

            newList.add(getById(reserva.getId_reserva()));
        }

        return newList;
    }


    // Actualizar una reserva
    public ReservaDTO update(Long id, ReservaCreateDTO dto){
        
        if (!reservaMap.containsKey(id)){
            return null;
        }

        Reserva oldReserva = reservaMap.get(id);

        oldReserva.setId_cliente(dto.getId_cliente());
        oldReserva.setId_vehiculo(dto.getId_vehiculo());
        oldReserva.setFecha_inicio(dto.getFecha_inicio());
        oldReserva.setFecha_final(dto.getFecha_final());
        oldReserva.setLugar_entrega(dto.getLugar_entrega());

        ReservaDTO newReservaDTO = getById(id);

        return newReservaDTO;
    }


    // Eliminar reservación
    public void delete(Long id){
        if (!reservaMap.containsKey(id)){
            return;
        }

        reservaMap.remove(id);
    }
}
