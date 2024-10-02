package org.example;

public class Ejercicio4NumerosPrimos {
    public static void main(String[] args) {
    /*
    4. Números primos Dado el número a = 29, determina si es primo. Un número primo solo tiene dos divisores: 1 y él mismo.
    a = 29.
    */
        //Variables
        int a = 29;
        boolean esPrimo = true;

        // Un número primo debe ser mayor que 1
        if (a <= 1) {
            esPrimo = false;
        } else {
        // Verificamos si el número es divisible por algún número entre 2 y la raíz cuadrada de a
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        // Imprimimos el resultado
        if (esPrimo) {
            System.out.println(a + " es un número primo.");
        } else {
            System.out.println(a + " no es un número primo.");
        }
    }

}


