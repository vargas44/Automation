package org.example;

public class Ejercicio22ConteoDeDigitos {
    public static void main(String[] args) {
    /*
22. Conteo de dígitos de un número
Descripción: Cuenta cuántos dígitos tiene el número a = 987654. El resultado sería 6 dígitos.
Variables: a = 987654.
    */
    //Variables
        int a = 987654;
        int numeroDeDigitos = contarDigitos(a);

        System.out.println("El número " + a + " tiene " + numeroDeDigitos + " dígitos.");
    }

    public static int contarDigitos(int numero) {
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }
}






