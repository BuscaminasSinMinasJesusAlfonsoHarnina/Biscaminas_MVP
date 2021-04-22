package modelo;

public enum Densidad {
	baja(10),media(15),alta(20);
	
	private int porcentaje;

	private Densidad(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	
}
