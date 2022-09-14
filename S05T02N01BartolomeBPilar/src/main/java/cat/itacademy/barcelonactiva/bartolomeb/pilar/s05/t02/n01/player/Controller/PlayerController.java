package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/*import org.springframework.ui.Model;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.service.PlayerService;

@Controller
@RequestMapping("/players")
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	/*@Autowired
	private PlayerRepository playerRepository;*/
	
	@ModelAttribute("player")
	public PlayerDTO retornarNouPlayerDTO() {
		return new PlayerDTO();
	}
	@GetMapping
	public String veureFormulariNouPlayer(/*Model model*/) {
		//model.addAttribute("player", new Player());
		return "player_formulari";
	}
	@PostMapping
	public String registrarPlayer(@ModelAttribute("player") PlayerDTO playerDTO){
		playerService.guardarPlayer(playerDTO);
		return "redirect:/player_formulari?exit";
	}
	/*@GetMapping
	public String llistarPlayers(Model model) {
		List<Player> llistaPlayers = playerRepository.findAll();
		model.addAttribute("llistaPlayers", llistaPlayers);
		return "/players";	
	}*/	
		
}
