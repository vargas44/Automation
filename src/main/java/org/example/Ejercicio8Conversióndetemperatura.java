package org.example;

public class Ejercicio8Conversióndetemperatura {
    public static void main(String[] args) {
    /*
8. Conversión de temperatura
Descripción: Dado que la temperatura es c = 25 grados Celsius, conviértela a Fahrenheit usando la fórmula:
Variables: c = 25.
    */
        // Variable de temperatura en grados Celsius
        float celsius = 25;

        // Conversión de Celsius a Fahrenheit
        float fahrenheit = celsiusAFahrenheit(celsius);

        // Imprimir el resultado
        System.out.printf("%.2f grados Celsius son %.2f grados Fahrenheit", celsius, fahrenheit);
    }

    // Método para convertir Celsius a Fahrenheit
    public static float celsiusAFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32;
    }
}




