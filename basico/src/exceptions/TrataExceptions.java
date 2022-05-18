package exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class TrataExceptions {

	public static void main(String... args) {
		String nome = args.length > 0 ? "a.txt" : null;
		try {
			nome.toLowerCase();
			new FileInputStream(nome);
			
		} catch (NullPointerException e) {
			System.out.println("Variavel nula");
		} catch (IOException e) {
			System.out.println("Não foi encontrado o arquivo");
		}
		
		System.out.println("Fim da execução");

		// Trabalhando o throw
		while (true) {
			for (int i = 0; i < 10;) {
				System.out.println(i);
				i++;
				if (i > 3)
					throw new RuntimeException("O valor limite foi atingido: " + i);
			}

		}

	}

}
