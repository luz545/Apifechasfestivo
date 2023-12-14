package apifechasfestivo.apifechasfestivo.controladores;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apifechasfestivo.apifechasfestivo.entidades.Festivo;
import apifechasfestivo.apifechasfestivo.entidades.dtos.FestivoDto;
import apifechasfestivo.apifechasfestivo.servicios.interfaces.IFestivoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
 @RequestMapping("/festivo")

public class FestivoControlador {
    
    @Autowired
    private IFestivoServicio servicio;
   //@ResponseBody
    //public String saludo() {
    //    return "Ok!";
    //}
    
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value="/verificar/{fecha}")
    @ResponseBody
    // public String verificarFestivo(@PathVariable int año, @PathVariable int mes, @PathVariable int dia){
    public String verificarFestivo(@PathVariable Date fecha){
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Año: " + year + ", Mes: " + month + ", Day: " + day);

 
        if (servicio.esFestivo(fecha) == true) {
            return "Es Festivo";
        } else {
            return "No es festivo";
        }
        
    }
  /*@CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/obtenerFestivos/{año}")
    public FestivoDto obtenerFestivos(@PathVariable int festivos, int año) {
        return (FestivoDto) servicio.obtenerFestivos(año);
    } */
}
