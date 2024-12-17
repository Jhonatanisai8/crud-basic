package procedures;

import java.util.List;

public interface Repositorio<T> {
    boolean insertar(T t);

    List<T> listar();
}
