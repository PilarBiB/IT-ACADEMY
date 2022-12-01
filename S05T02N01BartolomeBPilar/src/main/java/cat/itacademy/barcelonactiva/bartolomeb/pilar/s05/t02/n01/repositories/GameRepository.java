package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

	@Modifying
	@Transactional
	List<Game> deleteByPlayerId(Integer playerId);
	
	List<Game>  findByPlayerId(Integer playerId);

}
