public class Sedan extends Automovil {
	private float capacidadMaletero;
	private boolean radioTouch;
	private boolean gps;

	public Sedan(String precio, String marca, String modelo, String anio, String combustible, int nroPuertas,
				 String transmision, String kilometros, float capacidadMaletero, boolean radioTouch, boolean gps) {
		super(precio, marca, modelo, anio, combustible, nroPuertas, transmision, kilometros);
		this.capacidadMaletero = capacidadMaletero;
		this.radioTouch = radioTouch;
		this.gps = gps;
	}

	// Constructor sin argumentos
	public Sedan() {
		super("", "", "", "", "", 0, "", "");
		this.capacidadMaletero = 0;
		this.radioTouch = false;
		this.gps = false;
	}

	public float getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(float capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}

	public boolean isRadioTouch() {
		return radioTouch;
	}

	public void setRadioTouch(boolean radioTouch) {
		this.radioTouch = radioTouch;
	}

	public boolean isGps() {
		return gps;
	}

	public void setGps(boolean gps) {
		this.gps = gps;
	}

	@Override
	public String toString() {
		return super.toString() +
				", Capacidad de maletero=" + capacidadMaletero +
				", Radio touch=" + radioTouch +
				", GPS=" + gps;
	}
}
