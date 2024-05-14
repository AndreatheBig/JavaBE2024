package a_colori;

public class Main {
	public static void main(String[] args) {
	
		Colore primoColore = Colore.BLACK;
		Colore secondoColore = Colore.ORANGE;
		System.out.println(secondoColore.getNomeIta());
		
		switch (primoColore) {
		case BLACK: 
			System.out.println("Hai scelto il colore " + primoColore.getNomeIta() + " in posizione " + primoColore.getPosizione());
			break;
		case RED: 
			System.out.println("Hai scelto il colore " +  primoColore.getNomeIta() + " in posizione " + primoColore.getPosizione());
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + primoColore);
			}
	}
}

