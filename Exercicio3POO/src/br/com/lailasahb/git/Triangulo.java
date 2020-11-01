package br.com.lailasahb.git;

public class Triangulo {

	public Triangulo(double lado, String nome) {
		super();
		this.lado = lado;
		this.nome = nome;
	}
	public double lado;
	public String nome;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public void setNome(String nome) {
		this.nome = "Triangulo";
	}
	
	public String getNome() {
		return nome;
	}
	
	public double calcularPerimetro(){
		return getLado() * 3;
	}

	public double calcularArea(){
		return ((getLado() * getLado()) * Math.sqrt(3)) / 4;
	}

}
