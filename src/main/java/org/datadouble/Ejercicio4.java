package org.datadouble;

import org.utils.Helpers;
import org.utils.Logs;

import java.util.Arrays;
import java.util.Comparator;

public class Ejercicio4 {

    public static void main(String[] args) {
        Logs.info("****** Generamos un array de double aleatorio de tamaño 500 con valores entre 10000 y 100000 ******");
        final var listNumeros = Helpers.generateArrayNumerosDecimales(5, 10000,100000);
        Logs.info("El array es: %s", Arrays.toString(listNumeros));

        Logs.info("****** Ordenar numeros de Mayor a menor ******");
        final var arrayNumerosOrdenados = Arrays
                .stream(listNumeros)
                .boxed()
                .sorted(Comparator.comparingDouble(Double::doubleValue).reversed())
                .toArray();
        Logs.info("El array modificado es: %s", Arrays.toString(arrayNumerosOrdenados));
    }
}
