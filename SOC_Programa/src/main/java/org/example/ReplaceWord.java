package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner lean = new Scanner(System.in);

        System.out.println("Ingresa la cadena de texto: ");
        String string = lean.nextLine();

        System.out.println("Ingresa la palabra a remplazar: ");
        String wordToReplace = lean.nextLine();

        System.out.println("Ingresa la palabra por la cual remplazar:");
        String wordToPut = lean.nextLine();

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
