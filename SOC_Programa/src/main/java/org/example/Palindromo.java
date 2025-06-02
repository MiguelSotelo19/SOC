package org.example;

import java.util.Scanner;

public class Palindromo {

    public static void verificarPalindromo(Scanner scanner) {
        Palindromo palindromo = new Palindromo();

        System.out.print("Ingresa la palabra a verificar: ");
        palindromo.esPalindromo(scanner.nextLine());
    }

    public boolean esPalindromo(String palabra){
        palabra = palabra.toLowerCase().replaceAll("\\s+", "");

        char caracter;
        String p = "";

        for (int i = 0; i < palabra.length(); i++){
            caracter = palabra.charAt(i);
            System.out.println(caracter);

            p = caracter + p;
        }

        System.out.println(p);

        if (p.equals(palabra)) {
            System.out.println("Es palindromo");
            return true;
        } else {
            System.out.println("No es palindromo");
            return false;
        }
        

    }

}
