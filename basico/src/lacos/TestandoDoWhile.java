package lacos;

public class TestandoDoWhile {

	public static void main(String... args) {
		
		if (args.length < 10) {
			do {
				if (args.length > 2) return;
			} while (true);
		}
		System.out.println("Finalizou");
		
		int i = 0;
		do System.out.println(i); while(i++<10);
		
		do; while(i++<10);
	}
	
}
