package gt1_p9.sistema_alquiler_de_vehiculo.service;

import gt1_p9.sistema_alquiler_de_vehiculo.model.Pago;
import java.util.List;

public interface PagoService extends CrudService<Pago, Long> {
    List<Pago> listarPorReserva(Long idReserva);
}
