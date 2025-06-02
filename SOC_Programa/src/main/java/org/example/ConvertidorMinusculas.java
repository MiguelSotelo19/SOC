package org.example;

import java.util.Scanner;

public class ConvertidorMinusculas {

    public static String convertirMinusculas(String texto) {
        return texto.toLowerCase();
    }

    public static void convertir(Scanner scanner) {
        String entrada;
        do {
            System.out.println("Escribe un texto:");
            entrada = scanner.nextLine();

            if (entrada.trim().isEmpty()) {
                System.out.println("Error: No se permiten cadenas vacías.");
            }
        } while (entrada.trim().isEmpty());

        String resultado = convertirMinusculas(entrada);
        System.out.println("Texto en minúsculas: " + resultado);
    }
}
