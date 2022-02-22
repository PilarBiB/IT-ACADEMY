package s104N1ex3pbb;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThrows;
import java.util.ArrayList;

class S104N1ex3pbbTest {

	@Test
    @DisplayName("Should throw the correct exception")
    void shouldThrowCorrectException() {

        assertThrows(IndexOutOfBoundsException.class, () -> {
            ArrayList noms = new ArrayList();
            noms.add("Pepe");
            noms.add("Maria");
            noms.add("Luis");
            noms.get(3);
        }

        );
    }
	
}