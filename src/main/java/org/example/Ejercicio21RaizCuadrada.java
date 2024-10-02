package org.example;

public class Ejercicio21RaizCuadrada {
    public static void main(String[] args) {
    /*
21. Raíz cuadrada sin usar librerías
Descripción: Calcula la raíz cuadrada del número a = 49 sin usar funciones predefinidas. La raíz cuadrada de 49 es 7.
Variables: a = 49.
    */
    //Variables
        int a = 49;
        double resultado = calcularRaizCuadrada(a);

        System.out.println("La raíz cuadrada de " + a + " es aproximadamente: " + resultado);
    }

    public static double calcularRaizCuadrada(int numero) {
        double aproximacion = numero / 2.0;
        double mejorAproximacion;

        do {
            mejorAproximacion = aproximacion;
            aproximacion = (mejorAproximacion + (numero / mejorAproximacion)) / 2.0;
        } while (Math.abs(mejorAproximacion - aproximacion) > 0.0001);

        return aproximacion;
    }
}






