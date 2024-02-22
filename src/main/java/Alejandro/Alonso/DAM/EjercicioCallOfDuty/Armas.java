package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

import java.util.Random;

public class Armas {
	private static final int ARMASBASE = 20;
	private String nombre;
	private double peso;
	private String calibre;
	private Armas[][] arma = new Armas[ARMASBASE][3];
	private static final Random random = new Random();

	private static final String[] NOMBREDISPONIBLES = { "Pistola", "Rifle", "Escopeta", "Revólver", "Subfusil",
			"Francotirador", "Ballesta", "Granada", "Lanzacohetes", "Arco", "Machete", "Cuchillo", "Espada",
			"Fusil de Asalto", "Cañón", "Maza", "Hacha", "Lanza", "Estrella Ninja", "Bomba" };
	private static final String[] CALIBRESDISPONIBLES = { "9mm", "5.56mm", "7.62mm", ".45ACP", "12 Gauge", "7.62x39mm",
			"5.45x39mm", ".357 Magnum", ".44 Magnum", "10mm Auto", "20 Gauge", ".308 Winchester", ".50 BMG", ".22LR",
			".380 ACP" };
	private static Double pesoDisponible;

	public Armas(String nombre,  String calibre2, double peso2) {
		this.nombre = nombre;
		this.calibre = calibre2;
		this.peso = peso2;
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

	public static Armas obtenerArmaAleatoria() {
		String nombre = NOMBREDISPONIBLES[random.nextInt(NOMBREDISPONIBLES.length)];
		String calibre = CALIBRESDISPONIBLES[random.nextInt(CALIBRESDISPONIBLES.length)];
		pesoDisponible = (Double) (Math.random() * 15.00) + 0.5;
		Double peso = pesoDisponible;
		return new Armas(nombre, calibre, peso);
	}

}
