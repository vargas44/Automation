package org.example;

public class Ejercicio19NumeroPerfectos {
    public static void main(String[] args) {
    /*
19. Números perfectos
Descripción: Determina si el número a = 28 es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores (excluyendo el número mismo) es igual al número.
Variables: a = 28.
    */
    //Variables
        int a = 28;
        if (esNumeroPerfecto(a)) {
            System.out.println(a + " es un número perfecto.");
        } else {
            System.out.println(a + " no es un número perfecto.");
        }
    }

    public static boolean esNumeroPerfecto(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }
}






