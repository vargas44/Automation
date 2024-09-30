package org.example;



public class Ejercicio3NumeroParOImpar {
    public static void main(String[] args) {
    /*
    3. Número par o impar Dado el número a = 15, determina si es par o impar. Un número es par si es divisible por 2, y es impar si no lo es.
    a = 15.
    */
        //Variables
        int a = 15;
        //Condicion
        if (a % 2 == 0) {
            System.out.println(a + " es un número par.");
        } else {
            System.out.println(a + " es un número impar.");
        }


    }
}

