package org.example;

public class Ejercicio12InvertirNumeros {
    public static void main(String[] args) {
    /*
12. Inversión de un número
Descripción: Dado el número a = 54321, invierte el orden de sus dígitos. El resultado sería 12345.
Variables: a = 54321.
    */
    //Variables
        int a = 54321;
        int invertido = 0;

        System.out.println("El número sin invertir es: " + a);

        while (a != 0) {
            int digito = a % 10;
            invertido = invertido * 10 + digito;
            a /= 10;
        }

        System.out.println("El número invertido es: " + invertido);
    }
}






