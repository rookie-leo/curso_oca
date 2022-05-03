package tiposDados;

public class Teste {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		System.out.println(carro.ano);
		System.out.println(carro.primeiraLetra);
		System.out.println(carro.usado);
		System.out.println(carro.motor);
		System.out.println(carro.marca);
		
		long x = 1_234_567_898;
		System.out.println(x);
		
		int hex = 0xa;//10
		int oct = 0456;//302
		int bin = 0b101;//5
		System.out.println(hex);
		System.out.println(oct);
		System.out.println(bin);
		
		char c = 65;//A
		char c2 = '\u00c6';
		System.out.println(c);
		System.out.println(c2);
	}
	
}

class Motor {}

class Carro {
	int ano;
	char primeiraLetra;
	boolean usado;
	Motor motor;
	String marca;
}

class A {
    public static void main(String[] args) {
        for(char c='a';c <= 'z';c++) {
            System.out.println(c);
        }
    }
}