package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

public class Usuario {
	String nombre;
	int espacioMochila;
<<<<<<< Updated upstream
	ArmaPrincipal armaPrincipal;
	ArmaSecundaria armaSecundaria;
	Accesorios[] accesorios;
=======
	ArmaPrincipal[] armasPrincipales;
	ArmaSecundaria[] armasSecundarias;
	Accesorios[] accesorios;
	Equipamiento[] equipamiento;
>>>>>>> Stashed changes

	Usuario(String nombre, int espacioMochila) {
		this.nombre = nombre;
		this.espacioMochila = espacioMochila;
<<<<<<< Updated upstream
		this.accesorios = new Accesorios[3];
=======
		this.armasPrincipales = new ArmaPrincipal[1];
		this.armasSecundarias = new ArmaSecundaria[1];
		this.accesorios = new Accesorios[3];
		this.equipamiento = new Equipamiento[2];
	}

	public boolean espacioMochilaSuficiente(int peso) {

		int pesoActual = 0;

		// Calcular el peso actual sumando el peso de armas, accesorios y equipamiento
		for (Armas arma : armasPrincipales) {
			if (arma != null) {
				pesoActual += arma.peso;
			}
		}

		for (Armas arma : armasSecundarias) {
			if (arma != null) {
				pesoActual += arma.peso;
			}
		}

		for (Accesorios accesorio : accesorios) {
			if (accesorio != null) {
				pesoActual += accesorio.peso;
			}
		}

		for (Equipamiento equip : equipamiento) {
			if (equip != null) {
				pesoActual += equip.peso;
			}
		}

		// Verificar si hay espacio suficiente
		return (pesoActual + peso) <= espacioMochila;
>>>>>>> Stashed changes
	}
}