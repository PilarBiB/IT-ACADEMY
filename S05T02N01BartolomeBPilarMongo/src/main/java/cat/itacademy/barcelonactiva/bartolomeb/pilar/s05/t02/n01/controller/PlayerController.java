package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos.PlayerDTO;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos.PorcentageExitoDto;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception.GameException;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Player;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.services.PlayerService;

@RestController
@RequestMapping("/api")
public class PlayerController {

	@Autowired
	private PlayerService playerService;

	@PostMapping(path = "/players")
	public ResponseEntity<Player> registrarPlayer(@RequestBody PlayerDTO playerDTO) throws GameException {
		Player player = playerService.guardarPlayer(playerDTO);
		return ResponseEntity.ok(player);

	}

	@PutMapping(path = "/players")
	public ResponseEntity<Player> actualizarPlayer(@RequestBody PlayerDTO playerDTO) throws GameException {
		Player player = playerService.actualizarPlayer(playerDTO);
		return ResponseEntity.ok(player);
	}

	@GetMapping("/players")
	public ResponseEntity<List<PorcentageExitoDto>> llistarPlayersPorcentajeExito() {
		List<PorcentageExitoDto> player = playerService.llistaPlayers();
		ResponseEntity<List<PorcentageExitoDto>> response = ResponseEntity.ok().body(player);
		return response;
	}

	@GetMapping("/players/ranking")
	public ResponseEntity<List<PorcentageExitoDto>> rankingPlayersPorcentajeExito() {
		List<PorcentageExitoDto> player = playerService.llistaPlayers();
		ResponseEntity<List<PorcentageExitoDto>> response = ResponseEntity.ok().body(player);
		return response;
	}

	@GetMapping("/players/ranking/loser")
	public ResponseEntity<PorcentageExitoDto> mayorPlayersPorcentajeExito() {
		return ResponseEntity.ok(playerService.llistaPlayersPeorPorcentaje());

	}

	@GetMapping("/players/ranking/winner")
	public ResponseEntity<PorcentageExitoDto> peorPlayersPorcentajeExito() {
		return ResponseEntity.ok(playerService.llistaPlayersMejorPorcentaje());
	}

}
