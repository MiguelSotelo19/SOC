package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReplaceWord {
    public static void invertirPalabra(Scanner scanner) {
        String string, wordToReplace, wordToPut;

        do {
            System.out.println("Ingresa la cadena de texto: ");
            string = scanner.nextLine();
            if (string.trim().isEmpty()) System.out.println("La cadena no puede estar vacía.");
        } while (string.trim().isEmpty());

        do {
            System.out.println("Ingresa la palabra a reemplazar: ");
            wordToReplace = scanner.nextLine();
            if (wordToReplace.trim().isEmpty()) System.out.println("La palabra no puede estar vacía.");
        } while (wordToReplace.trim().isEmpty());

        do {
            System.out.println("Ingresa la palabra por la cual reemplazar:");
            wordToPut = scanner.nextLine();
            if (wordToPut.trim().isEmpty()) System.out.println("La palabra no puede estar vacía.");
        } while (wordToPut.trim().isEmpty());

        replaceWord(string, wordToReplace, wordToPut);
    }

    public static void replaceWord(String string, String wordToReplace, String wordToPut) {
        if (string.contains(wordToReplace)) {
            String newString = string.replaceAll("\\b" + Pattern.quote(wordToReplace) + "\\b", wordToPut);
            System.out.println("Cadena con palabra reemplazada: " + newString);
        } else {
            System.out.println("Palabra a reemplazar no encontrada en la cadena");
        }
    }
}
