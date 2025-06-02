package org.example;

public class Palindromo {

    public static void main(String[] args) {
        Palindromo palindromo = new Palindromo();
        
        palindromo.esPalindromo("anita lava la tina");
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
