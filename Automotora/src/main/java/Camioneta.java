public class Camioneta extends Automovil {
	private String capacidadDeCarga;
	private String capacidadRemolque;

	public Camioneta(String precio, String marca, String modelo, String anio, String combustible, String nroPuertas,
					 String transmision, String kilometros, String capacidadDeCarga, String capacidadRemolque) {
		super(precio, marca, modelo, anio, combustible, nroPuertas, transmision, kilometros);
		this.capacidadDeCarga = capacidadDeCarga;
		this.capacidadRemolque = capacidadRemolque;
	}

	// Constructor sin argumentos
	public Camioneta() {
		super("", "", "", "", "", "", "", "");
		this.capacidadDeCarga = "";
		this.capacidadRemolque = "";
	}

	public String getCapacidadDeCarga() {
		return capacidadDeCarga;
	}

	public void setCapacidadDeCarga(String capacidadDeCarga) {
		this.capacidadDeCarga = capacidadDeCarga;
	}

	public String getCapacidadRemolque() {
		return capacidadRemolque;
	}

	public void setCapacidadRemolque(String capacidadRemolque) {
		this.capacidadRemolque = capacidadRemolque;
	}

	@Override
	public String toString() {
		return super.toString() +
				", Capacidad de carga=" + capacidadDeCarga +
				", Capacidad de remolque=" + capacidadRemolque;
	}
}
