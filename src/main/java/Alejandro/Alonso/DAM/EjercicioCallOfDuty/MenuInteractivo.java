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
	                        continue;
	                    }

	                    InventarioController.añadirArma(usuario, arma);
	                    break;
	                case 3:
	                    System.out.print("Ingrese el nombre del accesorio: ");
	                    String nombreAccesorio = scanner.next();
	                    System.out.print("Ingrese el peso del accesorio: ");
	                    int pesoAccesorio = scanner.nextInt();

	                    Accesorios accesorio = new Accesorios(nombreAccesorio, pesoAccesorio);
	                    InventarioController.equiparAccesorio(usuario, accesorio);
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