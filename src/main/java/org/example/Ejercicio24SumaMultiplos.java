package org.example;

public class Ejercicio24SumaMultiplos {
    public static void main(String[] args) {
    /*
24. Sumar los múltiplos de un número en un rango
Descripción: Suma todos los múltiplos de a = 3 dentro del rango de 1 a 50. Un múltiplo de un número es el resultado de multiplicarlo por un entero.
Variables: a = 3, rango de 1 a 50.
    */
    //Variables
        int a = 3;
        int rangoInicio = 1;
        int rangoFin = 50;
        int suma = 0;

        for (int i = rangoInicio; i <= rangoFin; i++) {
            if (i % a == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de todos los múltiplos de " + a + " en el rango de " + rangoInicio + " a " + rangoFin + " es: " + suma);
    }
}






