package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.services;

import java.util.List;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception.GameException;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Game;

public interface GameService {

	String guardarGame(String id) throws GameException;

	List<Game> getGameByPlayerId(String id);

	void borrarByPlayerId(String id);

}
