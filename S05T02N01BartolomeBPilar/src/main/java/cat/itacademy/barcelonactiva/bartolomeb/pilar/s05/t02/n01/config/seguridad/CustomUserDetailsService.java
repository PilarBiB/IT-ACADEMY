package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.config.seguridad;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Player;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Roles;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.repositories.PlayerRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
		Player player = playerRepository.findByPlayerNom(usernameOrEmail)
				.orElseThrow(() -> new UsernameNotFoundException(
						"Usuario no encontrado con ese username o email : " + usernameOrEmail));

		return new User(player.getPlayerNom(), player.getPassword(), mapearRoles(player.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapearRoles(Set<Roles> roles) {
		return roles.stream().map(rol -> new SimpleGrantedAuthority(rol.getNombre())).collect(Collectors.toList());
	}
}
