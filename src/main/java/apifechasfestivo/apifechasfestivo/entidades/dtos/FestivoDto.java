package apifechasfestivo.apifechasfestivo.entidades.dtos;

import java.util.Date;

public class FestivoDto {

    private String nombre;
    private Date fecha;

    
    public FestivoDto() {
    }

    public FestivoDto(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    // Getters y setters (métodos de acceso) para nombre y fecha

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}