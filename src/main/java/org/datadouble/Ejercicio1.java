package org.datadouble;

import org.utils.Helpers;
import org.utils.Logs;

import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {
        Logs.info("****** Generamos un array de double aleatorio de tamaño 500 con valores entre 10000 y 100000 ******");
        final var listNumeros = Helpers.generateArrayNumerosDecimales(500, 10000,100000);
        Logs.info("El array es: %s", Arrays.toString(listNumeros));

        Logs.info("****** Dividimos el valor de cada numero por 1000 ******");
        final var arrayDivisionValores = Arrays
                .stream(listNumeros)
                .map(n -> n/1000)
                .toArray();
        Logs.info("El array modificado es: %s", Arrays.toString(arrayDivisionValores));
    }

    private static double[] dividirValoresDeArray(double[] array) {
        for (var i = 0; i < array.length ; i++) {
            array[i] /= 1000;
        }
        return array;
    }
}
