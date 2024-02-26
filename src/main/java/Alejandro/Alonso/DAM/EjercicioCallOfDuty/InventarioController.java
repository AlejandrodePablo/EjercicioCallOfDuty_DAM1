package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

public class InventarioController {
	private final int TAM_INVENTARIO_DEF = 10;
	
	private ArmaPrincipal[] armasPrincipalesInventario;
	private ArmaSecundaria[] armasSecundariasInventario;
	private Accesorios[] accesoriosInventario;
	
	//Creacion del jugador1
	Usuario jugador1 = new Usuario();
	
	private void mostrarArray(Equipamiento[] arr, String msg) {
		System.out.println(msg);
		for (Equipamiento item : arr) {
			if(item != null)
				System.out.println(item + "\n");
		}
	}
}
