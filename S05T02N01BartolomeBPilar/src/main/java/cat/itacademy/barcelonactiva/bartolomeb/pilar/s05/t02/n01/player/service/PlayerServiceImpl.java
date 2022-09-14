package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/*import java.util.Optional;*/
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.Controller.PlayerDTO;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.model.Player;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.model.Rol;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.repository.PlayerRepository;

/*import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.Player;*/

@Service
public class PlayerServiceImpl implements PlayerService{
	
	private PlayerRepository playerRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public PlayerServiceImpl(PlayerRepository playerRepository) {
		super();
		this.playerRepository = playerRepository;
	}
	
	@Override
	public Player guardarPlayer(PlayerDTO playerDTO) {
		Player player = new Player(playerDTO.getPlayerNom(), passwordEncoder.encode(playerDTO.getPassword()), Arrays.asList(new Rol("ROL_PLAYER")));
		/*if (resultat.getPlayerNom() == null || resultat.getPlayerNom() == "") {
			resultat.setPlayerNom("Anònim");
		}else if (resultat.getPlayerNom().equalsIgnoreCase(playerDTO.getPlayerNom())) {
			System.out.println("Aquest nom ja existeix. Siusplau posa un altre nom");
		}else {	
			playerRepository.save(playerDTO);
		}*/	
		return playerRepository.save(player);	
	}
	/*@Override
	public List<Player> findAll(){
		return playerRepository.findAll();		
	}
	@Override
	public Player getPlayerById(Integer id) {
		Player resultat = new Player();
		Optional<Player> player = playerRepository.findById (id);
		if (player.isPresent()) {
			player = playerRepository.findById(id);
		}
	return resultat;	
	}
	@Override
	public void borrarById(Integer id) {
		playerRepository.deleteById(id);
	}*/
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Player player = playerRepository.findByPlayerNom(username);
		if(player == null) {
			throw new UsernameNotFoundException("Nom o password incorrectes");
		}
		return new User(player.getPlayerNom(), player.getPassword(), mapearAutoridadesRols(player.getRols()));
	}
	private Collection<? extends GrantedAuthority> mapearAutoridadesRols(Collection<Rol> rols){
		return rols.stream().map(role -> new SimpleGrantedAuthority(role.getNom())).collect(Collectors.toList());
	}
	@Override
	public List<Player> llistaPlayers() {
		return playerRepository.findAll();
	}
	
}
