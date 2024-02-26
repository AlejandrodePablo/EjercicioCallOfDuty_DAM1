package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

import java.util.Scanner;

public class Usuario {
	//Declaracion de atributos
	private static String nombre;

	//Getters and Setters
	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Usuario.nombre = nombre;
	}
	
	//Metodos
	
	//Metodo para crear al usuario
	public static void crearUsuario() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Creacion del usuario----");
		System.out.print("Introduce el nombre de tu usuario--->");
		nombre = sc.nextLine();
	}
	
	
	
}