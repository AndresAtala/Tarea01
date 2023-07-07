import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Automotora {
    /* El metodo main solo ejecuta la lista automovil, trabajador,
     tambien agrega autos para que el stock no sea nulo, a la vez que agrega trabajoders
     al final solo inicia el menu */
    public static void main(String[] args) {
        List<Automovil> catalogoAutomoviles = new ArrayList<>();
        List<Trabajador> listaTrabajadores = new ArrayList<>();
        AgregarAutos(catalogoAutomoviles);
        AgregarTrabajadores(listaTrabajadores);
        iniciarMenu(catalogoAutomoviles, listaTrabajadores);
    }

 /* el metod para iniciar menu con todos los casos correspondientes, el menu se
   ejecuta mientras no se elija la opcion salir  */
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
                    seleccionarTrabajadores(listaTrabajadores);
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
                case 6 -> editarAutomovil(scanner, catalogoAutomoviles);
                case 7 ->buscarPorMarca(scanner, catalogoAutomoviles);
                case 8 -> eliminarAutomovil(scanner, catalogoAutomoviles);
                case 9-> {
                    salir = true;
                    System.out.println("¡finalizando programa!");
                }
                default -> System.out.println("Opción inválida. Por favor, ingrese nuevamente.");
            }
        }

        scanner.close();
    }
    /* Este metodo la funcion que cumple como dice el nombre
       es poder ingresar un vehiculo en especifico y aparte llamar a
       a la funcion ingresar automovil, que es la clase "padre" de las clases sedan
       camioneta y deportivo  */
    public static void ingresarSedan(Scanner scanner, List<Automovil> catalogoAutomoviles) {
        Sedan sedan = new Sedan();
        ingresarAutomovil(scanner, sedan);

        System.out.print("Ingrese la capacidad del maletero en litros : ");
        String capacidadMaletero = scanner.nextLine();
        comprobarCapacidadMaletero(capacidadMaletero);
        System.out.print("¿Tiene radio touch? (si/no): ");
        String radioTouch = scanner.nextLine();
        comprobarinfoentretenimiento(radioTouch);
        System.out.print("¿Tiene GPS? (si/no): ");
        String gps = scanner.nextLine();
        comprobarinfoentretenimiento(gps);
        sedan.setCapacidadMaletero(capacidadMaletero);
        sedan.setRadioTouch(radioTouch);
        sedan.setGps(gps);

        catalogoAutomoviles.add(sedan);
        System.out.println("Sedán ingresado correctamente.");
    }
    /* mismo metodo de agregar solo que con las carecteristicas de
       una camioneta  */
    public static void ingresarCamioneta(Scanner scanner, List<Automovil> catalogoAutomoviles) {
        Camioneta camioneta = new Camioneta();
        ingresarAutomovil(scanner, camioneta);

        System.out.print("Ingrese la capacidad de carga en kilogramos: ");
        String capacidadCarga = scanner.nextLine();
        comprobarcapacidad(capacidadCarga);
        System.out.print("Ingrese la capacidad de remolque en kilogramos: ");
        String capacidadRemolque = scanner.nextLine();
        comprobarcapacidad(capacidadRemolque);

        camioneta.setCapacidadDeCarga(capacidadCarga);
        camioneta.setCapacidadRemolque(capacidadRemolque);

        catalogoAutomoviles.add(camioneta);
        System.out.println("Camioneta ingresada correctamente. ");
    }
    /* mismo metodo de agregar solo que con las carecteristicas de
       un deportivo  */
    public static void ingresarDeportivo(Scanner scanner, List<Automovil> catalogoAutomoviles) {
        Deportivo deportivo = new Deportivo();
        ingresarAutomovil(scanner, deportivo);

        System.out.print("Ingrese la velocidad máxima en km/h: ");
        String velocidadMax = scanner.nextLine();
        comprobarvelocidad(velocidadMax);
        System.out.print("Ingrese la aceleración de 0km/h a 100km/h: ");
        String aceleracion = scanner.nextLine();
        comprobarAceleracion(aceleracion);
        System.out.print("Ingrese el sistema de escape, modificado o stock: ");
        String sistEscape = scanner.nextLine();
        comprobarEscape(sistEscape);

        deportivo.setVelocidadMax(velocidadMax);
        deportivo.setAceleracion(aceleracion);
        deportivo.setSistEscape(sistEscape);

        catalogoAutomoviles.add(deportivo);
        System.out.println("Deportivo ingresado correctamente.");
    }
    /* Metodo que se usa en todas las opciones de agregar, ya que esta tiene todos
    * los atriubtos de un automovil */
    public static void ingresarAutomovil(Scanner scanner, Automovil automovil) {
        System.out.print("Ingrese el precio del automovil: ");
        String precio = scanner.nextLine();
        comprobarPrecioIngresados(precio);
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el año: ");
        String anio = scanner.nextLine();
        Comprobaranio(anio);
        System.out.print("Ingrese el combustible, bencina, diesel, hibrido, electrico: ");
        String combustible = scanner.nextLine();
        comprobarmotor(combustible);
        System.out.print("Ingrese el número de puertas: ");
        String nroPuertas = scanner.nextLine();
        comprobarPuertas(nroPuertas);

        System.out.print("Ingrese la transmisión, manual o automatica: ");
        String transmision = scanner.nextLine();
        comprobarTransmision(transmision);
        System.out.print("Ingrese los kilómetros: ");
        String kilometros = scanner.nextLine();
        comprobarkmIngresados(kilometros);

        automovil.setPrecio(precio);
        automovil.setMarca(marca);
        automovil.setModelo(modelo);
        automovil.setAnio(anio);
        automovil.setCombustible(combustible);
        automovil.setNroPuertas(nroPuertas);
        automovil.setTransmision(transmision);
        automovil.setKilometros(kilometros);
    }
    /* con este metodo se puede recorrer la arraylist de automoviles para
    mostrar los autos que estan en stock  */
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
    /* la funcion que cumple este metodo es que agrega autos a la automotora
    para que cuando se pida ver el catalogo ya existan autos  */
    public static void AgregarAutos(List<Automovil> catalogoAutomoviles) {
        Sedan sedan = new Sedan("3600", "toyota", "corolla", "2023", "Diesel", "5", "Automática", "1244421 km", "100", "si", "si");
        catalogoAutomoviles.add(sedan);
        Camioneta camioneta = new Camioneta("5000", "ford", "f150", "2023", "bencina", "4", "automatica", "1400000 km", "1000", "5000");
        catalogoAutomoviles.add(camioneta);
        Deportivo deportivo = new Deportivo("500000", "Porsche", "911", "2018", "hibrido", "2", "automatica", "10000km", "300", "4.2", "Escape Deportivo");
        catalogoAutomoviles.add(deportivo);
    }
    /* Cuando se inicia el menu lo primero que pide son los datos
        del cliente  */
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
    /* se usa este metodo para apenas se inicie el menu ya tenga trabajadores
        automotra  */
    public static void AgregarTrabajadores(List<Trabajador> listaTrabajadores) {
        Trabajador trabajador1 = new Trabajador("Juan", "Pérez", "23755723-8", "Avenida pablo neruda 01243", "500290543", "Vendedor", "521000", "3 años");
        Trabajador trabajador2 = new Trabajador("Jose", "González", "201324723-8", "Avenida San Martin 1204", "994928234", "vendedor", "440000", "2 Años");
        Trabajador trabajador3 = new Trabajador("Pedro", "Vidal", "17345801-8", "Avenida ohiigins 1245", "998321454", "Vendedor", "601000", "5 Meses");
        listaTrabajadores.add(trabajador1);
        listaTrabajadores.add(trabajador2);
        listaTrabajadores.add(trabajador3);
    }
    /* cuando se ingresa un automovil, al finalizar se dice que trabajador
        atendio al cliente de manera aleatoria  */
    public static Trabajador seleccionarTrabajador(List<Trabajador> listaTrabajadores, Random random) {
        if (listaTrabajadores.isEmpty()) {
            return null;
        }
        int index = random.nextInt(listaTrabajadores.size());
        return listaTrabajadores.get(index);
    }
    /* como dice el nombre del metodo, en el menu cuando
        el usuario quiere ver quienes son los trabajadores
        este metodo los muestra */
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
    /* para simplificar el metodo de mostrar menu se agrego este
        metodo */
    public static void opcionesMenu() {
        System.out.println("Menú:");
        System.out.println("1. Ingresar Sedán");
        System.out.println("2. Ingresar Camioneta");
        System.out.println("3. Ingresar Deportivo");
        System.out.println("4. Mostrar catálogo de automóviles");
        System.out.println("5. Mostrar Trabajadores");
        System.out.println("6. Editar automovil");
        System.out.println("7. Buscar auto por marca");
        System.out.println("8. eliminar");
        System.out.println("9. salir");
        System.out.print("Ingrese una opción: ");
    }

    /* este metodo elije que trabajador se muestra */
    public static void seleccionarTrabajadores(List<Trabajador> listaTrabajadores) {
        Trabajador trabajadorAtendiendo = seleccionarTrabajador(listaTrabajadores, new Random());
        System.out.println("El trabajador " + trabajadorAtendiendo.getNombre() + " " + trabajadorAtendiendo.getApellido() + " lo atendió.");
    }
    /* metodo para asegurar que el precio ingresado sean numeros
        y no letras  */
    public static boolean comprobarPrecioIngresados(String precio) {
        Scanner scanner = new Scanner(System.in);
        while (precio.isEmpty() || contieneLetras(precio)) {
            System.out.println("Ingrese un precio:");
            precio = scanner.nextLine().trim();

            if (precio.isEmpty() || contieneLetras(precio)) {
                System.out.println("Dato inválido. Por favor, ingrese nuevamente.");
            }
        }
        return true;

    }
    /* metodo que recorre el string buscando letras  */
    public static boolean contieneLetras(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }
    /* metodo que comprueba que el año ingresado sean solo
       numeros  */
    public static boolean Comprobaranio(String anio) {
        Scanner scanner = new Scanner(System.in);
        while (contieneLetras(anio) || anio.isEmpty()) {
            System.out.println("ingrese año valido");
            anio = scanner.nextLine().trim();
        }
        return false;
    }
    /* metodo que comprueba que la transmision sea solo automatica o manual
    * si el usuario ingresa una transmision inconrrecta le pide que ingrese
    * de nuevo  */
    public static boolean comprobarTransmision(String transmision) {
        Scanner scanner = new Scanner(System.in);
        while (!transmision.equals("automatica") && !transmision.equals("manual")) {
            System.out.println("ingrese tipo de transmision valida (Manual, Automatica)");
            transmision = scanner.nextLine().trim();
            if (transmision.isEmpty()) {
                System.out.println("Dato inválido. Por favor, ingrese nuevamente.");
            }
        }
        return false;
    }
    /* metodo que comprueba que los kilometros ingresafos sean solo
       numeros  */
    public static boolean comprobarkmIngresados(String kilometros) {
        Scanner scanner = new Scanner(System.in);
        while (kilometros.isEmpty() || contieneLetras(kilometros)) {
            System.out.println("Ingrese km en numeros:");
            kilometros = scanner.nextLine().trim();

            if (kilometros.isEmpty() || contieneLetras(kilometros)) {
                System.out.println("Dato inválido. Por favor, ingrese nuevamente.");
            }
        }
        return true;
    }
    /* metodo que comprueba que el tipo de motorizacion ingresado sea solo diesel
    * bencina, hibrido o electrico  */
    public static boolean comprobarmotor(String combustible) {
        Scanner scanner = new Scanner(System.in);
        while (!combustible.equals("bencina") && !combustible.equals("diesel") && !combustible.equals("hibrido") && !combustible.equals("electrico")) {
            System.out.println("ingrese tipo de combustible valido, (bencina, Diesel, Hibrido, Electrico");
            combustible = scanner.nextLine().trim();
            if (combustible.isEmpty()) {
                System.out.println("Dato inválido. Por favor, ingrese nuevamente.");
            }
        }
        return false;
    }
    /* metodo que comprueba que las puertas ingresadas  sean solo
       numeros, que esten en un rango entre 1 y 5 */
    public static boolean comprobarPuertas(String puerta) {
        Scanner scanner = new Scanner(System.in);
        while (puerta.isEmpty() || contieneLetras(puerta) || !esCantidadValida(puerta)) {
            System.out.println("Ingrese la cantidad de puertas (números del 1 al 5):");
            puerta = scanner.nextLine().trim();

            if (puerta.isEmpty() || contieneLetras(puerta)) {
                System.out.println("Dato inválido. Por favor, ingrese nuevamente.");
            } else if (!esCantidadValida(puerta)) {
                System.out.println("La cantidad de puertas no es válida. Por favor, ingrese nuevamente.");
            }
        }
        return true;
    }
    /* metodo que complementa el de las puertas ya que este decide si esta dentro del valor esperado  */
    public static boolean esCantidadValida(String cantidad) {
        int puertas = Integer.parseInt(cantidad);
        return puertas >= 1 && puertas <= 5;
    }
    /* metodo que comprueba que la capacidad de maletero sean solo
       numeros  */
    public static boolean comprobarCapacidadMaletero(String maletero) {
        Scanner scanner = new Scanner(System.in);
        while (maletero.isEmpty() || contieneLetras(maletero)) {
            System.out.println("Ingrese capacidad en numeros:");
            maletero = scanner.nextLine().trim();

            if (maletero.isEmpty() || contieneLetras(maletero)) {
                System.out.println("Dato inválido. Por favor, ingrese nuevamente.");
            }
        }
        return true;
    }
    /* metodo que comprueba que cuando se ingrese el infoentretenimiento sea solo
       si o no  */
    public static boolean comprobarinfoentretenimiento(String str) {
        Scanner scanner = new Scanner(System.in);
        while (!str.equals("si") && !str.equals("no")) {
            System.out.println("ingrese respuesta valida (si, no)");
            str = scanner.nextLine().trim();
            if (str.isEmpty()) {
                System.out.println("Dato inválido. Por favor, ingrese nuevamente.");
            }
        }
        return false;
    }
    /* metodo que comprueba que la capacidad ingresada sean solo
       numeros  */
    public static boolean comprobarcapacidad(String str) {
        Scanner scanner = new Scanner(System.in);
        while (str.isEmpty() || contieneLetras(str)) {
            System.out.println("Ingrese un capacidad valida en KG:");
            str = scanner.nextLine().trim();

            if (str.isEmpty() || contieneLetras(str)) {
                System.out.println("Dato inválido. Por favor, ingrese nuevamente.");
            }
        }
        return true;

    }
    /* metodo que comprueba que la velocidad maxima sean solo
       numeros  */
    public static boolean comprobarvelocidad(String str) {
        Scanner scanner = new Scanner(System.in);
        while (str.isEmpty() || contieneLetras(str)) {
            System.out.println("Ingrese velocidad (desde 0km/h hasta 450km/h):");
            str = scanner.nextLine().trim();

            if (str.isEmpty() || contieneLetras(str)) {
                System.out.println("Dato inválido. Por favor, ingrese nuevamente.");
            } else if (!esvelocidadValida(str)) {
                System.out.println("La velocidad no es válida. Por favor, ingrese nuevamente.");
            }
        }
        return true;
    }
    /* metodo que comprueba que la velcidad esten en cierto rango */
    public static boolean esvelocidadValida(String cantidad) {
        int vel = Integer.parseInt(cantidad);
        return vel >= 0 && vel <= 450;
    }
    /* metodo que comprueba la aceleracion ingresada sean solo
       numeros  */
    public static boolean comprobarAceleracion(String aceleracion) {
        Scanner scanner = new Scanner(System.in);
        while (contieneLetras(aceleracion) || aceleracion.isEmpty()) {
            System.out.println("ingrese aceleracion valida");
            aceleracion = scanner.nextLine().trim();
        }
        return false;
    }
    /* metodo que comprueba que el escape ingresado sean solo
       stock o modificado  */
    public static boolean comprobarEscape(String escape) {
        Scanner scanner = new Scanner(System.in);
        while (!escape.equals("stock") && !escape.equals("modificado")) {
            System.out.println("ingrese tipo de escape valido (stock, modificado)");
            escape = scanner.nextLine().trim();
            if (escape.isEmpty()) {
                System.out.println("Dato inválido. Por favor, ingrese nuevamente.");
            }
        }
        return false;
    }
    public static void editarAutomovil(Scanner scanner, List<Automovil> catalogoAutomoviles) {
        System.out.print("Ingrese el índice del automóvil que desea editar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice >= 0 && indice < catalogoAutomoviles.size()) {
            Automovil automovil = catalogoAutomoviles.get(indice);

            System.out.println("Seleccione el atributo a editar:");
            System.out.println("1. Precio");
            System.out.println("2. Marca");
            System.out.println("3. Modelo");
            System.out.println("4. Año");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nuevo precio: ");
                    String precio = scanner.nextLine();
                    automovil.setPrecio(precio);
                    break;
                case 2:
                    System.out.print("Ingrese la nueva marca: ");
                    String marca = scanner.nextLine();
                    automovil.setMarca(marca);
                    break;
                case 3:
                    System.out.print("Ingrese el nuevo modelo: ");
                    String modelo = scanner.nextLine();
                    automovil.setModelo(modelo);
                    break;
                case 4:
                    System.out.print("Ingrese el nuevo año: ");
                    String anio = scanner.nextLine();
                    automovil.setAnio(anio);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            System.out.println("Automóvil editado correctamente.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
    public static void buscarPorMarca(Scanner scanner, List<Automovil> catalogoAutomoviles) {
        System.out.print("Ingrese la marca del automóvil que desea buscar: ");
        String marca = scanner.nextLine();

        List<Automovil> automovilesEncontrados = new ArrayList<>();

        for (Automovil automovil : catalogoAutomoviles) {
            if (automovil.getMarca().equalsIgnoreCase(marca)) {
                automovilesEncontrados.add(automovil);
            }
        }

        if (automovilesEncontrados.isEmpty()) {
            System.out.println("No se encontraron automóviles de la marca especificada.");
        } else {
            System.out.println("Automóviles encontrados:");
            for (Automovil automovil : automovilesEncontrados) {
                System.out.println(automovil);
            }
        }
    }
    public static void eliminarAutomovil(Scanner scanner, List<Automovil> catalogoAutomoviles) {
        System.out.print("Ingrese el índice del automóvil que desea eliminar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice >= 0 && indice < catalogoAutomoviles.size()) {
            Automovil automovil = catalogoAutomoviles.remove(indice);
            System.out.println("Automóvil eliminado correctamente: " + automovil);
        } else {
            System.out.println("Índice inválido.");
        }
    }
}


