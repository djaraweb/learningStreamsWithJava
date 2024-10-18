package org.pokemones;

import org.utils.JsonReader;
import org.utils.Logs;

public class Ejercicio4 {

    public static void main(String[] args) {
        Logs.info("A todos los pokemons aumentar el hp en 500 y retorna la nueva lista");
        final var listPokemones = JsonReader.getPokemonList();
        final var listPokemosConHPActualizado = listPokemones
                .stream()
                .map(pokemon -> pokemon.incrementarHP(500))
                .toList();

        Logs.info("Lista de Pokemones con HP aumentado : %s", listPokemosConHPActualizado);
    }

}
