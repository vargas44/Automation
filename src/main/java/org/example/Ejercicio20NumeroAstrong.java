package org.example;

public class Ejercicio20NumeroAstrong {
    public static void main(String[] args) {
    /*
20. Número Armstrong
Descripción: Determina si el número a = 153 es un número Armstrong. Un número Armstrong es igual a la suma de sus dígitos elevados a la potencia del número de dígitos. Para 153, sería
Variables: a = 153.
    */
    //Variables
        int a = 153;
        if (esNumeroArmstrong(a)) {
            System.out.println(a + " es un número Armstrong.");
        } else {
            System.out.println(a + " no es un número Armstrong.");
        }
    }

    public static boolean esNumeroArmstrong(int numero) {
        int suma = 0;
        int temp = numero;
        int numeroDeDigitos = String.valueOf(numero).length();

        while (temp > 0) {
            int digito = temp % 10;
            suma += Math.pow(digito, numeroDeDigitos);
            temp /= 10;
        }

        return suma == numero;
    }
}






