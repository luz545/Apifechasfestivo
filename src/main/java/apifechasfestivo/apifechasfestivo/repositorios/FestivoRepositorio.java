package apifechasfestivo.apifechasfestivo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import apifechasfestivo.apifechasfestivo.entidades.Festivo;

public interface FestivoRepositorio extends JpaRepository<Festivo, Integer> {

}
