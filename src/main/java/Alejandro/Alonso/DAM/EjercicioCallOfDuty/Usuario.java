package Alejandro.Alonso.DAM.EjercicioCallOfDuty;


public class Usuario {
<<<<<<< Updated upstream
	 String nombre;
	 int espacioMochila;
	 ArmaPrincipal armaPrincipal;
	 ArmaSecundaria armaSecundaria;
	 Accesorios[] accesorios;
	 Equipamiento[] equipamiento;

	 Usuario(String nombre, int espacioMochila) {
	        this.nombre = nombre;
	        this.espacioMochila = espacioMochila;
	        this.accesorios = new Accesorios[3];
	        this.equipamiento = new Equipamiento[3];
	 }
=======
	String nombre;
    int espacioMochila;
    ArmaPrincipal[] armasPrincipales;
    ArmaSecundaria[] armasSecundarias;
    Accesorios[] accesorios;

    Usuario(String nombre, int espacioMochila) {
        this.nombre = nombre;
        this.espacioMochila = espacioMochila;
        this.armasPrincipales = new ArmaPrincipal[1];
        this.armasSecundarias = new ArmaSecundaria[1];
        this.accesorios = new Accesorios[3];
    }
>>>>>>> Stashed changes
}