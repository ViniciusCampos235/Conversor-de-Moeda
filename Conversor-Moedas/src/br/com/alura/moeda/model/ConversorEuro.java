package br.com.alura.moeda.model;

public class ConversorEuro extends ConversorMoedas {

	private double valorAConverter;

	public ConversorEuro() {
		this.valorAConverter = 5.43;
	}

	@Override
	public double converte(double valorEmReais) {
		return valorEmReais / valorAConverter;
	}
}
