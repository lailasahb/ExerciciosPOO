package br.com.lailasahb.git;

public class Retangulo extends Forma {
		
	public Retangulo(double base, double altura, String nome) {
		this.base = base;
		this.altura = altura;
		this.nome = nome;
	}

	public double base;
	public double altura;
    public String nome;

	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setNome(String nome) {
		 this.nome = "Retângulo";
	}
	
	public String getNome() {
		return nome;
	}
	
	public double calcularPerimetro(){
		return this.getAltura() * 2 + this.getBase() * 2;
	}
	
	public double calcularArea(){
		return   this.getBase() * this.getAltura();
	}
	
}
