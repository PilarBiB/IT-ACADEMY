package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.services;

import java.util.List;

/*import java.util.List;*/

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos.PlayerDTO;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos.PorcentageExitoDto;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception.GameException;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Player;

public interface PlayerService {

	public Player guardarPlayer(PlayerDTO playerDTO) throws GameException;

	List<PorcentageExitoDto> llistaPlayers();

	public Player actualizarPlayer(PlayerDTO playerDTO) throws GameException;

	public PorcentageExitoDto llistaPlayersPeorPorcentaje();

	public PorcentageExitoDto llistaPlayersMejorPorcentaje();

}
