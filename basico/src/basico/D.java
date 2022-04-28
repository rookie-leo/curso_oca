package basico;

import java.io.File;
import java.util.*;

class D {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		
		for (String arg: args) {
			if (new E().existe(arg))
				lista.add(arg);
		}
	}
}

class E {
	public boolean existe(String nome) {
		File file = new File(nome);
		return file.exists();
	}
}




class Teste1 {
	int Teste1 = 305;
	
	void Teste1() {
		System.out.println(Teste1);
	}
	
	public static void main(String[] args) {
		new Teste1();
	}
}