package org.example;

import java.util.Scanner;

public class ContarPalabras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Para leer desde consola

        System.out.println("Escribe una frase para contar las palabras:");
        String texto = scanner.nextLine(); // Captura lo que escribe el usuario

        int cantidad = contarPalabras(texto); // Llama al método que cuenta
        System.out.println("Cantidad de palabras: " + cantidad);
    }

    public static int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }
        // Divide el texto por espacios en blanco (uno o más)
        return texto.trim().split("\\s+").length;
    }
}