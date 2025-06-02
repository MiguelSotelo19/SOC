package org.example;

import java.util.Scanner;

public class TextoInvertido {
    public void invertirTexto(Scanner scanner) {
        String texto;
        do {
            System.out.print("Ingresa un texto: ");
            texto = scanner.nextLine();
            if (texto.trim().isEmpty()) {
                System.out.println("El texto no puede estar vacío.");
            }
        } while (texto.trim().isEmpty());

        String textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + textoInvertido);
    }
}
