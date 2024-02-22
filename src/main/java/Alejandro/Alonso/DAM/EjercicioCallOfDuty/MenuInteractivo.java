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

        do {
            System.out.println("----- Menú Interactivo -----");
            System.out.println("1. Ver armamento");
            System.out.println("2. Equipar accesorio a arma");
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
                    usuario.verEquipamiento();
                    break;
                case 3:
                    equiparAccesorioAArma();
                    break;
                case 4:
                    cambiarArmaPrincipal();
                    break;
                case 5:
                    cambiarArmaSecundaria();
                    break;
                case 6:
                    inventarioController.agregarArma();
                    break;
                case 7:
                    inventarioController.modificarArma();
                    break;
                case 8:
                    inventarioController.eliminarArma();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 9);
    }

    private static void equiparAccesorioAArma() {
        // Implementar lógica para equipar accesorio a arma
    }

    private static void cambiarArmaPrincipal() {
        // Implementar lógica para cambiar arma principal
    }

    private static void cambiarArmaSecundaria() {
        // Implementar lógica para cambiar arma secundaria
	
    }
}
