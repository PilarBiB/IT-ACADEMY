package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.config.seguridad.JwtTokenProvider;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos.JwtAuthResponseDTO;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos.LoginDTO;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos.RegistroDTO;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Player;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Roles;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.repositories.PlayerRepository;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.repositories.RolesRepository;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	private RolesRepository rolesRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private JwtTokenProvider jwtTokenProvider;

	@PostMapping("/iniciarSesion")
	public ResponseEntity<JwtAuthResponseDTO> authenticateUser(@RequestBody LoginDTO loginDTO) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getUsername(), loginDTO.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		// obtenemos el token del jwtTokenProvider
		String token = jwtTokenProvider.generarToken(authentication);

		return ResponseEntity.ok(new JwtAuthResponseDTO(token));
	}

	@PostMapping("/registrar")
	public ResponseEntity<?> registrarUsuario(@RequestBody RegistroDTO registroDTO) {
		if (playerRepository.existsByPlayerNom(registroDTO.getUsername())) {
			return new ResponseEntity<>("Ese nombre de usuario ya existe", HttpStatus.BAD_REQUEST);
		}

		final Player savePlayer = new Player();
		savePlayer.setPlayerNom(registroDTO.getUsername());
		savePlayer.setPassword(passwordEncoder.encode(registroDTO.getPassword()));
		savePlayer.setDataRegistre(registroDTO.getDataRegistre());

		Roles roles = rolesRepository.findByNombre("ROLE_ADMIN").get();
		//Roles roles = rolesRepository.findByNombre("ROLE_USER").get();
		savePlayer.setRoles(Collections.singleton(roles));

		playerRepository.save(savePlayer);
		return new ResponseEntity<>("Usuario registrado exitosamente", HttpStatus.OK);
	}
}