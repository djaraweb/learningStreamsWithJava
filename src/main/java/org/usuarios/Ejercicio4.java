package org.usuarios;

import org.utils.ExcelReader;
import org.utils.Logs;

import java.util.Comparator;

public class Ejercicio4 {

    public static void main(String[] args) {
        Logs.info("Ordenar todos los usuarios por su apellido orden alfabético descendente Z -> A");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var listUsuariosFiltrados = listUsuarios
                .stream()
                .sorted(Comparator.comparing(Usuario::getApellido).reversed())
                .toList();

        Logs.info("Los usuarios filtrados son: %s", listUsuariosFiltrados);
    }
}
