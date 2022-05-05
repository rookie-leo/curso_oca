package tiposDados;

public class TesteReferencia {

	public static void main(String... args) {
		int a = 10;
		int b = a;
		
		a += 5;
		
		System.out.println(a);
		System.out.println(b);
		
		Objt obj = new Objt();
		obj.valor = 10;
		Objt obj2 = obj;
		
		obj.valor += 7;
		
		System.out.println(obj.valor);
		System.out.println(obj2.valor);
		System.out.println("=====================");
		
		Calc x = new Calc();
		Calc y = x;
		y.valor++;
		x.valor++;
		Calc z = y;
		z.valor--;
		System.out.println(x.valor + y.valor + z.valor);
	}
	
}

class Objt {
	int valor;
}

class Calc{
	int valor = 15;
}
