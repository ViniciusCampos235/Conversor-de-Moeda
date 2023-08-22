package br.com.alura.moeda.model;

public class ConversorPesoArgentino extends ConversorMoedas{

	private double pesoArgentino;
	
	
	public ConversorPesoArgentino() {
		this.pesoArgentino = 0.014;
	
	}

	@Override
	public double converte(double valorEmReais) {
		return valorEmReais / pesoArgentino;
	}
	
}
