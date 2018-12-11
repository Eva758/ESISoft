package esisoft;
public class Camarero {

String nombre;
	
	public Camarero() {
		
	}
	
	public Camarero(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
}
