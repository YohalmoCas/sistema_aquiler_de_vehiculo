package gt1_p9.sistema_alquiler_de_vehiculo.service;

import gt1_p9.sistema_alquiler_de_vehiculo.model.Vehiculo;
import java.util.List;

public interface VehiculoService extends CrudService<Vehiculo, Long> {
    List<Vehiculo> listarDisponibles();
    Vehiculo cambiarEstado(Long idVehiculo, String descripcionEstado);
}
