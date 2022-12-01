package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.services.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos.PlayerDTO;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos.PorcentageExitoDto;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception.GameException;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception.InternalServerErrorException;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception.NotFountException;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Game;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Player;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.repositories.PlayerRepository;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.services.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PlayerServiceImpl.class);

	@Autowired
	private PlayerRepository playerRepository;

	public Player guardarPlayer(PlayerDTO playerDTO) throws GameException {
		final Player savePlayer = new Player();
		savePlayer.setPlayerNom("ANÒNIM");
		savePlayer.setPassword(playerDTO.getPassword());
		savePlayer.setDataRegistre(playerDTO.getDataRegistre());

		try {
			playerRepository.save(savePlayer);
		} catch (final Exception e) {
			LOGGER.error("INTERNAL_SERVER_ERROR", e);
			throw new InternalServerErrorException("INTERNAL_SERVER_ERROR", "INTERNAL_SERVER_ERROR");
		}
		return savePlayer;
	}

	public Player actualizarPlayer(PlayerDTO playerDTO) throws GameException {

		final Player actualizarPlayer = playerRepository.findById(playerDTO.getId())
				.orElseThrow(() -> new NotFountException("Player not fount", "Player not fount"));
		actualizarPlayer.setPlayerNom(playerDTO.getPlayerNom());
		actualizarPlayer.setPassword(playerDTO.getPassword());

		try {
			playerRepository.save(actualizarPlayer);
		} catch (final Exception e) {
			LOGGER.error("INTERNAL_SERVER_ERROR", e);
			throw new InternalServerErrorException("INTERNAL_SERVER_ERROR", "INTERNAL_SERVER_ERROR");
		}
		return actualizarPlayer;
	}

	public List<PorcentageExitoDto> llistaPlayers() {
		List<PorcentageExitoDto> porcentageExitList = new ArrayList<>();
		List<Player> playerList = playerRepository.findAllByOrderByPlayerNomAsc();

		double countExit = 0;
		double countIntentos = 0;
		double porcentajeExito = 0;

		for (Player player : playerList) {
			countIntentos = 0;
			for (Game game : player.getGames()) {
				countIntentos = countIntentos + 1;
				Boolean exito = game.isGuanyar();

				if (exito == true) {
					countExit = countExit + 1;
				}
			}
			porcentajeExito = (countExit * countIntentos) / 100;
			porcentajeExito = porcentajeExito * 100;
			final PorcentageExitoDto porcentageExitoDto = new PorcentageExitoDto();
			porcentageExitoDto.setId(player.getId());
			porcentageExitoDto.setPlayerNom(player.getPlayerNom());
			porcentageExitoDto.setPorcentageExito(porcentajeExito);

			porcentageExitList.add(porcentageExitoDto);

		}
		return porcentageExitList;
	}

	public PorcentageExitoDto llistaPlayersPeorPorcentaje() {
		List<PorcentageExitoDto> porcentageExitList = new ArrayList<>();
		List<Player> playerList = playerRepository.findAllByOrderByPlayerNomAsc();

		double countExit = 0;
		double countIntentos = 0;
		double porcentajeExito = 0;

		for (Player player : playerList) {
			countIntentos = 0;
			for (Game game : player.getGames()) {
				countIntentos = countIntentos + 1;
				Boolean exito = game.isGuanyar();

				if (exito == true) {
					countExit = countExit + 1;
				}
			}
			porcentajeExito = (countExit * countIntentos) / 100;
			porcentajeExito = porcentajeExito * 100;
			final PorcentageExitoDto porcentageExitoDto = new PorcentageExitoDto();
			porcentageExitoDto.setId(player.getId());
			porcentageExitoDto.setPlayerNom(player.getPlayerNom());
			porcentageExitoDto.setPorcentageExito(porcentajeExito);

			porcentageExitList.add(porcentageExitoDto);

		}

		return porcentageExitList.stream().min(Comparator.comparing(PorcentageExitoDto::getPorcentageExito))
				.orElseThrow(NoSuchElementException::new);
	}

	public PorcentageExitoDto llistaPlayersMejorPorcentaje() {
		List<PorcentageExitoDto> porcentageExitList = new ArrayList<>();
		List<Player> playerList = playerRepository.findAllByOrderByPlayerNomAsc();

		double countExit = 0;
		double countIntentos = 0;
		double porcentajeExito = 0;

		for (Player player : playerList) {
			countIntentos = 0;
			for (Game game : player.getGames()) {
				countIntentos = countIntentos + 1;
				Boolean exito = game.isGuanyar();

				if (exito == true) {
					countExit = countExit + 1;
				}
			}
			porcentajeExito = (countExit * countIntentos) / 100;
			porcentajeExito = porcentajeExito * 100;
			final PorcentageExitoDto porcentageExitoDto = new PorcentageExitoDto();
			porcentageExitoDto.setId(player.getId());
			porcentageExitoDto.setPlayerNom(player.getPlayerNom());
			porcentageExitoDto.setPorcentageExito(porcentajeExito);

			porcentageExitList.add(porcentageExitoDto);

		}
		return porcentageExitList.stream().max(Comparator.comparing(PorcentageExitoDto::getPorcentageExito))
				.orElseThrow(NoSuchElementException::new);
	}

}
