package lacos;

public class TestaFor {

	public static void main(String[] args) {
		
//		for (int i = 0, j =0; j <= 10; System.out.println(i + "x" + j + "=" + i * j), i++, j++);
//		
//		
//		for (int i = 0; i <= 10; i++) for (int j = 0; j <= 10; j++) System.out.println(i + "x" + j + "=" + i * j);
//		
//		for (int i = 0; i < 2; i++, System.out.println(i)) {
//			System.out.println(i);
//		}
		
		// Nomeando laços
		externo: for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (i * j == 36) break externo;
				if (i * j == 35) continue externo;
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
		
	}
	
}
