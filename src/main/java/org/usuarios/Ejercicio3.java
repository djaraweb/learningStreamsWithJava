package org.usuarios;

import org.utils.ExcelReader;
import org.utils.Logs;

public class Ejercicio3 {

    public static void main(String[] args) {
        Logs.info("Crear un método que filtre todos los usuarios que sean de China");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var listUsuariosFiltrados = listUsuarios
                .stream()
                .filter(u -> u.getPais().equals("CHINA"))
                .toList();

        Logs.info("Los usuarios filtrados son: %s", listUsuariosFiltrados);
    }
}
