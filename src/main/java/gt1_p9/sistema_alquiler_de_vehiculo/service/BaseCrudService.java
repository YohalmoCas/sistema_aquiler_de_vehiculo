package gt1_p9.sistema_alquiler_de_vehiculo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public abstract class BaseCrudService<T, ID> implements CrudService<T, ID> {

    protected abstract JpaRepository<T, ID> getRepo();

    @Override public List<T> listarTodos() { return getRepo().findAll(); }

    @Override public T buscarPorId(ID id) {
        return getRepo().findById(id).orElseThrow(() -> new RuntimeException("No encontrado: " + id));
    }

    @Override public T crear(T entidad) { return getRepo().save(entidad); }

    @Override public T actualizar(ID id, T entidadActualizada) { return getRepo().save(entidadActualizada); }

    @Override public void eliminar(ID id) { getRepo().deleteById(id); }
}
