/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intervalos;
/**
 * La clase Intervalos proporciona métodos para clasificar un número
 * en diferentes intervalos y contiene el método principal para ejecutar
 * la aplicación.
 * 
 * @author Carlos
 */
public class Intervalos {

    /**
     * El método principal que se ejecuta al iniciar la aplicación.
     * Imprime un mensaje de bienvenida y puede ser utilizado para
     * probar el método ObtenerIntervalo.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * Obtiene la categoría de un número basado en su valor.
     * 
     * @param k El número a clasificar, de tipo double.
     * @return Un valor de tipo double que representa la categoría del número:
     *         -1 para "Intervalo A", 0 para "Intervalo B", y 1 para "Intervalo C".
     */
    public static double ObtenerIntervalo(double k) {
        if (k < -4) {
            return -1; // Representa "Intervalo A"
        }
        if (k >= -4 && k < 6) {
            return 0; // Representa "Intervalo B"
        } else {
            return 1; // Representa "Intervalo C"
        }
    }
}
