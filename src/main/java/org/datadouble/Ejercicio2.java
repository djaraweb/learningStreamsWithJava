package org.datadouble;

import org.utils.Helpers;
import org.utils.Logs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static void main(String[] args) {
        Logs.info("****** Generamos un array de double aleatorio de tamaño 500 con valores entre 10000 y 100000 ******");
        final var listNumeros = Helpers.generateArrayNumerosDecimales(500, 10000,100000);
        Logs.info("El array es: %s", Arrays.toString(listNumeros));

        Logs.info("****** Obtenemos los valores únicos. Por ejemplo: [1,1,2,2,3,4,4,3] -> [1,2,3,4] ******");
        final var arrayNumerosUnicos = Arrays
                .stream(listNumeros)
                .boxed()
                .collect(Collectors.toSet());
        Logs.info("El array sin repetidos es: %s", arrayNumerosUnicos);
        Logs.info("Total Items filtrados: %d" , arrayNumerosUnicos.size());
    }
}
