package Alejandro.Alonso.DAM.EjercicioCallOfDuty;

import java.util.Scanner;

public class InventarioController {
	
    public static void mostrarInventario(Usuario usuario) {
        System.out.println("Inventario de " + usuario.nombre + ":");
        System.out.println("Espacio en mochila: " + usuario.espacioMochila);

        System.out.println("\nArmas Principales:");
        for (ArmaPrincipal armaPrincipal : usuario.armasPrincipales) {
            if (armaPrincipal != null) {
                System.out.println("Nombre: " + armaPrincipal.nombre + ", Peso: " + armaPrincipal.peso);
            }
        }

        System.out.println("\nArmas Secundarias:");
        for (ArmaSecundaria armaSecundaria : usuario.armasSecundarias) {
            if (armaSecundaria != null) {
                System.out.println("Nombre: " + armaSecundaria.nombre + ", Peso: " + armaSecundaria.peso);
            }
        }

        System.out.println("\nAccesorios:");
        for (Accesorios accesorio : usuario.accesorios) {
            if (accesorio != null) {
                System.out.println("Nombre: " + accesorio.nombre + ", Peso: " + accesorio.peso);
            }
            
            System.out.println("\nEquipamientos:");
            for (Equipamiento equipamiento : usuario.equipamiento) {
                if (equipamiento != null) {
                    System.out.println("Nombre: " + equipamiento.nombre + ", Peso: " + equipamiento.peso);
                }
            }
        }
    }

    public static Armas crearArma(Scanner scanner) {
        System.out.print("Ingrese el nombre del arma: ");
        String nombreArma = scanner.next();
        System.out.print("Ingrese el peso del arma: ");
        int pesoArma = scanner.nextInt();
        System.out.print("¿Es un arma principal o secundaria? (P/S): ");
        char tipoArma = scanner.next().charAt(0);

        if (tipoArma == 'P') {
            return new ArmaPrincipal(nombreArma, pesoArma);
        } else if (tipoArma == 'S') {
            return new ArmaSecundaria(nombreArma, pesoArma);
        } else {
            System.out.println("Opción no válida.");
            return null;
        }
    }

    public static Accesorios crearAccesorio(Scanner scanner) {
        System.out.print("Ingrese el nombre del accesorio: ");
        String nombreAccesorio = scanner.next();
        System.out.print("Ingrese el peso del accesorio: ");
        int pesoAccesorio = scanner.nextInt();

        return new Accesorios(nombreAccesorio, pesoAccesorio);
    }

    public static void añadirArmaPrincipal(Usuario usuario, ArmaPrincipal armaPrincipal) {
        for (int i = 0; i < usuario.armasPrincipales.length; i++) {
            if (usuario.armasPrincipales[i] == null) {
                usuario.armasPrincipales[i] = armaPrincipal;
                System.out.println("Arma principal añadida con éxito.");
                return;
            }
        }
        System.out.println("No puedes llevar más armas principales.");
    }

    public static void añadirArmaSecundaria(Usuario usuario, ArmaSecundaria armaSecundaria) {
        for (int i = 0; i < usuario.armasSecundarias.length; i++) {
            if (usuario.armasSecundarias[i] == null) {
                usuario.armasSecundarias[i] = armaSecundaria;
                System.out.println("Arma secundaria añadida con éxito.");
                return;
            }
        }
        System.out.println("No puedes llevar más armas secundarias.");
    }

    public static void equiparAccesorio(Usuario usuario, Accesorios accesorio) {
        for (int i = 0; i < usuario.accesorios.length; i++) {
            if (usuario.accesorios[i] == null) {
                usuario.accesorios[i] = accesorio;
                System.out.println("Accesorio equipado con éxito.");
                return;
            }
        }
        System.out.println("No puedes equipar más accesorios.");
    }

    public static void desequiparAccesorio(Usuario usuario, String nombreAccesorio) {
        for (int i = 0; i < usuario.accesorios.length; i++) {
            if (usuario.accesorios[i] != null && usuario.accesorios[i].nombre.equals(nombreAccesorio)) {
                usuario.accesorios[i] = null;
                System.out.println("Accesorio desequipado con éxito.");
                return;
            }
        }
        System.out.println("Accesorio no encontrado.");
    }
    
    
    public static Equipamiento crearEquipamiento(Scanner scanner) {
        System.out.print("Ingrese el nombre del equipamiento: ");
        String nombreEquipamiento = scanner.next();
        System.out.print("Ingrese el peso del equipamiento: ");
        int pesoEquipamiento = scanner.nextInt();

        return new Equipamiento(nombreEquipamiento, pesoEquipamiento);
    }

    public static void añadirEquipamiento(Usuario usuario, Equipamiento equipamiento) {
        for (int i = 0; i < usuario.equipamiento.length; i++) {
            if (usuario.equipamiento[i] == null) {
                usuario.equipamiento[i] = equipamiento;
                System.out.println("Equipamiento añadido con éxito.");
                return;
            }
        }
        System.out.println("No puedes llevar más equipamiento.");
    }

    public static void desequiparEquipamiento(Usuario usuario, String nombreEquipamiento) {
        for (int i = 0; i < usuario.equipamiento.length; i++) {
            if (usuario.equipamiento[i] != null && usuario.equipamiento[i].nombre.equals(nombreEquipamiento)) {
                usuario.equipamiento[i] = null;
                System.out.println("Equipamiento desequipado con éxito.");
                return;
            }
        }
        System.out.println("Equipamiento no encontrado.");
    }
}
