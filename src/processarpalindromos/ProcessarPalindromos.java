package processarpalindromos;

import java.text.Normalizer;
import java.util.Scanner;

public class ProcessarPalindromos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String resposta = input.nextLine();

        while (resposta.trim().isEmpty()) {
            System.out.println("Entrada vazia! Digite novamente: ");
            resposta = input.nextLine();
        }

        // DEBUG: mostrar entrada original
        System.out.println("Entrada original: " + resposta);

        if (ehPalindromo(resposta)) {
            System.out.println("É um Palíndromo!");
        } else {
            System.out.println("Não é um Palíndromo!");
        }

        input.close();
    }

    public static boolean ehPalindromo(String texto) {
        String normalizado = normalizar(texto);
        String invertido = new StringBuilder(normalizado).reverse().toString();

        // DEBUG: mostrar versões tratadas
        System.out.println("Normalizado: " + normalizado);
        System.out.println("Invertido:   " + invertido);

        return normalizado.equals(invertido);
    }

    public static String normalizar(String texto) {
        // Remove acentos
        String semAcento = Normalizer.normalize(texto, Normalizer.Form.NFD)
                                     .replaceAll("\\p{M}", "");
        // Remove pontuação e espaços
        String limpo = semAcento.replaceAll("[^a-zA-Z0-9]", "");
        // Converte para minúsculas
        return limpo.toLowerCase();
    }
}