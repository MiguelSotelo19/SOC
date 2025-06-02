package org.example;

import java.util.Scanner;

public class ContadorCaracteres {
    public static int contarCaracteres (String texto) {

        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }

        return texto.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el texto: ");
        String txt = scanner.nextLine();

        int numeroCaracteres = contarCaracteres(txt);

        if (numeroCaracteres == 0) {
            System.out.println("La cadena no debe estar vacía o contener únicamente espacios.");
        } else {
            System.out.println("La cadena de texto contiene " + numeroCaracteres + " caracteres.");
        }
    }
}
