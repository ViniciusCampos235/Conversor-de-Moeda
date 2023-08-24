package br.com.alura.moeda.model.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.alura.moeda.model.ConversorDolar;
import br.com.alura.moeda.model.ConversorEuro;
import br.com.alura.moeda.model.ConversorLibrasEsterlinas;
import br.com.alura.moeda.model.ConversorPesoArgentino;
import br.com.alura.moeda.model.ConvertePesoChileno;
public class ExecutaPrograma {
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
			while (menu != 6) {

				System.out.println("Digite valor que deseja converter: ");
				double valor = scanner.nextDouble();

				switch (menu) {
				case 1:
					converte = new ConversorDolar().converte(valor);
					System.out.println("Valor em dolar: " + converte + "\n");
					break;
				case 2:
					converte = new ConversorEuro().converte(valor);
					System.out.println("Valor em dolar: " + converte + "\n");
					break;
				case 3:
					converte = new ConversorLibrasEsterlinas().converte(valor);
					System.out.println("Valor em dolar: " + converte + "\n");
					break;
				case 4:
					converte = new ConversorPesoArgentino().converte(valor);
					System.out.println("Valor em dolar: " + converte + "\n");
					break;
				case 5:
					converte = new ConvertePesoChileno().converte(valor);
					System.out.println("Valor em dolar: " + converte + "\n");
					break;
				default:
					System.out.println("opção de menu invalida");
					break;
				}

				System.out.println("1 - Converter de Reais a Dólar\n" + "2 - Converter de Reais a Euro\n"
						+ "3 - Converter de Reais a Libras Esterlinas\n" + "4 - Converter de Reais a Peso argentino\n"
						+ "5 - Converter de Reais a Peso Chileno\n" + "6 - sair");
				menu = scanner.nextInt();
				scanner.nextLine();

			}
		} catch (InputMismatchException e) {
			System.out.println("Valor errado!");
		}
		System.out.println("Encerrando programa");
	}
}
