package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

import java.util.Scanner;

public class MenuInteractivo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese su nombre: ");
		String nombreUsuario = scanner.nextLine();
<<<<<<< Updated upstream

		System.out.print("Ingrese el espacio en la mochila: ");
		int espacioMochila = scanner.nextInt();

		Usuario usuario = new Usuario(nombreUsuario, espacioMochila);

		int opcion;
		do {
			System.out.println("\nMenú:");
			System.out.println("1. Mostrar Inventario");
			System.out.println("2. Añadir Arma");
			System.out.println("3. Equipar Accesorio");
			System.out.println("4. Desequipar Accesorio");
			System.out.println("0. Salir");
			System.out.print("Ingrese su opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				InventarioController.mostrarInventario(usuario);
				break;
			case 2:
				Armas arma = InventarioController.crearArma(scanner);
				break;
			case 3:
				Accesorios accesorio = InventarioController.crearAccesorio(scanner);
				break;
			case 4:
				System.out.print("Ingrese el nombre del accesorio a desequipar: ");
				String nombreDesEquipar = scanner.next();
				InventarioController.desequiparAccesorio(usuario, nombreDesEquipar);
				break;
			case 0:
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida. Inténtelo de nuevo.");
			}
		} while (opcion != 0);
	}

}
=======
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
		System.out.println("2. Añadir Arma");
		System.out.println("3. Equipar Accesorio");
		System.out.println("4. Desequipar Accesorio");
		System.out.println("5. Equipar Equipamiento");
		System.out.println("6. Desequipar Equipamiento");
		System.out.println("0. Salir");
		System.out.print("Ingrese su opción: ");
	}

	private static void gestionarOpcion(Usuario usuario, int opcion, Scanner scanner) {
		switch (opcion) {
		case 1:
			InventarioController.mostrarInventario(usuario);
			break;
		case 2:
			InventarioController.crearArma(scanner, usuario);
			break;
		case 3:
			InventarioController.equiparAccesorio(usuario, InventarioController.crearAccesorio(scanner));
			break;
		case 4:
			InventarioController.desequiparAccesorio(usuario, scanner.next());
			break;
		case 5:
			InventarioController.añadirEquipamiento(usuario, InventarioController.crearEquipamiento(scanner));
			break;
		case 6:
			InventarioController.desequiparEquipamiento(usuario, scanner.next());
			break;
		default:
			System.err.println("Opción no válida. Inténtelo de nuevo.");
		}
	}
}
>>>>>>> Stashed changes
