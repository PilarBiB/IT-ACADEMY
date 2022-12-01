package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception.GameException;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception.InternalServerErrorException;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception.NotFountException;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Game;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Player;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.repositories.GameRepository;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.repositories.PlayerRepository;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.services.GameService;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	GameRepository gameRepository;

	@Autowired
	PlayerRepository playerRepository;

	public String guardarGame(Integer id) throws GameException {

		final Logger LOGGER = LoggerFactory.getLogger(GameServiceImpl.class);

		int dado1 = (int) (Math.random() * 6 + 1);
		int dado2 = (int) (Math.random() * 6 + 1);

		final Player playertId = playerRepository.findById(id)
				.orElseThrow(() -> new NotFountException("Player not fount", "Player not fount"));

		final Game saveGame = new Game();
		saveGame.setDau1(dado1);
		saveGame.setDau2(dado2);
		if ((dado1 + dado2) == 7) {
			saveGame.setGuanyar(true);
		} else {
			saveGame.setGuanyar(false);
		}
		saveGame.setPlayer(playertId);
		try {
			gameRepository.save(saveGame);
		} catch (final Exception e) {
			LOGGER.error("INTERNAL_SERVER_ERROR", e);
			throw new InternalServerErrorException("INTERNAL_SERVER_ERROR", "INTERNAL_SERVER_ERROR");
		}

		return "Haz lanzado los dados correctamente";
	}

	public void borrarByPlayerId(Integer id) {
		gameRepository.deleteByPlayerId(id);
	}

	public List<Game> getGameByPlayerId(Integer id) {
		List<Game> game = gameRepository.findByPlayerId(id);
		return game;

	}

}
