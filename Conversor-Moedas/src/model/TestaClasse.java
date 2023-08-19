package model;

public class TestaClasse {

	public static void main(String[] args) {

		System.out.println("Conversor de moedas alura");

		System.out.println("Escolha a opção desejada");
		/*
		 * System.out.println("Converter de Reais a Dólar\n " +
		 * "Converter de Reais a Euro\n " + "Converter de Reais a Libras Esterlinas\n "
		 * + "Converter de Reais a Peso argentino\n " +
		 * "Converter de Reais a Peso Chileno\n");
		 */

		int menu = 4;

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
			break;
		}
	}
}
