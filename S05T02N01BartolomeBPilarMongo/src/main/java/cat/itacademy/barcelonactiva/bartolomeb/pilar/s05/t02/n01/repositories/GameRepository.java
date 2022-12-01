package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Game;

@Repository
public interface GameRepository extends MongoRepository<Game, String> {

	List<Game> deleteByPlayerId(String playerId);

	List<Game> findByPlayerId(String playerId);

}
