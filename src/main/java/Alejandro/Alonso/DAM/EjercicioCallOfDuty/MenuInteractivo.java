package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

import java.util.Scanner;

public class MenuInteractivo {

    private static Scanner scanner = new Scanner(System.in);
    private static Usuario usuario = new Usuario();
    
    private static Armas arma1 = Armas.obtenerArmaAleatoria();
    private static  Armas arma2  =  Armas.obtenerArmaAleatoria();
    
    
    private static InventarioController inventarioController = new InventarioController();

    public static void main(String[] args) {
        int opcion;
        
        //Creacion del usuario 
    	Usuario.crearUsario();

        do {
        	
            System.out.println("----- Menú Interactivo -----");
            System.out.println("1. Ver armamento");
            System.out.println("2. Equipar accesorio");
            System.out.println("3. Cambiar arma principal");
            System.out.println("4. Cambiar arma secundaria");
            System.out.println("5. Agregar arma");
            System.out.println("6. Modificar arma");
            System.out.println("7. Eliminar arma");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Armas.mostrarArmamento();
                    break;
                case 2:
                    inventarioController.mostrarAccesoriosDisponibles();
                    System.out.print("Seleccione el accesorio que desea equipar (Ingrese el número): ");
                    int indiceAccesorio = scanner.nextInt();
                    inventarioController.equiparAccesorio(indiceAccesorio);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
            System.out.println();
        } while (opcion != 9);
    }
}
