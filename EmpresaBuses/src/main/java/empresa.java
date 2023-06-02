import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private int Rut;
    private String Direccion;
    private String RedesSociales;
    private List<Bus> buses;
    private List<Conductor> conductores;

    public Empresa(int rut, String direccion, String redesSociales) {
        Rut = rut;
        Direccion = direccion;
        RedesSociales = redesSociales;
        buses = new ArrayList<>();
        conductores = new ArrayList<>();
    }

    public int getRut() {
        // TODO - implement empresa.getRut
        throw new UnsupportedOperationException();
    }

    public void setRut(int rut) {
        // TODO - implement empresa.setRut
        throw new UnsupportedOperationException();
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getRedesSociales() {
        return RedesSociales;
    }

    public void setRedesSociales(String redesSociales) {
        RedesSociales = redesSociales;
    }

    public boolean buscarViajes(String buscarCiudadOrigen) {
        // TODO - implement empresa.buscarViajes
        throw new UnsupportedOperationException();
    }

    public boolean buscarPatente(int patente) {
        // TODO - implement empresa.buscarPatente
        throw new UnsupportedOperationException();
    }

    public void agregarBus(Bus bus) {
        buses.add(bus);
    }

    public void agregarConductor(Conductor conductor) {
        conductores.add(conductor);
    }

    public void asociarViajeABus(Viaje viaje, Bus bus) {
        bus.agregarViaje(viaje);
        viaje.setBus(bus);
    }

    public List<Bus> obtenerBusesPorDestinoEnRangoDeTiempo(String ciudadDestino, String horaInicio, String horaFin) {
        List<Bus> busesEnRango = new ArrayList<>();
        for (Bus bus : buses) {
            List<Viaje> viajes = bus.getViajes();
            for (Viaje viaje : viajes) {
                if (viaje.getCiudadDestino().equals(ciudadDestino) &&
                        viaje.getHoraSalida().compareTo(horaInicio) >= 0 &&
                        viaje.getHoraLlegada().compareTo(horaFin) <= 0) {
                    busesEnRango.add(bus);
                    break;
                }
            }
        }
        return busesEnRango;
    }

    public void descontinuarBus(int patente) {
        for (Bus bus : buses) {
            if (bus.getPatente() == patente) {
                buses.remove(bus);
                break;
            }
        }
    }
}
