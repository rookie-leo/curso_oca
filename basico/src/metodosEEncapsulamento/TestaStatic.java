package metodosEEncapsulamento;

public class TestaStatic {

	public static void main(String... args) {
		Moto.totalDeMotos = 18;
		System.out.println(Moto.getTotalDeMotos());
		System.out.println(Moto.a);
		System.out.println(Moto.b);
		
		Moto m = new Moto();
		System.out.println(m.getTotalDeMotos());
		
		m.setMotosVendidas(5);
		System.out.println(Moto.getTotalDeMotos());
		
	}
	
}

class Moto {
	public static final int PADRAO_TOTAL_DE_MOTOS = 0; 
	public static int totalDeMotos = PADRAO_TOTAL_DE_MOTOS;
	private int motosVendidas = 0;
	
	public static int getTotalDeMotos() {
		return totalDeMotos;
	}
	
	static int b = getMetodo();
	
	public static int getMetodo() {
		return a;
	}
	
	static int a = 15; 
	
	public void setMotosVendidas(int qtde) {
		motosVendidas = qtde;
		totalDeMotos -= qtde;
	}
	
	public int getMotosVendidas() {
		return motosVendidas;
	}
	
}
