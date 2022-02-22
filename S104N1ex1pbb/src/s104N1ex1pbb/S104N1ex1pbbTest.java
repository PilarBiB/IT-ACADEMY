package s104N1ex1pbb;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class S104N1ex1pbbTest {

	@Test
	public void calcPosicions() {
		ArrayList  <Month> mesos = new ArrayList <Month>();
		mesos.add (new Month("Gener"));
		mesos.add (new Month("Febrer"));
		mesos.add (new Month("Març"));
		mesos.add (new Month("Abril"));
		mesos.add (new Month("Maig"));
		mesos.add (new Month("Juny"));
		mesos.add (new Month("Juliol"));
		mesos.add (new Month("Agost"));
		mesos.add (new Month("Setembre"));
		mesos.add (new Month("Octubre"));
		mesos.add (new Month("Novembre"));		
		mesos.add (new Month("Desembre"));	
		
		assertEquals(S104N1ex1pbb.calcPosicions(mesos),12);
	}
	@Test
	public void posicioSet() {	
		ArrayList  <Month> mesos = new ArrayList <Month>();
		mesos.add (new Month("Gener"));
		mesos.add (new Month("Febrer"));
		mesos.add (new Month("Març"));
		mesos.add (new Month("Abril"));
		mesos.add (new Month("Maig"));
		mesos.add (new Month("Juny"));
		mesos.add (new Month("Juliol"));
		mesos.add (new Month("Agost"));
		mesos.add (new Month("Setembre"));
		mesos.add (new Month("Octubre"));
		mesos.add (new Month("Novembre"));		
		mesos.add (new Month("Desembre"));	
		
		assertEquals(S104N1ex1pbb.posicioSet(mesos),"Agost"); 
		
	}
	@Test
	public void prova() {	
		ArrayList  <Month> mesos = null;
		            assertNull(mesos);
		        }
		  		
		
	}


