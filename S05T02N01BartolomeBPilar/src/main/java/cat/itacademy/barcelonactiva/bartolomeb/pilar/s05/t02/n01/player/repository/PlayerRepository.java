package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{
	
	public Player findByPlayerNom (String playerNom);
}
