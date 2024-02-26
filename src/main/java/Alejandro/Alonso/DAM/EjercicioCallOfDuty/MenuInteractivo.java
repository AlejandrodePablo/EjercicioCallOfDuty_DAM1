package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

import java.util.Scanner;

public class MenuInteractivo {
	
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);

	//Creacion del usuario
	Usuario.crearUsuario();
	
	// Creación del armamento
	Armas arma1 = Armas.obtenerArmaAleatoria();
	
	
	//System.err.println("\nBienvenido al campo de batalla, " + usuario.getNombre());
	
	int opcion;
	//Creacion del menu que funciona hasta que opcion sea 6
	do {
		System.out.println("-----------Menu-------------------");
		System.out.println("1. Mostrar Inventario");
		System.out.println("2. Añadir armas a la mochila");
		System.out.println("3. Cambiar arma primaria o secundaria");
		System.out.println("4. Mostrar Nombre");
		System.out.println("5. Desequipar Arma");
		System.out.println("5. Equipar Accesorios");
		System.out.println("6. Salir");
		System.out.println("---------------------------------");
		System.out.print("\nSeleccione una opción---->");
		opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			arma1.mostrarArmamento();
			break;
		case 2:
			
			break;
		case 3:
			// InventarioController.addAccesorio(usuario, teclado);
			break;
		case 4:
			// InventarioController.equipar(usuario, teclado);
			break;
		case 5:
			// InventarioController.desequipar(usuario, teclado);
			break;
		case 6:
			System.err.println("\nSaliendo......");
			break;
		default:
			System.err.println("\nOpción no válida.");
		}
	}while(opcion == 6);
	
}

	
}