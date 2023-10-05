import java.util.Scanner;

public class Practica22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo de enteros: ");
        int tamano = scanner.nextInt();

        int[] arreglo = new int[tamano];

        System.out.println("Ingrese los valores enteros del arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        int maximo = encontrarMaximo(arreglo);
        int minimo = encontrarMinimo(arreglo);
        int impares = contarImpares(arreglo);
        int pares = contarPares(arreglo);

        // Mostrar los resultados
        System.out.println("El valor máximo en el arreglo es: " + maximo);
        System.out.println("El valor más pequeño en el arreglo es: " + minimo);
        System.out.println("Cantidad de valores impares en el arreglo: " + impares);
        System.out.println("Cantidad de valores pares en el arreglo: " + pares);
    }

    public static int encontrarMaximo(int[] arreglo) {
        int maximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }

    public static int encontrarMinimo(int[] arreglo) {
        int minimo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        return minimo;
    }

    public static int contarImpares(int[] arreglo) {
        int impares = 0;
        for (int valor : arreglo) {
            if (valor % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }

    public static int contarPares(int[] arreglo) {
        int pares = 0;
        for (int valor : arreglo) {
            if (valor % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
}
