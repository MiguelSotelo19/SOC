package org.example;

import java.util.Scanner;

public class TextoInvertido {
    public void invertirTexto(Scanner scanner) {

        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine();

        String textoInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        System.out.println("Texto invertido: " + textoInvertido);
    }
}
