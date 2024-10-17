package org.usuarios;

import org.utils.ExcelReader;
import org.utils.Logs;

public class Ejercicio1 {

    public static void main(String[] args) {
        Logs.info("Crear un método que filtre los usuarios que tengan peso mayor de 50.00, que su nombre comience con la letra R y su apellido termine en la letra O");
        final var listUsuarios = ExcelReader.getListUsuarios();

        listUsuarios
                .stream()
                .filter(x -> x.getPeso()>50.)
                .filter(y -> y.getNombre().startsWith("R"))
                .filter(z-> z.getApellido().endsWith("O"))
                .forEach(u -> Logs.info(u.toString()));
    }
}
