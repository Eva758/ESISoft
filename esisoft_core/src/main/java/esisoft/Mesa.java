
public class Mesa {

	private String titulo;
	private String numComensales;
	private String turno1Comida;
	private String turno2Comida;
	private String turno3Comida;
	private String turno1Cena;
	private String turno2Cena;
	private String turno3Cena;
	private String Camarero;
	private String[] Turnos;
	
	public Mesa(){
		
	}
	
	public Mesa(String titulo,String numComensales,String turno1Comida,String turno2Comida,String turno3Comida,String turno1Cena,String turno2Cena,String turno3Cena) {
		
		this.titulo = titulo;
		this.numComensales = numComensales;
		this.turno1Comida = turno1Comida;
		this.turno2Comida = turno2Comida;
		this.turno3Comida = turno3Comida;
		this.turno1Cena = turno1Cena;
		this.turno2Cena = turno2Cena;
		this.turno3Cena = turno3Cena;	
		this.Camarero = "NINGUNO";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNumComensales() {
		return numComensales;
	}

	public void setNumComensales(String numComensales) {
		this.numComensales = numComensales;
	}

	public String getTurno1Comida() {
		return turno1Comida;
	}

	public void setTurno1Comida(String turno1Comida) {
		this.turno1Comida = turno1Comida;
	}

	public String getTurno2Comida() {
		return turno2Comida;
	}

	public void setTurno2Comida(String turno2Comida) {
		this.turno2Comida = turno2Comida;
	}

	public String getTurno3Comida() {
		return turno3Comida;
	}

	public void setTurno3Comida(String turno3Comida) {
		this.turno3Comida = turno3Comida;
	}

	public String getTurno1Cena() {
		return turno1Cena;
	}

	public void setTurno1Cena(String turno1Cena) {
		this.turno1Cena = turno1Cena;
	}

	public String getTurno2Cena() {
		return turno2Cena;
	}

	public void setTurno2Cena(String turno2Cena) {
		this.turno2Cena = turno2Cena;
	}

	public String getTurno3Cena() {
		return turno3Cena;
	}

	public void setTurno3Cena(String turno3Cena) {
		this.turno3Cena = turno3Cena;
	}

	public String getCamarero() {
		return Camarero;
	}

	public void setCamarero(String camarero) {
		Camarero = camarero;
	}

	@Override
	public String toString() {
		return "Mesa [Titulo=" + titulo + ", Numero de Comensales=" + numComensales +", Turno 1 Comida=" + turno1Comida + ", Turno 2 Comida=" + turno2Comida
				+ ", Turno 3 Comida=" + turno3Comida + ", Turno 1 Cena=" + turno1Cena + ", Turno 2 Cena=" + turno2Cena
				+ ", Turno 3 Cena=" + turno3Cena + "]";
	}
	
	
}
