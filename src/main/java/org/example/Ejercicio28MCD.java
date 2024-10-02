package org.example;

public class Ejercicio28MCD {
    public static void main(String[] args) {
    /*
28. Calcular el máximo común divisor (MCD)
Descripción: Dados los números a = 48 y b = 18, calcula su MCD (máximo común divisor). El MCD es el número más grande que divide exactamente a ambos números.
Variables: a = 48, b = 18.
    */
    //Variables
        int a = 48;
        int b = 18;
        int mcd = calcularMCD(a, b);

        System.out.println("El MCD de " + a + " y " + b + " es: " + mcd);
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}






