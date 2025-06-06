package curso.PaginaDeDS.controlador;

import curso.PaginaDeDS.modelo.Persona;
import curso.PaginaDeDS.servicio.IServicioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControladorPersona {

    @Autowired                 //Se inyecta la interfaz de servicio, no la implementación
    private IServicioPersona serviperso;

    @PostMapping("/anadir_persona")
    public String anadir_persona(@RequestBody Persona per){
        serviperso.anadirPersona(per);
        return "Se agregó correctamente!";
    }

    @DeleteMapping("/eliminar_persona/{id}")
    public String eliminar_persona(@PathVariable Integer id){
        serviperso.eliminarPersona(id);
        return "Se eliminó correctamente!";
    }

    @PutMapping("/modificar_persona/{id}")
    public String modificar_persona(@PathVariable Integer id, @RequestBody Persona per){
        per.setId(id);
        serviperso.anadirPersona(per);
        return "Se modificó correctamente!";
    }

    @GetMapping("/persona/{id}")
    public Persona getPersona(@PathVariable Integer id){
        return serviperso.getPersona(id);
    }

    @GetMapping("/personas")
    public List<Persona> getPersonas(){
        return serviperso.getPersonas();
    }

}
