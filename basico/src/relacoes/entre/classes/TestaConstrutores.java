package relacoes.entre.classes;

class VeiculoX {
	double velocidade;
	double capacidadeMaximaDeGasolina = 150;
}

class Carro extends VeiculoX {
	double velocidade;
	double capacidadeMaximaDeGasolina = super.capacidadeMaximaDeGasolina;
	
	public double velocidadeDoCarro() {
		return this.velocidade;
	}
	
	public double velocidadeDoVeiculo() {
		return super.velocidade;
	}
}

public class TestaConstrutores {

	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.velocidade = 50;
		((VeiculoX)c).velocidade = 35;
		System.out.println(c.velocidadeDoCarro());
		System.out.println(c.velocidadeDoVeiculo());
		System.out.println(c.capacidadeMaximaDeGasolina);
		
	}
	
}
