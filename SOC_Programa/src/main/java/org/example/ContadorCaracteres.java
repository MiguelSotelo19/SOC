package org.example;

import java.util.Scanner;

public class ContadorCaracteres {

    public static int contar(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }
        return texto.length();
    }

    public static void ContarCaracteres(Scanner scanner) {
        String txt;

        do {
            System.out.println("Ingresa el texto:");
            txt = scanner.nextLine();
            if (txt.trim().isEmpty()) {
                System.out.println("La cadena no debe estar vacía o contener únicamente espacios.");
            }
        } while (txt.trim().isEmpty());

        int numeroCaracteres = contar(txt);
        System.out.println("La cadena de texto contiene " + numeroCaracteres + " caracteres.");
    }
}
