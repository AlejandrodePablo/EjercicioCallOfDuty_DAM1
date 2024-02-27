package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

public class Accesorios {
	String nombre;
	int peso;
	
	public Accesorios(String nombre, int peso) {
		this.peso=peso;
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
}
