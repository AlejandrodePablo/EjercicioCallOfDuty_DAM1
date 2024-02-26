package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

public class Equipamiento {
    private String nombre;
    private int peso;

    // Constructor
    public Equipamiento(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    // Getters y setters

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

    @Override
    public String toString() {
        return "Equipamiento [nombre=" + nombre + ", peso=" + peso + "]";
    }
}
