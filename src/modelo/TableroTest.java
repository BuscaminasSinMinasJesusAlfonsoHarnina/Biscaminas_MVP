package modelo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TableroTest {

	@Test
	void test() {
		int longitud[] = { 5, 8, 12 };
		Tablero tablero;
		for (int i = 0; i < longitud.length; i++) {
			tablero = new Tablero(longitud[i]);
			assertEquals(longitud[i], tablero.getAncho());
			assertEquals(longitud[i], tablero.getAlto());
		}
	}

}
