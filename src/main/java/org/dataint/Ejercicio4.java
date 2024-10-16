package org.dataint;

import org.utils.Helpers;

import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("****** Generamos un array de int aleatorio de tamaño 500 con valores entre 1 y 1000 ******");
        final var listNumeros = Helpers.generateArrayNumeros(500, 1, 1000);
        System.out.printf("El array es: %s%n", Arrays.toString(listNumeros));

        System.out.println("****** Ordenar numeros de Menor a mayor ******");
        final var arrayNumerosOrdenados = Arrays
                .stream(listNumeros)
                .sorted()
                .toArray();
        System.out.printf("El array ordernado (ASC) es : %s", Arrays.toString(arrayNumerosOrdenados));
    }
}
