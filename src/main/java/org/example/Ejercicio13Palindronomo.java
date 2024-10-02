package org.example;

public class Ejercicio13Palindronomo {
    public static void main(String[] args) {
    /*
13. Palíndromo de un número
Descripción: Determina si el número a = 1221 es palíndromo, es decir, si se lee igual de izquierda a derecha que de derecha a izquierda.
Variables: a = 1221.
    */
    //Variables
        int a = 1221;
        int original = a;
        int invertido = 0;

        while (a != 0) {
            int digito = a % 10;
            invertido = invertido * 10 + digito;
            a /= 10;
        }

        if (original == invertido) {
            System.out.println("El número " + original + " es un palíndromo.");
        } else {
            System.out.println("El número " + original + " no es un palíndromo.");
        }
    }
}






