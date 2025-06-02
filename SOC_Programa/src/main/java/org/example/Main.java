package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;

        do {
            System.out.println("\n\nSelecciona una de las siguientes opciones: ");
            System.out.println("" +
                    "1. Contar caracteres \n" +
                    "2. Convertir a mayúsculas \n" +
                    "3. Convertir a minúsculas \n" +
                    "4. Contar palabras \n" +
                    "5. Verificar palíndromo \n" +
                    "6. Invertir texto \n" +
                    "7. Reemplazar palabra \n" +
                    "8. Eliminar espacios \n" +
                    "9. Salir");

            System.out.print("Ingresa un número: ");opc = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n");

            switch (opc) {
                case 1:
                    ContadorCaracteres contador = new ContadorCaracteres();
                    contador.ContarCaracteres(scanner);
                    break;
                case 2:
                    ConvertirMayusculas convertidor = new ConvertirMayusculas();
                    convertidor.ConvertirMayus(scanner);
                    break;
                case 3:
                    break;
                case 4:
                    ContarPalabras palabras = new ContarPalabras();
                    palabras.contar(scanner);
                    break;
                case 5:
                    Palindromo palindromo = new Palindromo();
                    palindromo.verificarPalindromo(scanner);
                    break;
                case 6:
                    TextoInvertido textoInvertido = new TextoInvertido();
                    textoInvertido.invertirTexto(scanner);
                    break;
                case 7:
                    ReplaceWord replaceWord = new ReplaceWord();
                    replaceWord.invertirPalabra(scanner);
                    break;
                case 8:
                    EliminarEspacios eliminarEspacios = new EliminarEspacios();
                    eliminarEspacios.eliminar(scanner);
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
            }
        }while (opc != 9);
    }
}