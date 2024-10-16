package org.dataint;

import org.utils.Helpers;
import org.utils.Logs;

import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {
        Logs.info("****** Generamos un array de int aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, 1, 1000);
        Logs.info("El array es: %s", Arrays.toString(listNumeros));

        Logs.info("****** Ordenar numeros de Menor a mayor ******");
        final var arrayNumerosOrdenados = Arrays
                .stream(listNumeros)
                .sorted()
                .toArray();
        Logs.info("El array ordernado (ASC) es : %s", Arrays.toString(arrayNumerosOrdenados));
    }
}
