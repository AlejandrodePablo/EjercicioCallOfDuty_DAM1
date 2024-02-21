package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

public class Armas {
		private static final int ARMASBASE = 20 ;
		private String nombre;
		private double peso;
		private String calibre;
		private Armas[][] arma =new Armas[ARMASBASE][3];
		private static final String[] NOMBREDISPONIBLES = {
		            "Pistola", "Rifle", "Escopeta", "Revólver", "Subfusil",
		            "Francotirador", "Ballesta", "Granada", "Lanzacohetes",
		            "Arco", "Machete", "Cuchillo", "Espada", "Fusil de Asalto",
		            "Cañón", "Maza", "Hacha", "Lanza", "Estrella Ninja", "Bomba"
		        };
		public Armas(String nombre, int peso, String calibre) {
			this.nombre = nombre;
			this.peso = peso;
			this.calibre = calibre;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public double getPeso() {
			return peso;
		}


		public void setPeso(double peso) {
			this.peso = peso;
		}
		
		

		
		
		
		
		
		
}
