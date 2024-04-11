package a_classeIntro;

public class RettangoloTest {

//	Dichiaro degli attributi all'interno della mia classe
// 	Queste sono proprietà di classe
//	STATO INTERNO
	int base;
	int altezza;
	

	

	public static void main(String[] args) {
		
//Qui posso costruire l'oggetto rettangoloTest utilizzando la parola chiave new

//ATT: quando uso la parola chiave new sto facendo uso del "Costruttore di Default". I costruttori hanno lo stesso nome della classe
		
// Creo un nuovo oggetto "rettangolo" ISTANZA della classe Rettangolo test
		RettangoloTest rettangolo = new RettangoloTest();
		
// Per poter dare un valore alle prop del rettangolo utilizzo la notazione punto
		rettangolo.altezza = 5;
		rettangolo.base = 6;
		
		int area = rettangolo.altezza * rettangolo.base;
		int perimetro = (rettangolo.altezza + rettangolo.base) * 2;
		
		System.out.println("L'altezza vale: " + rettangolo.altezza);
		System.out.println("La base vale: " + rettangolo.base);
		System.out.println("L'area del rettangolo vale: " + area);
		System.out.println("Il perimetro del rettangolo vale: " + perimetro);

		
		//RettangoloTest è un nuovo tipo, complesso
		//IStanzio un nuovo oggetto di tipo RettangoloTest
		RettangoloTest rettangolo2 = new RettangoloTest();
		rettangolo2.base = 4;
		rettangolo2.altezza = 8;
		
		
		int area2 = rettangolo2.base * rettangolo2.altezza;
		
		System.out.println("L'area del rettangolo2 vale: " + area2);		
	}
	
}
