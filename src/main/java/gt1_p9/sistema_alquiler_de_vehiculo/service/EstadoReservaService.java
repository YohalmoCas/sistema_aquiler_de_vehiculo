package gt1_p9.sistema_alquiler_de_vehiculo.service;

import gt1_p9.sistema_alquiler_de_vehiculo.model.EstadoReserva;

public interface EstadoReservaService extends CrudService<EstadoReserva, Integer> {
    EstadoReserva buscarPorDescripcion(String descripcion);
}
