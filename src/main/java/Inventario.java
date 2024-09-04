import java.util.InputMismatchException;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        inicioInventario();
    }

    public static int userOption(String text) {
        Scanner scanner = new Scanner(System.in);
        int option  = 0;
        boolean opcionValida = false;
        System.out.print(text + " ");
        while (!opcionValida) {
            try {
                option = scanner.nextInt();
                opcionValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor ingrese un número entero.");
                scanner.next();
            }
        }
        scanner.nextLine();
        return option;
    }

    public static Object[][] optionElection (int option, Object[][] productos) {
        switch (option) {
            case 1:
                agregarInventario(productos);
                break;
            case 2:
                System.out.println("Has seleccionado la opción 2");
                break;
            case 3:
                System.out.println("Has seleccionado la opción 3");
                break;
            default:
                System.out.println("Cerrando programa");
        }
        return productos;
    }

    public static void inicioInventario() {
        Object[][] productos = new Object[10][3];
        int opcion;
        do {
            elections();
            opcion = userOption("Seleccione una opción (0 para salir)");
            optionElection(opcion, productos);
        } while (opcion != 0);
    }

    public static void elections() {
        System.out.println("1. Agregar Productos al inventario");
        System.out.println("2. Restar Productos al inventario");
        System.out.println("3. Consultar disponibilidad de un producto");
        System.out.println("4. Listar todos los productos");
        System.out.println("0. Salir");
    }

    public static String userString(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(text + " :");
        String input = scanner.nextLine();
        scanner.close();
        return scanner.nextLine();
    }

    public static Object[][] agregarInventario (Object[][] listaProductos){
        boolean producto = false;
        System.out.println("Se va a agregar un producto");
        int id = userOption("Ingrese el id del producto: ");
        for (Object[] listaProducto : listaProductos) {
            if (listaProducto[0].equals(id)) {
                producto = true;
                break;
            }
        }


        }
    }
    public static Object datosProducto (boolean producto, String nombre) {

    }


}