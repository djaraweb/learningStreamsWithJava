package org.pokemones;

import org.utils.JsonReader;
import org.utils.Logs;

import java.util.Comparator;

public class Ejercicio2 {

    public static void main(String[] args) {
        Logs.info("Ordenar todos los pokemones de tipo ELECTRICIDAD por su nivel de mayor a menor");
        final var listPokemones = JsonReader.getPokemonList();
        final var listPokemonesFiltrados = listPokemones
                .stream()
                .filter(pokemon -> pokemon.getTipo().equals("ELECTRICIDAD"))
                .sorted(Comparator.comparing(Pokemon::getNivel).reversed())
                .toList();
        Logs.info("Lista de Pokemones ordenanos por nivel y filtrados por tipo : %s", listPokemonesFiltrados);
    }
}
