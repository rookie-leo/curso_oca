package lacos;

public class TestaFor {

	public static void main(String[] args) {

		for (int i = 0, j =0; j <= 10; System.out.println(i + "x" + j + "=" + i * j), i++, j++);
		
		
		for (int i = 0; i <= 10; i++) for (int j = 0; j <= 10; j++) System.out.println(i + "x" + j + "=" + i * j);
		
		for (int i = 0; i < 2; i++, System.out.println(i)) {
			System.out.println(i);
		}

		// Nomeando laços
		externo: for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (i * j == 36)
					break externo;
				if (i * j == 35)
					continue externo;
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}

		externo: for (int i = 0; i < 5; i++) {
			System.out.println("Entrando no SWITCH");

			trocador: switch (i) {
			case 0:
			case 1:
				System.out.println("Caso " + i);
				for (int j = 0; j < 3; j++) {
					System.out.println(j);
					if (j == 2)
						break trocador;
				}
			case 2:
				System.out.println("Legal, " + i);
				continue;
			case 3:
				System.out.println("Cheguei no caso " + i);
				break externo;
			default:
				System.out.println("Algo de errado não está certo");
				break;
			}
			System.out.println("Saindo do SWITCH");
		}

	}

}
