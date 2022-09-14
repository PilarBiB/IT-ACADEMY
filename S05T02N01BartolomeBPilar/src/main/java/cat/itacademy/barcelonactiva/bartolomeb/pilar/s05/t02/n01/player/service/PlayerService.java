package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.service;

import java.util.List;

/*import java.util.List;*/

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
/*import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.PlayerDTO;*/
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.Controller.PlayerDTO;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.model.Player;

public interface PlayerService extends UserDetailsService{

		public Player guardarPlayer(PlayerDTO playerDTO);
		
		public List<Player> llistaPlayers();

		/*UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
		
		List<Player> findAll();
		
		Player getPlayerById(Integer id);
		
		void borrarById(Integer id);

		Player getPlayerByPlayerNom(String playerNom);*/

}
