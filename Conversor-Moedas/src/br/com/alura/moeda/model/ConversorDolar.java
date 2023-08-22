package br.com.alura.moeda.model;

public class ConversorDolar extends ConversorMoedas {

	private double valorAConverter;
	
	public ConversorDolar() {
		this.valorAConverter = 4.98;
	}

	@Override
	public double converte(double valorEmReais) {
		return valorEmReais / valorAConverter;
	}
}
