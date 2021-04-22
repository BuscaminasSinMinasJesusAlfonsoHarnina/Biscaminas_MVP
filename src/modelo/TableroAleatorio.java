package modelo;

import java.util.ArrayList;
import java.util.Iterator;

import utiles.Utiles;

public class TableroAleatorio extends Tablero {

	//Constructor aleatorio
	public TableroAleatorio(int lado, int minas) {
		super(lado);
		ArrayList<Coordenada> posiciones = generaAleatorio(minas, lado);
		disponerTablero(posiciones);
	}
	
	//constructor no aleatorio
	public TableroAleatorio(int lado,ArrayList<Coordenada> posiciones) {
		super(lado);
		disponerTablero(posiciones);
	}
	private void disponerTablero(ArrayList<Coordenada> posiciones) {
		colocarMinas(posiciones);
		contarMinasAlrededor(posiciones);
	}


	public ArrayList<Coordenada> contarMinasAlrededor(ArrayList<Coordenada> posiciones) {
		  for (Coordenada coordenada : posiciones) {
	            for (int i = coordenada.posX - 1; i <= coordenada.posX+ 1; i++) {
	                for (int j = coordenada.posY- 1; j <= coordenada.posY + 1; j++) {
	                    Coordenada coordenada2 = new Coordenada(i, j);
	                    if (isInToLimits(coordenada2)) {

	                        Casilla casilla = getCasilla(coordenada2);
	                        if (!casilla.isMina()) {
	                            casilla.incrementaMinasAlrededor();
	                        }
	                    }
	                }

	            }
	        }
	        System.out.println(posiciones.size());
	        return posiciones;
	    }

	    private boolean isInToLimits(Coordenada coordenada) {
	        // TODO Apéndice de método generado automáticamente
	        if ((coordenada.getPosX() >= 0 && coordenada.getPosY() >= 0)
	                && (coordenada.posX < getAncho() && coordenada.posY < getAlto())) {
	            return true;
	        }

	        return false;
	    }

	private void colocarMinas(ArrayList<Coordenada> posiciones) {
		for (Coordenada coordenada : posiciones) {
			ponerMina(coordenada);
		}
	}

	private void ponerMina(Coordenada coordenada) {
		getCasilla(coordenada).setMina(true);
	}

	public ArrayList<Coordenada> generaAleatorio(int minas, int longitud) {
		assert minas > 0 && longitud > 0;
		assert minas < longitud * longitud;
//		long inicio = System.currentTimeMillis();
		ArrayList<Coordenada> coordenadas = new ArrayList<Coordenada>();
		for (int i = 0; i < minas; i++) {
			Coordenada coord;
			do {
				coord = dameCoordenada(longitud);
			} while (existeCoord(coord, coordenadas));
			coordenadas.add(coord);
		}
//		 long fin = System.currentTimeMillis();
//		 System.out.println("en milis "+(fin-inicio));
		return coordenadas;

	}

	private Coordenada dameCoordenada(int lado) {
		return new Coordenada(Utiles.dameNumero(lado), Utiles.dameNumero(lado));
	}

	public boolean desvelarCasilla(Coordenada coordenada) {
		//TODO 
		if (getCasilla(coordenada).isVelada()&& getCasilla(coordenada).isMina()||getCasilla(coordenada).isVelada()&&getCasilla(coordenada).getMinasAlrededor()>0) {
			getCasilla(coordenada).setVelada(false);
			return false;
		}
		
		for (int i = coordenada.getPosX()-1; i < coordenada.getPosX()+1; i++) {
			for (int j = coordenada.posY -1; j < coordenada.getPosY()+1; j++) {
				if (i>=0 && j>00 &&i<getAlto()&&j<getAncho()) {
					getCasilla(coordenada).setVelada(false);
					return desvelarCasilla(new Coordenada(i, j));
				
				}
			}
		}
		return true;
	}
	
	private boolean existeCoord(Coordenada coord, ArrayList<Coordenada> coordenadas) {
		for (int i = 0; i < coordenadas.size(); i++) {
			if (coord.equals(coordenadas.get(i))) {
				return true;
			}
		}
		return false;
	}
}
