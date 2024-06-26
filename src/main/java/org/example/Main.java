package org.example;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		EstruturaPrimeiraParte primeiraParte = new EstruturaPrimeiraParte();
		EstruturaSegundaParte segundaParte = new EstruturaSegundaParte();

		String letraPrimeiraParte = primeiraParte.getPrimeiraParte();
		String letraSegundaParte = segundaParte.getSegundaParte();

		String musicaCompleta = letraPrimeiraParte.concat(letraSegundaParte);

		// Loop para reproduzir partes da música
		while (true) {
			System.out.println("Digite '1' para reproduzir a primeira parte, '2' para a segunda parte, '3' para reproduzir a música completa ou 'q' para sair:");
			String escolha = scanner.nextLine();

			if (escolha.equals("1")) {
				System.out.println(letraPrimeiraParte);
			} else if (escolha.equals("2")) {
				System.out.println(letraSegundaParte);
			} else if (escolha.equals("3")) {
				System.out.println(musicaCompleta);
			} else if (escolha.equalsIgnoreCase("q")) {
				System.out.println("Saindo...");
				break;
			} else {
				System.out.println("Escolha inválida. Por favor, digite novamente.");
			}
		}

		scanner.close();
	}
	}

