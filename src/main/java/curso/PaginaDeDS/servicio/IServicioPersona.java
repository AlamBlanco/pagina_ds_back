package curso.PaginaDeDS.servicio;

import curso.PaginaDeDS.modelo.Persona;

import java.util.List;

public interface IServicioPersona {

    public void anadirPersona(Persona per);

    public void eliminarPersona( Integer id);

    public void modificarPersona(Persona per);

    public Persona getPersona(Integer id);

    public List<Persona> getPersonas();
}
