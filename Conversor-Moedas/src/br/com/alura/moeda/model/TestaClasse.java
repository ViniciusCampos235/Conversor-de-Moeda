package br.com.alura.moeda.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaClasse {

	public static void main(String[] args) {

		double converte;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Conversor de moedas alura");

			System.out.println("1 - Converter de Reais a Dólar\n" + "2 - Converter de Reais a Euro\n"
					+ "3 - Converter de Reais a Libras Esterlinas\n" + "4 - Converter de Reais a Peso argentino\n"
					+ "5 - Converter de Reais a Peso Chileno\n");

			System.out.print("Escolha a opção desejada: ");

			int menu = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Digite valor que deseja converter: ");
			double valor = scanner.nextDouble();

			switch (menu) {
			case 1:
				converte = new ConversorDolar().converte(valor);
				System.out.println("Valor em dolar: " + converte);
				break;
			case 2:
				converte = new ConversorEuro().converte(valor);
				System.out.println("Valor em dolar: " + converte);
				break;
			case 3:
				converte = new ConversorLibrasEsterlinas().converte(valor);
				System.out.println("Valor em dolar: " + converte);
				break;
			case 4:
				converte = new ConversorPesoArgentino().converte(valor);
				System.out.println("Valor em dolar: " + converte);
				break;
			case 5:
				converte = new ConvertePesoChileno().converte(valor);
				System.out.println("Valor em dolar: " + converte);
				break;

			default:
				System.out.println("opção de menu invalida");
				break;
			}

		} catch (InputMismatchException e) {
			System.out.println("Valor errado!");
		}
	}
}
