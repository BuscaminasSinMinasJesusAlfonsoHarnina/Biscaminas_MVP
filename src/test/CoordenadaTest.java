package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Coordenada;

class CoordenadaTest {

	@Test
	void testEqualsObject() {
		//porque hay que probar!! asgurarse de que se ha sobreescrito el equals
		Coordenada coordenada = new Coordenada(0, 0);
		Coordenada coordenada2 = new Coordenada(0, 0);
		Coordenada coordenada3 = new Coordenada(3, 3);
		assertTrue(coordenada.equals(coordenada2));
		assertFalse(coordenada.equals(coordenada3));
	}

}
