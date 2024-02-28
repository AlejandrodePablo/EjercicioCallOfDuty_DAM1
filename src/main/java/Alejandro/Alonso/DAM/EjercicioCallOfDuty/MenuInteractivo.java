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
            System.out.println("2. Añadir Arma Principal");
            System.out.println("3. Añadir Arma Secundaria");
            System.out.println("4. Equipar Accesorio");
            System.out.println("5. Desequipar Accesorio");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

<<<<<<< Updated upstream
	        int opcion;
	        do {
	            System.out.println("\nMenú:");
	            System.out.println("1. Mostrar Inventario");
	            System.out.println("2. Añadir Arma");
	            System.out.println("3. Equipar Accesorio");
	            System.out.println("4. Desequipar Accesorio");
	            System.out.println("5. Añadir Equipamiento");
	            System.out.println("6. Eliminar Equipamiento");
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
	                case 5:
	                	Equipamiento equipamineto = InventarioController.crearEquipamiento(scanner);
	                    break;
	                case 6:
	                    System.out.print("Ingrese el nombre del accesorio a desequipar: ");
	                    String nombreDesEquiparE = scanner.next();
	                    InventarioController.desequiparEquipamiento(usuario, nombreDesEquiparE);
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
            switch (opcion) {
                case 1:
                    InventarioController.mostrarInventario(usuario);
                    break;
                case 2:
                    System.out.println("Añadir Arma Principal:");
                    ArmaPrincipal armaPrincipal = (ArmaPrincipal) InventarioController.crearArma(scanner);

                    if (armaPrincipal != null) {
                    	InventarioController.añadirArmaPrincipal(usuario, armaPrincipal);
                    }
                    break;
                case 3:
                    System.out.println("Añadir Arma Secundaria:");
                    ArmaSecundaria armaSecundaria = (ArmaSecundaria) InventarioController.crearArma(scanner);

                    if (armaSecundaria != null) {
                    	InventarioController.añadirArmaSecundaria(usuario, armaSecundaria);
                    }
                    break;
                case 4:
                    System.out.println("Equipar Accesorio:");
                    Accesorios accesorio = InventarioController.crearAccesorio(scanner);

                    if (accesorio != null) {
                    	InventarioController.equiparAccesorio(usuario, accesorio);
                    }
                    break;
                case 5:
                    System.out.println("Desequipar Accesorio:");
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
>>>>>>> Stashed changes
