package org.example;

import java.util.Scanner;

public class EliminarEspacios {

    public static void eliminar(Scanner scanner) {

        System.out.println("Ingresa un texto a eliminar espacios");
        String texto = scanner.nextLine();

        System.out.println(eliminarEspacios(texto));
    }
    
    public static String eliminarEspacios(String texto) {
        return texto.replace(" ", "");
    }
}
