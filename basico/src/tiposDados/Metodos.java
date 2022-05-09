package tiposDados;

public class Metodos {

	public static void main(String... args) {
		Calculadora calc = new Calculadora();
		
		print(calc.soma(1));
		print(calc.soma(1,2));
		print(calc.soma(2,2,3));
		print(calc.soma(1,2,3,4));
		print(calc.soma(1,2,3,4,5));
		print(calc.soma(1,2,3,4,5,6));
		print(calc.soma(1,2,3,4,5,6,7));
		
		print("\n");
		print("Java");
	}
	
	public static <T extends Object> void print(T obj) {
		System.out.println(obj);
	}
	
	
}

class Calculadora {
	public int soma(int... numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma;
	}
	
	public int soma(int x, int y, int z) {
		return x * y * z;		
	}

}
