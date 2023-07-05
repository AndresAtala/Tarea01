import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Automotora {
/* hacer validaciones para todas las weas tambien agregar estas weas de trabajadores y personas*/
    public static void main(String[] args) {
        List<Automovil> catalogoAutomoviles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Ingresar Sedán");
            System.out.println("2. Ingresar Camioneta");
            System.out.println("3. Ingresar Deportivo");
            System.out.println("4. Mostrar catálogo de automóviles");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> ingresarSedan(scanner, catalogoAutomoviles);
                case 2 -> ingresarCamioneta(scanner, catalogoAutomoviles);
                case 3 -> ingresarDeportivo(scanner, catalogoAutomoviles);
                case 4 -> mostrarCatalogoAutomoviles(catalogoAutomoviles);
                case 5 -> {
                    salir = true;
                    System.out.println("¡Hasta luego!");
                }
                default -> System.out.println("Opción inválida. Por favor, ingrese nuevamente.");
            }
        }
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
        int velocidadMax = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la aceleración de 0km/h a 100km/h: ");
        float aceleracion = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Ingrese el sistema de escape, modificado o stock: ");
        String sistEscape = scanner.nextLine();

        deportivo.setVelocidadMax(velocidadMax);
        deportivo.setAceleracion(aceleracion);
        deportivo.setSistEscape(sistEscape);

        catalogoAutomoviles.add(deportivo);
        System.out.println("Deportivo ingresado correctamente.");
    }

    public static void ingresarAutomovil(Scanner scanner, Automovil automovil) {
        System.out.print("Ingrese la cilindrada del motor: ");
        String motor = scanner.nextLine();
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

        automovil.setMotor(motor);
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
}
