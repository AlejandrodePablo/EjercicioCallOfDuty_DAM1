package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

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
