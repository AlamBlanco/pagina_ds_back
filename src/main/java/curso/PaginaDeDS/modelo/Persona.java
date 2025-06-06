package curso.PaginaDeDS.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persona {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private String mascota;
    private String color;

    public Persona(Integer id, String nombre, String apellido, String mascota, String color) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mascota = mascota;
        this.color = color;
    }

    public Persona() {
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMascota() {
        return mascota;
    }

    public String getColor() {
        return color;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", mascota='" + mascota + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
