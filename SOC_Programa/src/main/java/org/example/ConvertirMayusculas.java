package org.example;

import java.util.Scanner;

public class ConvertirMayusculas {

    public static void ConvertirMayus(Scanner scanner) {
        String texto;
        do {
            System.out.print("Ingresa un texto: ");
            texto = scanner.nextLine();

            if (texto.trim().isEmpty()) {
                System.out.println("El texto no puede estar vacío.");
            }
        } while (texto.trim().isEmpty());

        convertirAMayusculas(texto);
    }

    public static void convertirAMayusculas(String texto) {
        String resultado = texto.toUpperCase();
        System.out.println("Texto en mayúsculas: " + resultado);
    }
}
