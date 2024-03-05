package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

import java.util.Scanner;

public class InventarioController {

	public static void mostrarInventario(Usuario usuario) {
<<<<<<< Updated upstream
		System.err.println("Inventario de " + usuario.nombre + ":");
		System.out.println("Espacio en mochila: " + usuario.espacioMochila);
		System.out.println(
				"Arma Principal: " + (usuario.armaPrincipal != null ? usuario.armaPrincipal.nombre : "Ninguna"));
		System.out.println(
				"Arma Secundaria: " + (usuario.armaSecundaria != null ? usuario.armaSecundaria.nombre : "Ninguna"));

		System.out.println("Accesorios:");
		for (Accesorios accesorio : usuario.accesorios) {
			if (accesorio != null) {
				System.out.println("- " + accesorio.nombre);
			}
		}
	}

	public static void añadirArma(Usuario usuario, Armas arma) {
		if (arma instanceof ArmaPrincipal && usuario.armaPrincipal == null) {
			usuario.armaPrincipal = (ArmaPrincipal) arma;
		} else if (arma instanceof ArmaSecundaria && usuario.armaSecundaria == null) {
			usuario.armaSecundaria = (ArmaSecundaria) arma;
		} else {
			System.out.println("No puedes llevar más de un arma principal y una secundaria.");
		}
	}

	public static void equiparAccesorio(Usuario usuario, Accesorios accesorio) {
		for (int i = 0; i < usuario.accesorios.length; i++) {
			if (usuario.accesorios[i] == null) {
				usuario.accesorios[i] = accesorio;
				return;
			}
		}
		System.out.println("No puedes llevar más de 3 accesorios.");
	}

	public static Accesorios crearAccesorio(Scanner scanner) {
		System.out.print("Ingrese el nombre del accesorio: ");
		String nombreAccesorio = scanner.next();
		System.out.print("Ingrese el peso del accesorio: ");
		int pesoAccesorio = scanner.nextInt();

		return new Accesorios(nombreAccesorio, pesoAccesorio);
	}

	public static Armas crearArma(Scanner scanner) {
		System.out.print("Ingrese el nombre del arma: ");
		String nombreArma = scanner.next();
		System.out.print("Ingrese el peso del arma: ");
		int pesoArma = scanner.nextInt();
		System.out.print("¿Es un arma principal o secundaria? (P/S): ");
		char tipoArma = scanner.next().charAt(0);

		Armas arma;

		if (tipoArma == 'P') {
			arma = new ArmaPrincipal(nombreArma, pesoArma);
		} else if (tipoArma == 'S') {
			arma = new ArmaSecundaria(nombreArma, pesoArma);
		} else {
			System.out.println("Opción no válida.");
			return null;
		}

		return arma;
=======
		System.out.println("Inventario de " + usuario.nombre + ":");
		System.out.println("Espacio en mochila: " + usuario.espacioMochila);

		System.out.println("\nArmas Principales:");
		mostrarArmas(usuario.armasPrincipales);

		System.out.println("\nArmas Secundarias:");
		mostrarArmas(usuario.armasSecundarias);

		System.out.println("\nAccesorios:");
		mostrarAccesorios(usuario.accesorios);

		System.out.println("\nEquipamientos:");
		mostrarEquipamiento(usuario.equipamiento);
	}

	private static void mostrarArmas(Armas[] armas) {
		for (Armas arma : armas) {
			if (arma != null) {
				System.out.println("   Nombre: " + arma.nombre + ", Peso: " + arma.peso);
			}
		}
	}

	private static void mostrarAccesorios(Accesorios[] items) {
		for (Accesorios item : items) {
			if (item != null) {
				System.out.println("   Nombre: " + item.nombre + ", Peso: " + item.peso);
			}
		}
	}

	private static void mostrarEquipamiento(Equipamiento[] items) {
		for (Equipamiento item : items) {
			if (item != null) {
				System.out.println("   Nombre: " + item.nombre + ", Peso: " + item.peso);
			}
		}
	}

	private static void mostrarArmas(String titulo, Armas[] armas) {
		System.out.println("\n" + titulo + ":");
		for (Armas arma : armas) {
			if (arma != null) {
				System.out.println("Nombre: " + arma.nombre + ", Peso: " + arma.peso);
			}
		}
	}

	private static void mostrarAccesorios(String titulo, Accesorios[] accesorios) {
		System.out.println("\n" + titulo + ":");
		for (Accesorios accesorio : accesorios) {
			if (accesorio != null) {
				System.out.println("Nombre: " + accesorio.nombre + ", Peso: " + accesorio.peso);
			}
		}
	}

	private static void mostrarEquipamientos(String titulo, Equipamiento[] equipamientos) {
		System.out.println("\n" + titulo + ":");
		for (Equipamiento equipamiento : equipamientos) {
			if (equipamiento != null) {
				System.out.println("Nombre: " + equipamiento.nombre + ", Peso: " + equipamiento.peso);
			}
		}
	}

