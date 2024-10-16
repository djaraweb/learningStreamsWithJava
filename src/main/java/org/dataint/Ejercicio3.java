package org.dataint;

import org.utils.Helpers;
import org.utils.Logs;

import java.util.Arrays;

public class Ejercicio3 {

    public static void main(String[] args) {
        Logs.info("****** Generamos un array de int aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, 1, 1000);
        Logs.info("El array es: %s", Arrays.toString(listNumeros));

        Logs.info( "****** Que calcule la suma de todos los valores ******");
        final var sumatoriaNumerosDeArray = Arrays
                .stream(listNumeros)
                .sum();
        Logs.info("Sumatoria de Numeros en Array: %d", sumatoriaNumerosDeArray);
    }
}
