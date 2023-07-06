public abstract class Automovil {
	private String precio;
	private String marca;
	private String modelo;
	private String anio;
	private String combustible;
	private int nroPuertas;
	private String transmision;
	private String kilometros;
	public Automovil(String precio, String marca, String modelo, String anio, String combustible, int nroPuertas,
					 String transmision, String kilometros) {
		this.precio = precio;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.combustible = combustible;
		this.nroPuertas = nroPuertas;
		this.transmision = transmision;
		this.kilometros = kilometros;
	}

	public Automovil() {
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
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
	@Override
	public String toString() {
		return "Automovil" +
				"precio=" + precio +
				", Marca=" + marca+
				", Modelo=" + modelo +
				", Año=" + anio +
				", Combustible=" + combustible +
				", Número de puertas=" + nroPuertas +
				", Transmisión=" + transmision +
				", Kilómetros=" + kilometros ;

	}
}