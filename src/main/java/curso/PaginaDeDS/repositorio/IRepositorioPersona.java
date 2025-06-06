package curso.PaginaDeDS.repositorio;

import curso.PaginaDeDS.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioPersona extends JpaRepository<Persona,Integer> {
}
