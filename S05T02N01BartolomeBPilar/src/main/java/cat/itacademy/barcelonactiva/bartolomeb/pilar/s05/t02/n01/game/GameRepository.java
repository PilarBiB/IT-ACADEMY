package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer>{

}
