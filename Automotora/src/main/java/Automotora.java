import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Automotora {

    /* mostrar todos los atributos de los trabajadores y crear metodo para pedir datos del cliente*/
    public static void main(String[] args) {
        List<Automovil> catalogoAutomoviles = new ArrayList<>();
        List<Trabajador> listaTrabajadores = new ArrayList<>();
        AgregarAutos(catalogoAutomoviles);
        AgregarTrabajadores(listaTrabajadores);
        iniciarMenu(catalogoAutomoviles, listaTrabajadores);
    }



    public static void iniciarMenu(List<Automovil> catalogoAutomoviles, List<Trabajador> listaTrabajadores) {
        List<Comprador> listaClientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido(a) a la automotora. Por favor, ingrese sus datos personales:");
        Comprador cliente = ingresarDatosCliente(scanner);
        listaClientes.add(cliente);

        boolean salir = false;
        while (!salir) {
           opcionesMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    ingresarSedan(scanner, catalogoAutomoviles);
                    seleccionarTrabajadores( listaTrabajadores);
                }
                case 2 -> {
                    ingresarCamioneta(scanner, catalogoAutomoviles);
                    seleccionarTrabajadores(listaTrabajadores);
                }
                case 3 -> {
                    ingresarDeportivo(scanner, catalogoAutomoviles);
                    seleccionarTrabajadores(listaTrabajadores);
                }
                case 4 -> mostrarCatalogoAutomoviles(catalogoAutomoviles);
                case 5 -> mostrarTrabajadores(listaTrabajadores);
                case 6 -> {
                    salir = true;
                    System.out.println("¡finalizando programa!");
                }
                default -> System.out.println("Opción inválida. Por favor, ingrese nuevamente.");
            }
        }

        scanner.close();
    }

    public static void ingresarSedan(Scanner scanner, List<Automovil> catalogoAutomoviles) {
        Sedan sedan = new Sedan();
        ingresarAutomovil(scanner, sedan);

        System.out.print("Ingrese la capacidad del maletero en litros : ");
        float capacidadMaletero = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("¿Tiene radio touch? (si/no): ");
        String radioTouchInput = scanner.nextLine();
        boolean radioTouch = radioTouchInput.equalsIgnoreCase("si");
        System.out.print("¿Tiene GPS? (si/no): ");
        String gpsInput = scanner.nextLine();
        boolean gps = gpsInput.equalsIgnoreCase("si");
        sedan.setCapacidadMaletero(capacidadMaletero);
        sedan.setRadioTouch(radioTouch);
        sedan.setGps(gps);

        catalogoAutomoviles.add(sedan);
        System.out.println("Sedán ingresado correctamente.");
    }

    public static void ingresarCamioneta(Scanner scanner, List<Automovil> catalogoAutomoviles) {
        Camioneta camioneta = new Camioneta();
        ingresarAutomovil(scanner, camioneta);

        System.out.print("Ingrese la capacidad de carga en kilogramos: ");
        float capacidadCarga = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Ingrese la capacidad de remolque en kilogramos: ");
        float capacidadRemolque = scanner.nextFloat();
        scanner.nextLine();

        camioneta.setCapacidadDeCarga(capacidadCarga);
        camioneta.setCapacidadRemolque(capacidadRemolque);

        catalogoAutomoviles.add(camioneta);
        System.out.println("Camioneta ingresada correctamente. ");
    }

    public static void ingresarDeportivo(Scanner scanner, List<Automovil> catalogoAutomoviles) {
        Deportivo deportivo = new Deportivo();
        ingresarAutomovil(scanner, deportivo);

        System.out.print("Ingrese la velocidad máxima en km/h: ");
        String velocidadMax = scanner.nextLine();
        System.out.print("Ingrese la aceleración de 0km/h a 100km/h: ");
        String aceleracion = scanner.nextLine();
        System.out.print("Ingrese el sistema de escape, modificado o stock: ");
        String sistEscape = scanner.nextLine();

        deportivo.setVelocidadMax(velocidadMax);
        deportivo.setAceleracion(aceleracion);
        deportivo.setSistEscape(sistEscape);

        catalogoAutomoviles.add(deportivo);
        System.out.println("Deportivo ingresado correctamente.");
    }

    public static void ingresarAutomovil(Scanner scanner, Automovil automovil) {
        System.out.print("Ingrese el precio del automovil: ");
        String precio = scanner.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el año: ");
        String anio = scanner.nextLine();
        System.out.print("Ingrese el combustible, bencina, diesel, hibrido, electrico: ");
        String combustible = scanner.nextLine();
        System.out.print("Ingrese el número de puertas: ");
        int nroPuertas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la transmisión, manual o automatica: ");
        String transmision = scanner.nextLine();
        System.out.print("Ingrese los kilómetros: ");
        String kilometros = scanner.nextLine();

        automovil.setPrecio(precio);
        automovil.setMarca(marca);
        automovil.setModelo(modelo);
        automovil.setAnio(anio);
        automovil.setCombustible(combustible);
        automovil.setNroPuertas(nroPuertas);
        automovil.setTransmision(transmision);
        automovil.setKilometros(kilometros);
    }

    public static void mostrarCatalogoAutomoviles(List<Automovil> catalogoAutomoviles) {
        if (catalogoAutomoviles.isEmpty()) {
            System.out.println("No hay autos en el catálogo");
        } else {
            System.out.println("Catálogo de automóviles:");
            for (Automovil automovil : catalogoAutomoviles) {
                System.out.println(automovil);
            }
        }
    }
    public static void AgregarAutos(List<Automovil> catalogoAutomoviles) {
        Sedan sedan = new Sedan("3600", "toyota", "corolla", "2023", "Gasolina", 5, "Automática", "0 km", 500, true, false);
        catalogoAutomoviles.add(sedan);
        Camioneta camioneta = new Camioneta("5000", "ford", "f150", "2023", "bencina", 4, "automatica", "0 km", 1000, 5000);
        catalogoAutomoviles.add(camioneta);
        Deportivo deportivo = new Deportivo("Motor Deportivo", "Marca Deportivo", "Modelo Deportivo", "2023", "Gasolina", 2, "Manual", "0 km", "300", "4.2", "Escape Deportivo");
        catalogoAutomoviles.add(deportivo);
    }

    public static Comprador ingresarDatosCliente(Scanner scanner) {
        Comprador cliente = new Comprador();

        System.out.print("Nombre: ");
        cliente.setNombre(scanner.nextLine());

        System.out.print("Apellido: ");
        cliente.setApellido(scanner.nextLine());

        System.out.print("Dirección: ");
        cliente.setDireccion(scanner.nextLine());

        System.out.print("RUT: ");
        cliente.setRut(scanner.nextLine());

        System.out.print("Número de teléfono: ");
        cliente.setNroTelefono(scanner.nextLine());

        System.out.print("Presupuesto: ");
        cliente.setPresupuesto(scanner.nextLine());

        return cliente;
    }
    public static void AgregarTrabajadores(List<Trabajador> listaTrabajadores){
        Trabajador trabajador1 = new Trabajador("Juan", "Pérez", "RUT", "Dirección", "Número de teléfono", "Cargo", "Sueldo", "Experiencia");
        Trabajador trabajador2 = new Trabajador("María", "González", "RUT", "Dirección", "Número de teléfono", "Cargo", "Sueldo", "Experiencia");
        listaTrabajadores.add(trabajador1);
        listaTrabajadores.add(trabajador2);
    }
    public static Trabajador seleccionarTrabajador(List<Trabajador> listaTrabajadores, Random random) {
        if (listaTrabajadores.isEmpty()) {
            return null;
        }
        int index = random.nextInt(listaTrabajadores.size());
        return listaTrabajadores.get(index);
    }
    public static void mostrarTrabajadores(List<Trabajador> listaTrabajadores) {
        if (listaTrabajadores.isEmpty()) {
            System.out.println("No hay trabajadores registrados");
        } else {
            System.out.println("Lista de trabajadores:");
            for (Trabajador trabajador : listaTrabajadores) {
                System.out.println("Nombre: " + trabajador.getNombre());
                System.out.println("Apellido: " + trabajador.getApellido());
                System.out.println("RUT: " + trabajador.getRut());
                System.out.println("Cargo: " + trabajador.getCargo());
                System.out.println("Dirección: " + trabajador.getDireccion());
                System.out.println("Número de teléfono: " + trabajador.getNroTelefono());
                System.out.println("--------------------------");
            }
        }
    }
    public static void opcionesMenu(){
        System.out.println("Menú:");
        System.out.println("1. Ingresar Sedán");
        System.out.println("2. Ingresar Camioneta");
        System.out.println("3. Ingresar Deportivo");
        System.out.println("4. Mostrar catálogo de automóviles");
        System.out.println("5. Mostrar Trabajadores");
        System.out.println("6. salir");
        System.out.print("Ingrese una opción: ");
    }
    public static void seleccionarTrabajadores(List<Trabajador> listaTrabajadores){
        Trabajador trabajadorAtendiendo = seleccionarTrabajador(listaTrabajadores, new Random());
        System.out.println("El trabajador " + trabajadorAtendiendo.getNombre() + " " + trabajadorAtendiendo.getApellido() + " lo atendió.");
    }

    }