	public static Armas crearArma(Scanner scanner, Usuario usuario) {
		System.out.print("Ingrese el nombre del arma: ");
		String nombreArma = scanner.next();
		System.out.print("Ingrese el peso del arma: ");
		int pesoArma = scanner.nextInt();

		char tipoArma;
		do {
			System.out.print("¿Es un arma principal o secundaria? (P/S): ");
			tipoArma = scanner.next().charAt(0);

			if (tipoArma != 'P' && tipoArma != 'S' && tipoArma != 'p' && tipoArma != 's') {
				System.out.println("Opción no válida. Inténtelo de nuevo.");
			}
		} while (tipoArma != 'P' && tipoArma != 'S' && tipoArma != 'p' && tipoArma != 's');

		if (tipoArma == 'P' || tipoArma == 'p') {
			ArmaPrincipal armaPrincipal = new ArmaPrincipal(nombreArma, pesoArma);
			if (usuario.espacioMochilaSuficiente(armaPrincipal.peso)) {
				if (usuario.armasPrincipales[0] == null) {
					usuario.armasPrincipales[0] = armaPrincipal;
					System.out.println("Arma principal añadida con éxito.");
				} else {
					System.err.println("No puedes llevar más armas principales.");
				}
			} else {
				System.err.println("No hay suficiente espacio en la mochila para añadir este arma.");
			}
		} else {
			ArmaSecundaria armaSecundaria = new ArmaSecundaria(nombreArma, pesoArma);
			if (usuario.espacioMochilaSuficiente(armaSecundaria.peso)) {
				if (usuario.armasSecundarias[0] == null) {
					usuario.armasSecundarias[0] = armaSecundaria;
					System.out.println("Arma secundaria añadida con éxito.");
				} else {
					System.err.println("No puedes llevar más armas secundarias.");
				}
			} else {
				System.err.println("No hay suficiente espacio en la mochila para añadir esta arma.");
			}
		}
		return null;
	}

	public static Accesorios crearAccesorio(Scanner scanner) {
		System.out.print("Ingrese el nombre del accesorio: ");
		String nombreAccesorio = scanner.next();
		System.out.print("Ingrese el peso del accesorio: ");
		int pesoAccesorio = scanner.nextInt();

		return new Accesorios(nombreAccesorio, pesoAccesorio);
	}

	public static void equiparAccesorio(Usuario usuario, Accesorios accesorio) {
		if (usuario.espacioMochilaSuficiente(accesorio.peso)) {
			for (int i = 0; i < usuario.accesorios.length; i++) {
				if (usuario.accesorios[i] == null) {
					usuario.accesorios[i] = accesorio;
					System.out.println("Accesorio equipado con éxito.");
					return;
				}
			}
			System.err.println("No puedes equipar más accesorios.");
		} else {
			System.err.println("No hay suficiente espacio en la mochila para equipar este accesorio.");
		}
	}

	public static void desequiparAccesorio(Usuario usuario, String nombreAccesorio) {
		boolean encontrado = false;
		System.out.println("Dime el nombre del accesorio a desequipar");
		for (int i = 0; i < usuario.accesorios.length; i++) {
			if (usuario.accesorios[i] != null && usuario.accesorios[i].nombre.equals(nombreAccesorio)) {
				usuario.accesorios[i] = null;
				System.out.println("Accesorio desequipado con éxito.");
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Accesorio no encontrado.");
		}
	}

	public static Equipamiento crearEquipamiento(Scanner scanner) {
		System.out.print("Ingrese el nombre del equipamiento: ");
		String nombreEquipamiento = scanner.next();
		System.out.print("Ingrese el peso del equipamiento: ");
		int pesoEquipamiento = scanner.nextInt();

		return new Equipamiento(nombreEquipamiento, pesoEquipamiento);
	}

	public static void añadirEquipamiento(Usuario usuario, Equipamiento equipamiento) {
		if (usuario.espacioMochilaSuficiente(equipamiento.peso)) {
			for (int i = 0; i < usuario.equipamiento.length; i++) {
				if (usuario.equipamiento[i] == null) {
					usuario.equipamiento[i] = equipamiento;
					System.out.println("Equipamiento añadido con éxito.");
					return;
				}
			}
			System.err.println("No puedes llevar más equipamiento.");
		} else {
			System.err.println("No hay suficiente espacio en la mochila para añadir este equipamiento.");
		}
	}

	public static void desequiparEquipamiento(Usuario usuario, String nombreEquipamiento) {
		boolean encontrado = false;
		System.out.println("Dime el nombre del equipamiento que dese eliminar");
		for (int i = 0; i < usuario.equipamiento.length; i++) {
			if (usuario.equipamiento[i] != null && usuario.equipamiento[i].nombre.equals(nombreEquipamiento)) {
				usuario.equipamiento[i] = null;
				System.out.println("Equipamiento desequipado con éxito.");
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Equipamiento no encontrado.");
		}
>>>>>>> Stashed changes
	}

	public static void desequiparAccesorio(Usuario usuario, String nombreAccesorio) {
		for (int i = 0; i < usuario.accesorios.length; i++) {
			if (usuario.accesorios[i] != null && usuario.accesorios[i].nombre.equals(nombreAccesorio)) {
				usuario.accesorios[i] = null;
				return;
			}
		}
		System.out.println("Accesorio no encontrado.");
	}
}
