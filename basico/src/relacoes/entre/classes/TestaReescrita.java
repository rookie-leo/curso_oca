package relacoes.entre.classes;

class Veiculo {
	public void liga() {
		print("Ligando veiculo");
	}
	
	protected static void print(String msg) {
		System.out.println(msg);
	}
}

class Helicoptero extends Veiculo {
	public void liga() {
		print("Ligando Helicoptero");
	}
}

abstract class Droid extends Veiculo {
	public abstract void liga();
}

class HexaDroid extends Droid {
	public void liga() {
		print("Ligando HexaDroid");
	}
}

class FabricaDeVeiculos {
	Veiculo fabricar() {
		return new Veiculo();
	}
}

class FabricaDeHexaDroid extends FabricaDeVeiculos {
	@Override
	HexaDroid fabricar() {
		return new HexaDroid();
	}
}

public class TestaReescrita {

	public static void main(String[] args) {
		Veiculo h1 = new Helicoptero();
		h1.liga();
		
		Helicoptero h2 = new Helicoptero();
		h2.liga();
		
		HexaDroid hx = new HexaDroid();
		hx.liga();
		
		Veiculo v = new FabricaDeVeiculos().fabricar();
		HexaDroid v2 = new FabricaDeHexaDroid().fabricar();
		v2.liga();
		
		System.out.println("===============================");
		
		liga(new Veiculo());
		liga(new Helicoptero());
		liga(new HexaDroid());
		liga(new FabricaDeVeiculos().fabricar());
		liga(new FabricaDeHexaDroid().fabricar());
	}
	
	static void liga(Veiculo v) {
		v.liga();
	}
	
}
