package org.example;

public class Ejercicio26ValorAbsoluto {
    public static void main(String[] args) {
    /*
26. Valor absoluto
Descripción: Determina el valor absoluto del número a = -15. El valor absoluto es la distancia de un número al 0, ignorando su signo.
Variables: a = -15.
    */
    //Variables
        int a = -15;
        int valorAbsoluto = calcularValorAbsoluto(a);

        System.out.println("El valor absoluto de " + a + " es: " + valorAbsoluto);
    }

    public static int calcularValorAbsoluto(int numero) {
        return (numero < 0) ? -numero : numero;
    }
}






