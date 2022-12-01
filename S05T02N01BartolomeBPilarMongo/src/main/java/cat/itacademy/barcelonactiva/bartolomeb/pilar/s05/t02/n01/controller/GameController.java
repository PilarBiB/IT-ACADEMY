package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception.GameException;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Game;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.services.GameService;

@RestController
@RequestMapping("/api")
public class GameController {

	@Autowired
	private GameService gameService;

	@PostMapping("/players/{id}/games")
	public ResponseEntity<String> guardarGame(@PathVariable("id") String id) throws GameException {
		return new ResponseEntity<>(gameService.guardarGame(id), HttpStatus.OK);

	}

	@DeleteMapping("/players/{id}/games")
	public ResponseEntity<String> deleteGames(@PathVariable("id") String id) {
		gameService.borrarByPlayerId(id);
		return new ResponseEntity<String>("Juego Borrado", HttpStatus.OK);
	}

	@GetMapping("/players/{id}/games")
	public ResponseEntity<List<Game>> eliminarGames(@PathVariable("id") String id) {
		List<Game> player = gameService.getGameByPlayerId(id);
		ResponseEntity<List<Game>> response = ResponseEntity.ok().body(player);
		return response;
	}

}
