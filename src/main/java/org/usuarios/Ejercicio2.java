package org.usuarios;

import org.utils.ExcelReader;
import org.utils.Logs;

public class Ejercicio2 {

    public static void main(String[] args) {
        Logs.info("Crear un método que filtre todos los usuarios que en su correo el dominio de gmail.com");
        final var listUsuarios = ExcelReader.getListUsuarios();

        final var dominio="@gmail.com";
        final var listUsuarioFiltrados = listUsuarios
                .stream()
                .filter(u -> u.getCorreo().endsWith(dominio.toUpperCase()))
                .toList();
        Logs.info("La lista de usuarios con filtros es : %s", listUsuarioFiltrados);
    }
}
