package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.service.PlayerService;

@Controller
public class RegistreController {
	
	@Autowired
	private PlayerService service;
	
	/*@GetMapping("/")
	public String veurePaginaInici() {
		return "player_formulari";
	}*/

	@GetMapping("/login")
	public String iniciarSessio() {
		return "login";
	}
	@GetMapping("/")
	public String veurePaginaInici(Model model) {
		model.addAttribute("players", service.llistaPlayers());
		return "index";
	}
}
