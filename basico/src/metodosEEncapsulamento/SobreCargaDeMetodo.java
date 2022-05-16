package metodosEEncapsulamento;

public class SobreCargaDeMetodo {

	public static void main(String[] args) {
		
		new Overloader().metodo((Object)"String");
		new Overloader().metodo("String");
		new Overloader().metodo(new Object());
		
	}
	
}


class Overloader {
	public void metodo(Object objt) {
		System.out.println("Obeject");
	}
	public void metodo(String str) {
		System.out.println("String");
	}

}