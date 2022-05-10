package tiposDados;

class Exercicios {

	public static void main(String[] args) {

		int i;
		for (i = 0; i < 5; i++) {
			if (++i % 3 == 0) {
				break;
			}
		}
		System.out.println(i);

		int $$ = 5;
		int __ = $$++;
		if (__ < ++$$ || __-- > $$)
			System.out.println("A");
		System.out.println($$);
		System.out.println(__);

		char c = 65;
		char c2 = 68 - 65;
		System.out.println(c + c2);

		String resultado = "Divisão dá " + 15 / 0.0;
		System.out.println(resultado);
	}
}
