package processarpalindromos;

import java.util.Scanner;

public class ProcessarPalindromos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String resposta;
		String resultado = "";
		
		System.out.println("Digite uma palavra ou frase: ");
		resposta = input.nextLine().toLowerCase();
		
		if(!resposta.isEmpty()) {
			for (int i = resposta.length() -1; i>=0; i--) {
				resultado += resposta.charAt(i);
			}
			if(resposta.toLowerCase().replaceAll(" ", "").equals(resultado.toLowerCase().replaceAll(" ", ""))) {
				System.out.println("A palavra/frase digitada é um Palíndromo!" + "\nFrase/palavra digitada: " + resposta + "\nResultado encontrado: " + resultado);
			}else {
				System.out.println("A palavra/frase digitada não é um Palíndromo! "  + "\nFrase/palavra digitada: " + resposta + "\nResultado encontrado: " + resultado);
			}
			
		}else {
			while (resposta.isEmpty()){
				System.out.println("O espaço não pode ser em branco!\nDigite novamente: ");
				resposta = input.nextLine();
			}
			for (int i = resposta.length() -1; i>=0; i--) {
				resultado += resposta.charAt(i);
			}
			if(resposta.toLowerCase().replaceAll(" ", "").equals(resultado.toLowerCase().replaceAll(" ", ""))) {
				System.out.println("A palavra/frase digitada é um Palíndromo!" + "\nFrase/palavra digitada: " + resposta + "\nResultado encontrado: " + resultado);
			}else {
				System.out.println("A palavra/frase digitada não é um Palíndromo! "  + "\nFrase/palavra digitada: " + resposta + "\nResultado encontrado: " + resultado);
			}
		}
		
		input.close();
	}
	

	
}
