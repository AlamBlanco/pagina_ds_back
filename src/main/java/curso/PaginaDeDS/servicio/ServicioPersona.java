package curso.PaginaDeDS.servicio;

import curso.PaginaDeDS.modelo.Persona;
import curso.PaginaDeDS.repositorio.IRepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPersona implements IServicioPersona {
    @Autowired
    private IRepositorioPersona personarepo;

    @Override
    public void anadirPersona(Persona per) {
        personarepo.save(per);
    }

    @Override
    public void eliminarPersona(Integer id) {
        personarepo.deleteById(id);
    }

    @Override
    public void modificarPersona(Persona per) {
        Persona o = this.getPersona(per.getId());
        o.setId(per.getId());
        o.setNombre(per.getNombre());
        o.setApellido(per.getApellido());
        o.setMascota(per.getMascota());
        o.setColor(per.getColor());

        this.anadirPersona(o); //JPA actualiza si el id ya existe, y como acá hay un id que ya tiene otra entidad, la reemplazará
    }

    @Override
    public Persona getPersona(Integer id) {
        Persona persona = personarepo.findById(id).orElse(null);
        return persona;
    }

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = personarepo.findAll();
        return listaPersonas;
    }
}
