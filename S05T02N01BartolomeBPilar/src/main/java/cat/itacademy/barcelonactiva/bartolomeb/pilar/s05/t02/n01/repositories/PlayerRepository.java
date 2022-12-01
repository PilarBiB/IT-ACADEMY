package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

	List<Player> findAllByOrderByPlayerNomAsc();

	public Optional<Player> findByPlayerNom(String playerNom);
	
	public Boolean existsByPlayerNom(String username);

}
