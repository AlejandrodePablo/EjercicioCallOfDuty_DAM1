package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

import java.util.Scanner;

public class InventarioController {
	public static void mostrarInventario(Usuario usuario) {
	        System.err.println("Inventario de " + usuario.nombre + ":");
	        System.out.println("Espacio en mochila: " + usuario.espacioMochila);
	        System.out.println("Arma Principal: " + (usuario.armaPrincipal != null ? usuario.armaPrincipal.nombre : "Ninguna"));
	        System.out.println("Arma Secundaria: " + (usuario.armaSecundaria != null ? usuario.armaSecundaria.nombre : "Ninguna"));

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

	        return new Accesorios (nombreAccesorio, pesoAccesorio);
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
	            return null;  	        }

	        return arma;
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
