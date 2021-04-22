package modelo;

public enum Dificultad {
	facil(5),medio(8),dificil(12);
	
	private int longitud;

	private Dificultad(int longitud) {
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}
	
}
