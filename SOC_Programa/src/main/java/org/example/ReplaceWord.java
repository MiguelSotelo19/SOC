package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReplaceWord {
    public static void invertirPalabra(Scanner scanner) {

        System.out.println("Ingresa la cadena de texto: ");
        String string = scanner.nextLine();

        System.out.println("Ingresa la palabra a remplazar: ");
        String wordToReplace = scanner.nextLine();

        System.out.println("Ingresa la palabra por la cual remplazar:");
        String wordToPut = scanner.nextLine();

        replaceWord(string, wordToReplace,wordToPut);
    }
    public static void replaceWord(String string, String wordToReplace, String wordToPut) {
        if (string.contains(wordToReplace)) {
            String newString = string.replaceAll("\\b" + Pattern.quote(wordToReplace) + "\\b", wordToPut);
            System.out.println("Cadena con palabra remplazada: " + newString);
        } else {
            System.out.println("Palabra a remplazar no encontrada en la cadena");
        }
    }
}
