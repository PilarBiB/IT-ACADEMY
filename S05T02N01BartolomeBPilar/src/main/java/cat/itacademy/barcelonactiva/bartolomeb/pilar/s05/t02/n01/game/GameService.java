package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.game;

import java.util.List;

public interface GameService {
	
	Integer guardarGame(Game game);
	
	List<Game> findAll();
	
	Game getGameById(Integer id);
	
	void borrarById(Integer id);
	
	
}
