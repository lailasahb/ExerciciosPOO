package br.com.lailasahb.git;

public class Circulo extends Forma {
	
	public Circulo(double raio, String nome) {
		this.raio = raio;
		this.nome = nome;
	}

	public double raio;
	public String nome;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public void setNome(String nome) {
		this.nome = "Círculo";
	}
	
	public String getNome() {
		return nome;
	}

	
	public double calcularPerimetro(){
		return 2 * this.getRaio() * Math.PI;
	}

	public double calcularArea(){
		return Math.PI * (this.getRaio() * this.getRaio());
	}

}
