package gt1_p9.sistema_alquiler_de_vehiculo.service;

import gt1_p9.sistema_alquiler_de_vehiculo.model.Mantenimiento;
import java.util.List;

public interface MantenimientoService extends CrudService<Mantenimiento, Long> {
    List<Mantenimiento> listarPorVehiculo(Long idVehiculo);
}
