package org.example;

import java.util.Scanner;

public class ContadorCaracteres {
    public static int contar(String texto) {

        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }

        return texto.length();
    }

    public static void ContarCaracteres (Scanner scanner) {

        System.out.println("Ingresa el texto: ");
        String txt = scanner.nextLine();

        int numeroCaracteres = contar(txt);

        if (numeroCaracteres == 0) {
            System.out.println("La cadena no debe estar vacía o contener únicamente espacios.");
        } else {
            System.out.println("La cadena de texto contiene " + numeroCaracteres + " caracteres.");
        }
    }
}
