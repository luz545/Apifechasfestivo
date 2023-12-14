package apifechasfestivo.apifechasfestivo.servicios.interfaces;

import java.util.Date;
import java.util.List;

import apifechasfestivo.apifechasfestivo.entidades.dtos.FestivoDto;

public interface IFestivoServicio {
    
    public List<FestivoDto> obtenerFestivos(int año);
    public boolean esFestivo(Date fecha);
    public boolean esFechaValida(String strFecha);
    //public FestivoDto obtener(int año);
}
