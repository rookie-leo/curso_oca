package tiposDados.stringBufferEBuilder;

public class StringBufferEBuilder {

	public static void main(String... args) {
		
		/*StringBuffer*/
		StringBuffer sbf = new StringBuffer();
		sbf.append("-");
		sbf.append("Testando StringBuffer: ");
		System.out.println(sbf.toString());
		
		StringBuffer sbf2 = new StringBuffer(50);// Instancia um StringBuffer de tamanho 50
		System.out.println(sbf2);
		
		StringBuffer sbf3 = new StringBuffer(sbf);
		sbf3.append("Adicionando mais conteudos ao sbf com sbf3");
		System.out.println(sbf3);
		
		
		/*StringBuilder*/
		System.out.println("\n==============================================");
		StringBuilder sb = new StringBuilder();
		sb.append("-");
		sb.append("Testando StringBuilder: ");
		System.out.println(sb.toString());
		
		StringBuilder sb2 = new StringBuilder(50);// Instancia um StringBuilder de tamanho 50
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder(sb);
		sb3.append("Adicionando mais conteudos ao sb com sb3");
		System.out.println(sb3);
		
		sb.append(sbf3);
		System.out.println(sb);
		
		sb.append(10);
		System.out.println(sb);
		
		StringBuilder sb4 = new StringBuilder("Testando StringBuffer");
		System.out.println(sb4);
		sb4.insert(8, " StringBuilder e ");
		System.out.println(sb4);
		sb4.delete(22, 38);
		System.out.println(sb4);
		
		System.out.println(new StringBuilder("Leonardo").reverse());
		StringBuilder sb5 = new StringBuilder("Testando StringBuilder e  StringBuffer");
		System.out.println(sb5.substring(9, 22));
		System.out.println(sb5.subSequence(26, 38));
		System.out.println(sb5);
		
		
	}
	
}
