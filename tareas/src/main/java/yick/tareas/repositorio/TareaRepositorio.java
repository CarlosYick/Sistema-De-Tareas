package yick.tareas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import yick.tareas.modelo.Tarea;

public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {
}
