public class Camioneta extends Automovil {
	private float capacidadDeCarga;
	private float capacidadRemolque;

	public Camioneta(String precio, String marca, String modelo, String anio, String combustible, String nroPuertas,
					 String transmision, String kilometros, float capacidadDeCarga, float capacidadRemolque) {
		super(precio, marca, modelo, anio, combustible, nroPuertas, transmision, kilometros);
		this.capacidadDeCarga = capacidadDeCarga;
		this.capacidadRemolque = capacidadRemolque;
	}

	// Constructor sin argumentos
	public Camioneta() {
		super("", "", "", "", "", "", "", "");
		this.capacidadDeCarga = 0;
		this.capacidadRemolque = 0;
	}

	public float getCapacidadDeCarga() {
		return capacidadDeCarga;
	}

	public void setCapacidadDeCarga(float capacidadDeCarga) {
		this.capacidadDeCarga = capacidadDeCarga;
	}

	public float getCapacidadRemolque() {
		return capacidadRemolque;
	}

	public void setCapacidadRemolque(float capacidadRemolque) {
		this.capacidadRemolque = capacidadRemolque;
	}

	@Override
	public String toString() {
		return super.toString() +
				", Capacidad de carga=" + capacidadDeCarga +
				", Capacidad de remolque=" + capacidadRemolque;
	}
}
