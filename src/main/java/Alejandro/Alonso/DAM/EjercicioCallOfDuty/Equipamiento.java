package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

public class Equipamiento {
	
	private String nombre;
	private String descripcion;
	private Double peso;
	
	
	
		public Equipamiento(String nombre, String descripcion, Double peso) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
	} 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	@Override
	public String toString() {
		return "Equipamiento [nombre=" + nombre + ", descripcion=" + descripcion + ", peso=" + peso + "]";
	}


	
	
	

}
