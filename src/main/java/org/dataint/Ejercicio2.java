package org.dataint;

import org.utils.Helpers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("****** Generamos un array de int aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, 1, 1000);
        System.out.printf("El array es: %s%n", Arrays.toString(listNumeros));

        System.out.println("****** Obtener los valores únicos. Por ejemplo: [1,1,2,2,3,4,4,3] -> [1,2,3,4] ******");
        final var arrayNumerosUnicos = Arrays
                .stream(listNumeros)
                .boxed()
                .collect(Collectors.toSet());
        System.out.printf("El array sin repetidos es: %s", arrayNumerosUnicos);
    }
}
