package br.com.alura.moeda.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaClasse {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Conversor de moedas alura");

			System.out.print("Escolha a opção desejada: ");

			int menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Converter de Reais a Dólar");
				break;
			case 2:
				System.out.println("Converter de Reais a Euro");
				break;
			case 3:
				System.out.println("Converter de Reais a Libras Esterlinas");
				break;
			case 4:
				System.out.println("Converter de Reais a Peso argentino");
				break;
			case 5:
				System.out.println("Converter de Reais a Peso Chileno");
				break;
			default:
				System.out.println("opção invalida");
				break;
			}

		} catch (InputMismatchException e) {
			System.out.println("Valor errado!");
		}
	}
}
