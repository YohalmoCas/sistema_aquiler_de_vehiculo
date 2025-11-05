package gt1_p9.sistema_alquiler_de_vehiculo.service;

import java.util.List;

public interface CrudService<T, ID> {
    List<T> listarTodos();
    T buscarPorId(ID id);
    T crear(T entidad);
    T actualizar(ID id, T entidadActualizada);
    void eliminar(ID id);
}
