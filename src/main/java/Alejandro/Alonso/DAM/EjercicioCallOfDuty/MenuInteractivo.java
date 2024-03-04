package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

import java.util.Scanner;

public class MenuInteractivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese el espacio en la mochila: ");
        int espacioMochila = scanner.nextInt();

        Usuario usuario = new Usuario(nombreUsuario, espacioMochila);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            gestionarOpcion(usuario, opcion, scanner);
        } while (opcion != 0);

        System.err.println("¡Hasta luego!");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n-----Menú------");
        System.out.println("1. Mostrar Inventario");
        System.out.println("2. Añadir Arma Principal");
        System.out.println("3. Añadir Arma Secundaria");
        System.out.println("4. Equipar Accesorio");
        System.out.println("5. Desequipar Accesorio");
        System.out.println("6. Equipar Equipamiento");
        System.out.println("7. Desequipar Equipamiento");
        System.out.println("0. Salir");
        System.out.print("Ingrese su opción: ");
    }

    private static void gestionarOpcion(Usuario usuario, int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                InventarioController.mostrarInventario(usuario);
                break;
            case 2:
                InventarioController.añadirArmaPrincipal(usuario, (ArmaPrincipal) InventarioController.crearArma(scanner));
                break;
            case 3:
                InventarioController.añadirArmaSecundaria(usuario, (ArmaSecundaria) InventarioController.crearArma(scanner));
                break;
            case 4:
                InventarioController.equiparAccesorio(usuario, InventarioController.crearAccesorio(scanner));
                break;
            case 5:
                InventarioController.desequiparAccesorio(usuario, scanner.next());
                break;
            case 6:
                InventarioController.añadirEquipamiento(usuario, InventarioController.crearEquipamiento(scanner));
                break;
            case 7:
                InventarioController.desequiparEquipamiento(usuario, scanner.next());
                break;
            default:
                System.err.println("Opción no válida. Inténtelo de nuevo.");
        }
    }
}
