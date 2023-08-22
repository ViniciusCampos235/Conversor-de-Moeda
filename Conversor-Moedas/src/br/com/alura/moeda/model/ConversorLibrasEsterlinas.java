package br.com.alura.moeda.model;

public class ConversorLibrasEsterlinas extends ConversorMoedas {

	private double librasEsterlinas;

	public ConversorLibrasEsterlinas() {
		this.librasEsterlinas = 6.32;
	}

	@Override
	public double converte(double valorEmReais) {
		return valorEmReais / librasEsterlinas;
	}
	
}
