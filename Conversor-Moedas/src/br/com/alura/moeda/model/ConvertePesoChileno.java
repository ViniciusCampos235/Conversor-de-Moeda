package br.com.alura.moeda.model;

public class ConvertePesoChileno extends ConversorMoedas{

	private double pesoChileno;
	
	public ConvertePesoChileno() {
		this.pesoChileno = 0.0057;
	}

	@Override
	public double converte(double valorEmReais) {
		return valorEmReais / pesoChileno;
	}
}
