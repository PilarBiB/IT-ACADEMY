package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.game;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.game.GameRepository;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.repository.PlayerRepository;

@Service
public class GameServiceImpl implements GameService{

	@Autowired
	GameRepository gameRepository;
	
	@Autowired
	PlayerRepository playerRepository;
	
	@Override
	public Integer guardarGame(Game game) {
		gameRepository.save(game);
	return game.getIdGame();
	}
	@Override
	public List<Game> findAll(){
		return gameRepository.findAll();
	}
	@Override
	public Game getGameById(Integer id) {
		Game resultat = new Game();
		Optional<Game> game = gameRepository.findById (id);
		if (game.isPresent()) {
			game = gameRepository.findById(id);
		}
	return resultat;
	}
	@Override
	public void borrarById(Integer id) {
		gameRepository.deleteById(id);
	}
	
	
}
