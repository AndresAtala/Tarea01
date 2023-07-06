public class Deportivo extends Automovil {
	private String velocidadMax;
	private String aceleracion;
	private String sistEscape;

	public Deportivo(String precio, String marca, String modelo, String anio, String combustible, String nroPuertas,
					 String transmision, String kilometros, String velocidadMax, String aceleracion, String sistEscape) {
		super(precio, marca, modelo, anio, combustible, nroPuertas, transmision, kilometros);
		this.velocidadMax = velocidadMax;
		this.aceleracion = aceleracion;
		this.sistEscape = sistEscape;
	}

	// Constructor sin argumentos
	public Deportivo() {
		super("", "", "", "", "", "", "", "");
		this.velocidadMax = "";
		this.aceleracion = "";
		this.sistEscape = "";
	}

	public String getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(String velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public String getAceleracion() {
		return aceleracion;
	}

	public void setAceleracion(String aceleracion) {
		this.aceleracion = aceleracion;
	}

	public String getSistEscape() {
		return sistEscape;
	}

	public void setSistEscape(String sistEscape) {
		this.sistEscape = sistEscape;
	}

	@Override
	public String toString() {
		return super.toString() +
				", Velocidad máxima=" + velocidadMax +
				", Aceleración=" + aceleracion +
				", Sistema de escape=" + sistEscape;
	}
}
