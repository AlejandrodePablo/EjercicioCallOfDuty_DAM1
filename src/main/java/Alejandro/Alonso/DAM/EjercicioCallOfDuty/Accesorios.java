package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

public class Accesorios {
		private String nombre;
		private int peso;
		
		
		public Accesorios(String nombre, int peso) {
			this.nombre = nombre;
			this.peso = peso;
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
		
		private static final String[] ACCESORIOS = {
			    "Mira telescópica",     // Para Rifle y Francotirador
			    "Silenciador",          // Para Pistola, Rifle, Escopeta, Revólver, Subfusil y Fusil de Asalto
			    "Cargador extendido",   // Para todas las armas de fuego
			    "Bolsa de munición",    // Para todas las armas de fuego
			    "Bayoneta",             // Para Rifle y Fusil de Asalto
			    "Funda de transporte",  // Para todas las armas
			    "Correa para transportar", // Para todas las armas
			    "Funda protectora",     // Para todas las armas
			    "Puntero láser",        // Para todas las armas de fuego y algunas armas blancas como el Cuchillo y el Machete
			    "Empuñadura táctica"   // Para Pistola, Rifle, Escopeta, Subfusil y Fusil de Asalto
			};

		
		
		
		
		
}
