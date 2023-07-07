public class Sedan extends Automovil {
	private String capacidadMaletero;
	private String radioTouch;
	private String gps;

	public Sedan(String precio, String marca, String modelo, String anio, String combustible, String nroPuertas,
				 String transmision, String kilometros, String capacidadMaletero, String radioTouch, String gps) {
		super(precio, marca, modelo, anio, combustible, nroPuertas, transmision, kilometros);
		this.capacidadMaletero = capacidadMaletero;
		this.radioTouch = radioTouch;
		this.gps = gps;
	}

	// Constructor sin argumentos
	public Sedan() {
		super("", "", "", "", "", "0", "", "");
		this.capacidadMaletero = "";
		this.radioTouch = "";
		this.gps = "";
	}

	public String getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(String capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}

	public String isRadioTouch() {
		return radioTouch;
	}

	public void setRadioTouch(String radioTouch) {
		this.radioTouch = radioTouch;
	}

	public String isGps() {
		return gps;
	}

	public void setGps(String gps) {
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
