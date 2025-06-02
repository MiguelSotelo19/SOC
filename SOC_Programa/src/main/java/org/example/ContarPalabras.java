package org.example;

import java.util.Scanner;

public class ContarPalabras {

    public static void contar(Scanner scanner) {
        System.out.println("Escribe una frase para contar las palabras:");
        String texto = scanner.nextLine();

        int cantidad = contarPalabras(texto);
        System.out.println("Cantidad de palabras: " + cantidad);
    }

    public static int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }

        return texto.trim().split("\\s+").length;
    }
}