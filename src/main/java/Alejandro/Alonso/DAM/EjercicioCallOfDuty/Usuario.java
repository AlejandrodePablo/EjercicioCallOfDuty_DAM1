package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	private int espaciosMochila;
	private Armas armaPrincipal;
	private Armas armaSecundaria;
	private ArrayList<Accesorios> accesorios;
	
	
	
	
	public Usuario(String nombre, int espaciosMochila) {
		this.nombre = nombre;
		this.espaciosMochila = espaciosMochila;
		this.accesorios = new ArrayList<>();
	}

	//Getter and Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEspaciosMochila() {
		return espaciosMochila;
	}
	public void setEspaciosMochila(int espaciosMochila) {
		this.espaciosMochila = espaciosMochila;
	}
	public Armas getArmaPrincipal() {
		return armaPrincipal;
	}
	public void setArmaPrincipal(Armas armaPrincipal) {
		this.armaPrincipal = armaPrincipal;
	}
	public Armas getArmaSecundaria() {
		return armaSecundaria;
	}
	public void setArmaSecundaria(Armas armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}
	
	public ArrayList<Accesorios> getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(ArrayList<Accesorios> accesorios) {
		this.accesorios = accesorios;
	}

	//toString
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", espaciosMochila=" + espaciosMochila + ", armaPrincipal=" + armaPrincipal
				+ ", armaSecundaria=" + armaSecundaria + ", accesorios=" + accesorios + "]";
	}

	public void verArmamento() {
		System.out.println("Armamento del usuario " + nombre + ":");
		
		if (armaPrincipal != null) {
			System.out.println("Arma Principal: " + armaPrincipal);
		} else {
			System.out.println("Arma Principal: No asignada");
		}
		
		if (armaSecundaria != null) {
			System.out.println("Arma Secundaria: " + armaSecundaria);
		} else {
			System.out.println("Arma Secundaria: No asignada");
		}
	}

	public void verEquipamiento() {
		System.out.println("Equipamiento del usuario " + nombre + ":");
		
		if (accesorios.isEmpty()) {
			System.out.println("No tiene accesorios equipados");
		} else {
			System.out.println("Accesorios equipados:");
			for (Accesorios accesorio : accesorios) {
				System.out.println("- " + accesorio);
			}
		}
	}
}