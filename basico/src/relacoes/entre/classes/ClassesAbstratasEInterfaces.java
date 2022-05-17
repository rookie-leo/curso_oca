package relacoes.entre.classes;

interface VeiculoAbstrato {
	abstract void liga();
	abstract void desliga();
}

class CarroY implements VeiculoAbstrato, Runnable {
	public void liga() {
		System.out.println("Carro ligado");
	}
	
	@Override
	public void desliga() {
		System.out.println("Carro desligado");	
	}

	@Override
	public void run() {
		// TODO apenas testando a multi-implementação
		
	}
}

abstract class CarroAutomatico extends CarroY {
	private double velocidade;
	abstract void passaCambioAutomatico();
	
	void ferioDeMao() {
		this.velocidade = 0;
	}
}

class CarroEsportivo extends CarroAutomatico {
	private int cambio;
	private double velocidade;
	
	@Override
	void passaCambioAutomatico() {	
		if (this.velocidade < 15) {
			this.cambio = 1;
		} else if (this.velocidade >= 15) {
			this.cambio = 2;
		} else if (this.velocidade < 0) {
			this.cambio = -1;
			System.out.println("Marcha Ré");
		}
		else {
			System.out.println("Carro no ponto morto");
		}
	}
	
}

public class ClassesAbstratasEInterfaces {
	public static void main(String... args) {
		CarroAutomatico carro = new CarroEsportivo();
		carro.liga();
		carro.desliga();
	}
}
