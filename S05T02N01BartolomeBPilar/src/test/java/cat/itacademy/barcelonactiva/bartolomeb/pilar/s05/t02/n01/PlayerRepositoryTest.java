package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.model.Player;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.repository.PlayerRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class PlayerRepositoryTest {

		@Autowired
		private PlayerRepository playerRepository;
		
		@Test
		public void testCrearPlayer() {
			Player playerGuardat = playerRepository.save(new Player("The Best"));
			assertThat(playerGuardat.getId()).isGreaterThan(0);
		}
}
