package org.usuarios;

import org.utils.ExcelReader;
import org.utils.Logs;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercicio5 {

    public static void main(String[] args) {
        Logs.info("Crear un método que sume las edades de 2 usuarios en base a su ID");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var mapUsuarios = listUsuarios
                .stream()
                .collect(Collectors.toMap(Usuario::getId, Function.identity()));

        final var user1 = mapUsuarios.get("USR-3");
        final var user2 = mapUsuarios.get("USR-4");
        final var sumaEdades = user1.getEdad() + user2.getEdad();

        Logs.info("Usuario1 : %s%n Usuario2 : %s", user1, user2);
        Logs.info("La Suma de edades de los usuarios es : %d", sumaEdades);
    }
}
