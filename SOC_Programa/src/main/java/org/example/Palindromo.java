package org.example;

import java.util.Scanner;

public class Palindromo {

    public static void verificarPalindromo(Scanner scanner) {
        Palindromo palindromo = new Palindromo();
        String palabra;

        do {
            System.out.print("Ingresa la palabra a verificar: ");
            palabra = scanner.nextLine();
            if (palabra.trim().isEmpty()) System.out.println("La palabra no puede estar vacía.");
        } while (palabra.trim().isEmpty());

        palindromo.esPalindromo(palabra);
    }

    public boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase().replaceAll("\\s+", "");

        String p = "";
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            System.out.println(caracter);
            p = caracter + p;
        }

        System.out.println(p);

        if (p.equals(palabra)) {
            System.out.println("Es palíndromo");
            return true;
        } else {
            System.out.println("No es palíndromo");
            return false;
        }
    }
}
