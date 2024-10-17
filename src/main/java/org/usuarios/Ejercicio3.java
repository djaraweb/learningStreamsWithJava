package org.usuarios;

import org.utils.ExcelReader;
import org.utils.Logs;

public class Ejercicio3 {

    public static void main(String[] args) {
        Logs.info("Crear un método que filtre todos los usuarios que sean de China");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var pais = "China";
        listUsuarios
                .stream()
                .filter(u -> u.getPais().equals(pais.toUpperCase()))
                .forEach(x -> Logs.info(x.toString()));
    }
}
