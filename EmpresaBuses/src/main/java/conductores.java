public class Conductores {
    private String Nombre;
    private String Apellido;
    private int NumeroTelefono;
    private short TipoCarnet;

    public Conductor(String nombre, String apellido, int numeroTelefono, short tipoCarnet) {
        Nombre = nombre;
        Apellido = apellido;
        NumeroTelefono = numeroTelefono;
        TipoCarnet = tipoCarnet;
    }

    public String getNombre() {
        // TODO - implement conductor.getNombre
        throw new UnsupportedOperationException();
    }

    public void setNombre(String nombre) {
        // TODO - implement conductor.setNombre
        throw new UnsupportedOperationException();
    }

    public String getApellido() {
        // TODO - implement conductor.getApellido
        throw new UnsupportedOperationException();
    }

    public void setApellido(String apellido) {
        // TODO - implement conductor.setApellido
        throw new UnsupportedOperationException();
    }

    public int getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        NumeroTelefono = numeroTelefono;
    }

    public String getTipoCarnet() {
        // TODO - implement conductor.getTipoCarnet
        throw new UnsupportedOperationException();
    }

    public void setTipoCarnet(short tipoCarnet) {
        TipoCarnet = tipoCarnet;
    }
}
