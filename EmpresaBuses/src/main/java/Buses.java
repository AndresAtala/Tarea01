import java.util.ArrayList;
import java.util.List;

public class Bus {
    private int Patente;
    private String Modelo;
    private String Marca;
    private List<Viaje> viajes;

    public Bus(int patente, String modelo, String marca) {
        Patente = patente;
        Modelo = modelo;
        Marca = marca;
        viajes = new ArrayList<>();
    }

    public int getPatente() {
        // TODO - implement bus.getPatente
        throw new UnsupportedOperationException();
    }

    public void setPatente(int patente) {
        // TODO - implement bus.setPatente
        throw new UnsupportedOperationException();
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        // TODO - implement bus.getMarca
        throw new UnsupportedOperationException();
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void agregarViaje(Viaje viaje) {
        viajes.add(viaje);
    }
}
