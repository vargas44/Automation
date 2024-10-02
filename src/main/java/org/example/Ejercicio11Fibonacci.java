package org.example;

public class Ejercicio11Fibonacci {
    public static void main(String[] args) {
    /*
11. Fibonacci
Descripción: Genera los primeros N = 10 números de la secuencia de Fibonacci, donde cada número es la suma de los dos anteriores. La secuencia comienza con 0 y 1.
Variables: N = 10.
    */
    //Variables
        int N = 10;
        int[] fibonacci = new int[N];

        // Los dos primeros números de la secuencia
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Generar la secuencia de Fibonacci
        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Imprimir la secuencia
        System.out.print("Los primeros " + N + " números de la secuencia de Fibonacci son: ");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}






