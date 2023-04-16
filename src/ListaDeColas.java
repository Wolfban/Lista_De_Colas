import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class ListaDeColas {

    private int capacidad;
    private Queue<Integer> cola;

    public ListaDeColas(int capacidad) {
        this.cola = new LinkedList<>();
        this.capacidad = capacidad;
    }

    public ListaDeColas() {
        this.cola = new LinkedList<>();
        this.capacidad = Integer.MAX_VALUE;
    }

    public void encolar(int elemento) {
        if (cola.size() == capacidad) {
            System.out.println("La cola está llena. No se puede agregar el elemento.");
        } else {
            cola.add(elemento);
            System.out.println("Se agregó el elemento " + elemento + " a la cola.");
        }
    }

    public int desencolar() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía. Agregue elementos antes de desencolar.");
            return -1;
        } else {
            return cola.remove();
        }
    }

    public int tamanio() {
        return cola.size();
    }

    public int primero() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía. No se puede obtener el primer elemento.");
            return -1; //
        } else {
            return cola.peek();
        }
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public void vaciar() {
        cola.clear();
    }

    public void mostrarElementos() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía. No hay elementos que mostrar.");
        } else {
            System.out.print("Elementos en la cola: ");
            for (int elemento : cola) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}



