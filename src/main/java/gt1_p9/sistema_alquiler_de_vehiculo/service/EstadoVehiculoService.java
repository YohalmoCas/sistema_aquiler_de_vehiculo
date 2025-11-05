package gt1_p9.sistema_alquiler_de_vehiculo.service;

import gt1_p9.sistema_alquiler_de_vehiculo.model.EstadoVehiculo;

public interface EstadoVehiculoService extends CrudService<EstadoVehiculo, Integer> {
    EstadoVehiculo buscarPorDescripcion(String descripcion);
}