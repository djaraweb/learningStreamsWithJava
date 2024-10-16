package org.datadouble;

import org.utils.Helpers;
import org.utils.Logs;

import java.util.Arrays;

public class Ejercicio3 {

    public static void main(String[] args) {
        Logs.info("****** Generamos un array de double aleatorio de tamaño 500 con valores entre 10000 y 100000 ******");
        final var listNumeros = Helpers.generateArrayNumerosDecimales(500, 10000,100000);
        Logs.info("El array es: %s", Arrays.toString(listNumeros));

        Logs.info("****** Obtenemos la suma de todos los valores del array ******");
        final var sumatoriaNumerosDeArray = Arrays
                .stream(listNumeros)
                .sum();
        Logs.info("Sumatoria de Numeros en Array es : %.2f", sumatoriaNumerosDeArray);
    }
}
