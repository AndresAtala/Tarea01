public abstract class Automovil {
	private String motor;
	private String marca;
	private String modelo;
	private String anio;
	private String combustible;
	private int nroPuertas;
	private String transmision;
	private String kilometros;

	public Automovil() {
		// Constructor sin argumentos
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getNroPuertas() {
		return nroPuertas;
	}

	public void setNroPuertas(int nroPuertas) {
		this.nroPuertas = nroPuertas;
	}

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	public String getKilometros() {
		return kilometros;
	}

	public void setKilometros(String kilometros) {
		this.kilometros = kilometros;
	}
}