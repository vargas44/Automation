package org.example;

public class Ejercicio25TablaMultiplicar {
    public static void main(String[] args) {
    /*
25. Generar tabla de multiplicar
Descripción: Genera la tabla de multiplicar del número a = 7.
Variables: a = 7.
    */
    //Variables
        int a = 7;
        generarTablaMultiplicar(a);
    }

    public static void generarTablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}






