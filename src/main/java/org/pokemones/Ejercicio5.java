package org.pokemones;

import org.utils.JsonReader;
import org.utils.Logs;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio5 {

    public static void main(String[] args) {
        Logs.info("Sumar las defensas de 2 pokemones en base a su ID");
        final var listPokemones = JsonReader.getPokemonList();

        final var mapPokemones = listPokemones
                .stream()
                .collect(Collectors.toMap(Pokemon::getId, Function.identity()));

        final var pokemon1 = mapPokemones.get("PKM-348");
        final var pokemon2 = mapPokemones.get("PKM-350");
        final var sumaDefensas = pokemon1.getDefensa() + pokemon2.getDefensa();

        Logs.info("Pokemon1 : %s%n Pokemon2 : %s", pokemon1, pokemon2);
        Logs.info("La Suma de las defensas de los pokemones es : %.2f", sumaDefensas);
    }
}
