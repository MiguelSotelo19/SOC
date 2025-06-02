package org.example;

import java.util.Scanner;

public class EliminarEspacios {

    public static void eliminar(Scanner scanner) {
        String texto;

        do {
            System.out.println("Ingresa un texto a eliminar espacios:");
            texto = scanner.nextLine();
            if (texto.trim().isEmpty()) System.out.println("El texto no puede estar vacío.");
        } while (texto.trim().isEmpty());

        System.out.println(eliminarEspacios(texto));
    }

    public static String eliminarEspacios(String texto) {
        return texto.replace(" ", "");
    }
}
