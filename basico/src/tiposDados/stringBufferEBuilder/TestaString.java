package tiposDados.stringBufferEBuilder;

public class TestaString {
	


	public static void main(String... args) {
		String s = "teste";
		System.out.println(s.toUpperCase());
		System.out.println(s);
		
		String nomeDireto = "Java";
		String nomeIndireto = new String("Java");
		
		char[] nomeChar = new char[]{'J', 'a', 'v', 'a'};
		String nomeStr = new String(nomeChar);
		System.out.println(nomeChar);
		System.out.println(nomeStr);
		
		s = "aba";
		for (int i = 0; i < 9; i++) {
			s += "aba";
		}
		System.out.println(s.length());
		
//		StringBuilder sb = new StringBuilder("guilherme");
//		System.out.println(sb.indexOf("e")+ sb.lastIndexOf("e"));
//		System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));
		
	}
	
}
