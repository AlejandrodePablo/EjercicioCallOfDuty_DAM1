package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

import java.util.ArrayList;
import java.util.List;

public class InventarioController {
    private List<Accesorios> accesoriosDisponibles;
    private List<Accesorios> accesoriosEquipados;
    private List<ArmasPrincipales> armasPrincipalesEquipadas;
    private List<ArmasSecundarias> armasSecundariasEquipadas;

    public InventarioController() {
        this.accesoriosDisponibles = new ArrayList<>();
        this.accesoriosEquipados = new ArrayList<>();
        this.armasPrincipalesEquipadas = new ArrayList<>();
        this.armasSecundariasEquipadas = new ArrayList<>();

        // Agregar accesorios predeterminados al inventario si lo deseas
        accesoriosDisponibles.add(new Accesorios("Mira telescópica",(int) 0.5));
        accesoriosDisponibles.add(new Accesorios("Cargador extendido",(int) 0.7));
        accesoriosDisponibles.add(new Accesorios("Silenciador", (int)0.3));
        // Agrega más accesorios según sea necesario
    }

    public void mostrarAccesoriosDisponibles() {
        System.out.println("Accesorios disponibles:");
        for (int i = 0; i < accesoriosDisponibles.size(); i++) {
            System.out.println((i + 1) + ". " + accesoriosDisponibles.get(i).getNombre());
        }
    }

    public void equiparAccesorio(int indice) {
        if (indice >= 1 && indice <= accesoriosDisponibles.size()) {
            Accesorios accesorioSeleccionado = accesoriosDisponibles.get(indice - 1);
            accesoriosEquipados.add(accesorioSeleccionado);
            accesoriosDisponibles.remove(accesorioSeleccionado);
            System.out.println("Accesorio \"" + accesorioSeleccionado.getNombre() + "\" equipado.");

        } else {
            System.out.println("Índice de accesorio no válido.");
        }
    }
}
