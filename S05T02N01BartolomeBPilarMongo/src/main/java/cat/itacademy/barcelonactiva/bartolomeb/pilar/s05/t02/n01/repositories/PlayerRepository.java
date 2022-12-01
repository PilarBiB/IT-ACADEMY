package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Player;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {

	List<Player> findAllByOrderByPlayerNomAsc();

	public Optional<Player> findByPlayerNom(String playerNom);

	public Boolean existsByPlayerNom(String username);

}
