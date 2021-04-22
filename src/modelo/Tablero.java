package modelo;

import utiles.Utiles;

public class Tablero {
	// Aqui se guarda la logica del juego que afacta a la rejilla
	private Casilla[][] casillas;

	public Tablero(int lado) {
		this(lado, lado);
	}

	public Casilla getCasilla(Coordenada coord) {
		return casillas[coord.getPosX()][coord.getPosY()];
	}

	public Tablero(int filas, int columnas) {
		assert filas > 0;
		assert columnas > 0;
		casillas = new Casilla[filas][columnas];
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				casillas[i][j] = new Casilla();
			}
		}
	}

	public int getAlto() {
		return casillas.length;
	}

	public int getAncho() {
		return casillas[0].length;
	}

}
