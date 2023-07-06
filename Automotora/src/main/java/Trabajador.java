public class Trabajador extends Persona {

	private String cargo;
	private String sueldo;
	private String experiencia;
	public Trabajador() {
	}
		public Trabajador(String nombre, String apellido, String rut, String direccion, String nroTelefono, String cargo, String sueldo, String experiencia) {
			super(nombre, apellido, rut, direccion, nroTelefono);
			this.cargo = cargo;
			this.sueldo = sueldo;
			this.experiencia = experiencia;
		}
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSueldo() {
		return sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
}
