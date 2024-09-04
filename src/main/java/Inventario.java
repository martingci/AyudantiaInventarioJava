import java.util.InputMismatchException;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        showMenu();
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

    public static void optionElection(int option) {
        switch (option) {
            case 1:
                System.out.println("Has seleccionado la opción 1");
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
    }

    public static void showMenu() {
        Object[][] produtos = new Object[10][3];
        int opcion;
        do {
            elections();
            opcion = userOption("Seleccione una opción (0 para salir)");
            optionElection(opcion);
        } while (opcion != 0);
    }

    public static void elections() {
        System.out.println("1. Agregar Productos al inventario");
        System.out.println("2. Restar Productos al inventario");
        System.out.println("3. Consultar disponibilidad de un producto");
        System.out.println("4. Listar todos los productos");
        System.out.println("0. Salir");
    }

}