package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

<<<<<<< Updated upstream
public class Armas {
		
		private String nombre;
		private int peso;
		
		
		public Armas(String nombre, int peso) {
			this.nombre = nombre;
			this.peso = peso;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
=======
import java.util.Arrays;
import java.util.Random;

public class Armas {
	private static final int ARMASBASE = 20;
	private static String principal;
	private static String secundaria;
	private static double peso;
	private static String calibre;
	private Armas[][] arma = new Armas[ARMASBASE][3];
	private static final Random random = new Random();

	private static final String[] ARMAPRINCIPAL = {"Rifle", "Escopeta", "Francotirador", "Subfusil"};
	
	private static final String[] ARMASECUNDARIA = { "Pistola", "Ballesta", "Granada", "Lanzacohetes", "cuerpo"};
	
	private static final String[] CALIBREARMAPRINCIPAL = {".223 Remington", "12 Gauge", ".309 Winchester", "9mm"};
	
	private static int pesoDisponible;

	public Armas(String principal, String secundaria ,String calibre2, double peso2) {
		this.principal = principal;
		this.secundaria=secundaria;
		this.calibre = calibre2;
		this.peso = peso2;
	}
	
	public Armas() {
		this.principal = principal;
		this.secundaria=secundaria;
		this.calibre = calibre;
		this.peso = peso;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getSecundaria() {
		return secundaria;
	}

	public void setSecundaria(String secundaria) {
		this.secundaria = secundaria;
	}
>>>>>>> Stashed changes


		public int getPeso() {
			return peso;
		}

<<<<<<< Updated upstream

		public void setPeso(int peso) {
			this.peso = peso;
		}
=======
	public String getCalibre() {
		return calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}
	
	

	@Override
	public String toString() {
		return "Armas [nombre=" + principal + "secundaria=" +secundaria + ", peso=" + peso + ", calibre=" + calibre + ", arma=" + Arrays.toString(arma)
				+ "]";
	}

	public static Armas obtenerArmaAleatoria() {
		String principal = ARMAPRINCIPAL[random.nextInt(ARMAPRINCIPAL.length)];
		String secundaria = ARMASECUNDARIA[random.nextInt(ARMASECUNDARIA.length)];
		pesoDisponible = (int) (10 +(Math.random() * 50));
		String calibre;
	    if (principal.equals("Rifle")) {
	        calibre = CALIBREARMAPRINCIPAL[0];
	    } else if (principal.equals("Escopeta")) {
	        calibre = CALIBREARMAPRINCIPAL[1];
	    } else if (principal.equals("Francotirador")) {
	        calibre = CALIBREARMAPRINCIPAL[2];
	    } else if (principal.equals("Subfusil")) {
	        calibre = CALIBREARMAPRINCIPAL[3];
	    } else {
	        calibre = "Calibre Desconocido";
	    }	
	    int peso = pesoDisponible;
		return new Armas(principal, secundaria, calibre, peso);
	}
	
    //Metodo mostrar armamento
	 public static void mostrarArmamento(){
	    	System.out.println("La arma principal es: " +principal);
	    	System.out.println("La arma secundaria es: " +secundaria);
	    	System.out.println("El peso total del inventario es: " +peso);
	    	System.out.println("El calibre del armaPrincipal es: " +calibre);
	    }

>>>>>>> Stashed changes
}

