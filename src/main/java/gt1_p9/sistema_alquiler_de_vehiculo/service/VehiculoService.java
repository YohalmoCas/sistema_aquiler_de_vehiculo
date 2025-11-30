package gt1_p9.sistema_alquiler_de_vehiculo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import gt1_p9.sistema_alquiler_de_vehiculo.dto.VehiculoDTO;
import gt1_p9.sistema_alquiler_de_vehiculo.model.EstadoVehiculo;
import gt1_p9.sistema_alquiler_de_vehiculo.model.Sucursal;
import gt1_p9.sistema_alquiler_de_vehiculo.model.Vehiculo;
import gt1_p9.sistema_alquiler_de_vehiculo.repository.EstadoVehiculoRepository;
import gt1_p9.sistema_alquiler_de_vehiculo.repository.SucursalRepository;
import gt1_p9.sistema_alquiler_de_vehiculo.repository.VehiculoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VehiculoService {

    private final VehiculoRepository vehiculoRepository;
    private final EstadoVehiculoRepository estadoVehiculoRepository;
    private final SucursalRepository sucursalRepository;


    //Crear
    public Vehiculo registrarVehiculo(VehiculoDTO requestDto){
        Vehiculo newVehiculo = new Vehiculo();
        EstadoVehiculo estado = estadoVehiculoRepository.findById(requestDto.getId_estado())
            .orElseThrow(() -> new NoSuchElementException("Estado no valido"));

        Sucursal sucursal = sucursalRepository.findById(requestDto.getId_sucursal())
            .orElseThrow(() -> new NoSuchElementException("Sucursal no encontrada"));

        newVehiculo.setId_estado(estado);
        newVehiculo.setId_sucursal(sucursal);
        newVehiculo.setMatricula(requestDto.getMatricula());
        newVehiculo.setMarca(requestDto.getMarca());
        newVehiculo.setModelo(requestDto.getModelo());
        newVehiculo.setAnio_fabricacion(requestDto.getAnio_fabricacion());
        newVehiculo.setColor(requestDto.getColor());
        newVehiculo.setKilometraje(requestDto.getKilometraje());
        newVehiculo.setTipo(requestDto.getTipo());
        newVehiculo.setTipo_combustible(requestDto.getTipo_combustible());

        return vehiculoRepository.save(newVehiculo);
    }



    //Borrar
    public void borrarVehiculo(Long id){
        if (!vehiculoRepository.existsById(id))
            throw new NoSuchElementException("Vehiculo no encontrado");
        vehiculoRepository.deleteById(id);
    }



    //Buscar
    public Optional<Vehiculo> buscarVehiculo(Long id){
        return Optional.ofNullable(vehiculoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Vehículo no encontrado")));
    }


    //Todos
    public List<Vehiculo> obtenerVehiculos(){
        return vehiculoRepository.findAll();
    }
}
