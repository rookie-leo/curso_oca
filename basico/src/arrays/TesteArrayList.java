package arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class TesteArrayList {

	public static void main(String... args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Java");
		nomes.add("Ruby");
		nomes.add("Scala");
		
		Iterator<String> iterator = nomes.iterator();
		
		while(iterator.hasNext()) {
			String atual = iterator.next();
			System.out.println(atual);
		}
		
	}
	
}
