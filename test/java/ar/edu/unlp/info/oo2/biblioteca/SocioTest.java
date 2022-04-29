package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SocioTest {

	Socio socio1;
	Socio socio2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		socio1 = new Socio("Delfina", "delfinatarga@gmail.com", "16160/1");
		socio2 = new Socio("Marcos", "marcos909890989098@gmail.com", "16161/2");	
		
	}
	
	@Test
	public void gettersAndSetters() {
		assertEquals(socio1.getNombre(), "Delfina");
		assertEquals(socio2.getEmail(), "marcos909890989098@gmail.com");
		assertEquals(socio1.getLegajo(), "16160/1");
		assertNotEquals(socio1.getNombre(), "delfina");
		socio1.setNombre("delfi");
		assertEquals(socio1.getNombre(), "delfi");
		assertNotEquals(socio1.getNombre(), "Delfina");
	}
	
}
