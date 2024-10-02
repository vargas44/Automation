package org.example;

public class Ejercicio14DecimalABinario {
    public static void main(String[] args) {
    /*
14. Conversión de decimal a binario
Descripción: Dado el número decimal a = 45, conviértelo a binario.
Variables: a = 45.
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






