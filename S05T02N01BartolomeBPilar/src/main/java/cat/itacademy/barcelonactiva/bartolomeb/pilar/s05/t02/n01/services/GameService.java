package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.services;

import java.util.List;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception.GameException;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Game;

public interface GameService {

	String guardarGame(Integer id) throws GameException;

	List<Game> getGameByPlayerId(Integer id);

	void borrarByPlayerId(Integer id);

}
