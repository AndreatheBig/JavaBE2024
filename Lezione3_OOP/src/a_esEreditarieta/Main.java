package a_esEreditarieta;

public class Main {
	public static void main(String[] args) {
		

	Smartphone sp1 = new Smartphone(0, "S22", "Un telefono fico", 499, "Samsung", 6.5, 8, 128);
	
	System.out.println(sp1.descriviProdotto());
	System.out.println(Prodotto.TIPOPRODOTTO);

	
	Libro l1 = new Libro(1, "Il visconte dimezzato", "Ciclo Calvino", 12.30, "Utent", "Italo Calvino");
	
	System.out.println(l1.descriviProdotto());
	}
}
