import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeColas listaDeColas = new ListaDeColas();

        int opcion = 0;
        while (opcion != 8) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar elemento a la cola");
            System.out.println("2. Remover elemento de la cola");
            System.out.println("3. Obtener tamaño de la cola");
            System.out.println("4. Obtener primer elemento de la cola");
            System.out.println("5. Verificar si la cola está vacía");
            System.out.println("6. Vaciar la cola");
            System.out.println("7. Mostrar elementos de la cola");
            System.out.println("8. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el elemento a agregar:");
                    int elemento = scanner.nextInt();
                    listaDeColas.encolar(elemento);
                    break;
                case 2:
                    int elementoRemovido = listaDeColas.desencolar();
                    if (elementoRemovido != -1) {
                        System.out.println("Se removió el elemento " + elementoRemovido + " de la cola.");
                    }
                    break;
                case 3:
                    int tamanio = listaDeColas.tamanio();
                    System.out.println("La cola tiene " + tamanio + " elementos.");
                    break;
                case 4:
                    int primerElemento = listaDeColas.primero();
                    if (primerElemento != -1) {
                        System.out.println("El primer elemento de la cola es " + primerElemento + ".");
                    }
                    break;
                case 5:
                    boolean estaVacia = listaDeColas.estaVacia();
                    if (estaVacia) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("La cola no está vacía.");
                    }
                    break;
                case 6:
                    listaDeColas.vaciar();
                    System.out.println("Se vació la cola.");
                    break;
                case 7:
                    listaDeColas.mostrarElementos();
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}
