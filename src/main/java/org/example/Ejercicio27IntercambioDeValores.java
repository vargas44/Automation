package org.example;

public class Ejercicio27IntercambioDeValores {
    public static void main(String[] args) {
    /*
27. Intercambio de valores
Descripción: Intercambia los valores de a = 5 y b = 10 sin usar una tercera variable auxiliar.
Variables: a = 5, b = 10.
    */
    //Variables
        int a = 5;
        int b = 10;

        // Intercambio de valores sin variable auxiliar
        a = a + b; // a ahora es 15
        b = a - b; // b ahora es 5
        a = a - b; // a ahora es 10

        System.out.println("Después del intercambio: a = " + a + ", b = " + b);
    }
}






