package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n\nSelecciona una de las siguientes opciones: ");
            System.out.println("1. Contar caracteres");
            System.out.println("2. Convertir a mayúsculas");
            System.out.println("3. Convertir a minúsculas");
            System.out.println("4. Contar palabras");
            System.out.println("5. Verificar palíndromo");
            System.out.println("6. Invertir texto");
            System.out.println("7. Reemplazar palabra");
            System.out.println("8. Eliminar espacios");
            System.out.println("9. Salir");

            System.out.print("Ingresa un número: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. Ingresa un número válido: ");
                scanner.next();
            }

            opc = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (opc) {
                case 1 -> ContadorCaracteres.ContarCaracteres(scanner);
                case 2 -> ConvertirMayusculas.ConvertirMayus(scanner);
                case 3 -> ConvertidorMinusculas.convertir(scanner);
                case 4 -> ContarPalabras.contar(scanner);
                case 5 -> Palindromo.verificarPalindromo(scanner);
                case 6 -> new TextoInvertido().invertirTexto(scanner);
                case 7 -> ReplaceWord.invertirPalabra(scanner);
                case 8 -> EliminarEspacios.eliminar(scanner);
                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opc != 9);
    }
}
