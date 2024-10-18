package org.pokemones;

import org.utils.JsonReader;
import org.utils.Logs;

public class Ejercicio1 {

    public static void main(String[] args) {
        Logs.info("Método que muestre todos los pokemones de tipo AIRE y que sean hembra");
        final var listPokemones = JsonReader.getPokemonList();

        final var listPokemonesFiltrados = listPokemones
                .stream()
                .filter(pokemon -> pokemon.getTipo().equals("AIRE"))
                .filter(pokemon -> !pokemon.isMacho())
                .toList();

        Logs.info("Lista de Pokemones: %s", listPokemonesFiltrados);
    }
}
