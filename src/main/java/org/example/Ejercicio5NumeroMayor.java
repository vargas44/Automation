package org.example;

public class Ejercicio5NumeroMayor {
    public static void main(String[] args) {
    /*
5. Máximo de tres números
Dados los números a = 5, b = 12 y c = 9, encuentra cuál de ellos es el mayor.
Variables: a = 5, b = 12, c = 9.
    */
        //Variables
        int a = 5, b = 12, c = 9, max = a;

        //Condicion para saber cual de los 3 valores es mayor
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("El número mayor es: " + max);
    }
}



