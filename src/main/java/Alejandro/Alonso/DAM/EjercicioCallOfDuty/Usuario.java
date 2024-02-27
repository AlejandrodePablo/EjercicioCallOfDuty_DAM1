package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

public class Usuario {
	String nombre;
	int espacioMochila;
	ArmaPrincipal armaPrincipal;
	ArmaSecundaria armaSecundaria;
	Accesorios[] accesorios;

	Usuario(String nombre, int espacioMochila) {
		this.nombre = nombre;
		this.espacioMochila = espacioMochila;
		this.accesorios = new Accesorios[3];
	}
}