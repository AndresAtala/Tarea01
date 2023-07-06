public class Comprador extends Persona {
	private String presupuesto;
	public Comprador() {
	}

	public Comprador(String nombre, String apellido, String rut, String direccion, String nroTelefono, String presupuesto) {
		super(nombre, apellido, rut, direccion, nroTelefono);
		this.presupuesto = presupuesto;
	}

	public String getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(String presupuesto) {
		this.presupuesto = presupuesto;
	}
}

