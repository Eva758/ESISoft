package esisoft;

public class Estado {
	
	String nombreEstado;
	int tiempoEstado;
	
	public Estado() {
		
	}
	
	public Estado(String nombreEstado,int tiempoEstado) {
		this.nombreEstado = nombreEstado;
		this.tiempoEstado = tiempoEstado;
	}

	public String getNombreEstado() {
		return nombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}

	public int getTiempoEstado() {
		return tiempoEstado;
	}

	public void setTiempoEstado(int tiempoEstado) {
		this.tiempoEstado = tiempoEstado;
	}
	
}
