package org.example;

import java.util.Scanner;

public class ConvertirMayusculas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConvertirMayusculas convertidor = new ConvertirMayusculas();

        System.out.print("Ingresa un texto: ");
        String texto = scanner.nextLine();

        if (texto.trim().isEmpty()) {
            System.out.println("El texto no puede estar vacío.");
        } else {
            convertidor.convertirAMayusculas(texto);
        }

        scanner.close();
    }

    public String convertirAMayusculas(String texto) {
        String resultado = texto.toUpperCase();
        System.out.println("Texto en mayúsculas: " + resultado);
        return resultado;
    }
}
