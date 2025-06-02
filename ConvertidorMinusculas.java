import java.util.Scanner;
public class ConvertidorMinusculas {

    //Método que convierte un texto a minusculas

    public static String convertirMinusculas(String texto) {
        return texto.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un texto");
        String entrada = scanner.nextLine();

        if (entrada.trim().isEmpty()) {
            System.out.println("Error: No se permiten cadenas vacias.");
        } else {
            String resultado = convertirMinusculas(entrada);
            System.out.println("Texto en minusculas: " + resultado);

            scanner.close();
            

        }
        
    }
}