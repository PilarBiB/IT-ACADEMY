package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.model.Player;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.repository.PlayerRepository;

@Controller
public class GameController {

	@Autowired
	private GameRepository gameRepository;
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@GetMapping("/players/{id}/formulari")
	public String veureFormulariNouGame(Model model) {
		List<Player> llistaPlayers =playerRepository.findAll();
		model.addAttribute("game", new Game());
		model.addAttribute("llistaPlayers", llistaPlayers);
		return "game_formulari";	
	}
	@PostMapping("/players/{id}/games/")
	public String guardarGame(Game game) {
		gameRepository.save(game);
		return "redirect:/";
	}
	@GetMapping("/games")
	public String llistarGames(Model model) {
		List <Game> llistaGames = gameRepository.findAll();
		model.addAttribute("llistaGames", llistaGames);
		return "games";		
	}
	@GetMapping("/players/{id}")
	public String veureFormulariModificarNom(@PathVariable("id") Integer id, Model model) {
		Player player = playerRepository.findById(id).get();
		model.addAttribute("player", player);
		return "player_formulari";
	}
	@GetMapping("/players/{id}/games")
	public String eliminarGames(@PathVariable("id") Integer id) {
		//Player player = playerRepository.borrarById(id);
		return "redirect:/games";
	}
	
	
	
}	
