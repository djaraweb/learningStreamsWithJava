package org.pokemones;

import org.utils.JsonReader;
import org.utils.Logs;

import java.util.Comparator;

public class Ejercicio3 {

    public static void main(String[] args) {
        Logs.info("Ordene todos los pokemones de CERULEAN CITY de menor a mayor por su nombre (A->Z)");
        final var listPokemones = JsonReader.getPokemonList();
        final var listPokemonesFiltrados = listPokemones
                .stream()
                .filter(pokemon -> pokemon.getUbicacion().equals("CERULEAN CITY"))
                .sorted(Comparator.comparing(Pokemon::getNombre))
                .toList();

        System.out.printf("Lista de Pokemones ordenanos : %s", listPokemonesFiltrados);
    }
}
