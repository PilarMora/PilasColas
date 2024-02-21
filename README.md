# PilasColas
Agregar, eliminar o mostrar pilas y colas


import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        Queue<Integer> cola = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion, elemento;

        do {
            System.out.print("\n" + "Choose an option");
            System.out.println("\n" + "Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Delete item");
            System.out.println("3. Show stack");
            System.out.println("4. Show queue");
            System.out.println("0. Exit");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Write a number you wanna add: ");
                    elemento = scanner.nextInt();
                    pila.push(elemento);
                    cola.add(elemento);
                    break;

                case 2:
                    if (!pila.isEmpty() && !cola.isEmpty()) {
                        System.out.println("Item deleted from stack: " + pila.pop());
                        System.out.println("Item deleted from queue: " + cola.poll());
                    } else {
                        System.out.println("\n" + "The stack and queue are empty.");
                    }
                    break;

                case 3:
                    mostrarPila(pila);
                    break;

                case 4:
                    mostrarCola(cola);
                    break;

                case 0:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid option... try again");
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarPila(Stack<Integer> pila) {
        System.out.print("Items from stack: ");
        for (Integer elemento : pila) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    private static void mostrarCola(Queue<Integer> cola) {
        System.out.print("Items form queue: ");
        for (Integer elemento : cola) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
