package d_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EsercizioArrayList1 {
// Crea un arrayList di nomi comuni di persona(circa 10). Ordina alfabeticamente l'arrayList.
//	Stampa tutti i nomi in console con accanto l'indice: sia con for classico sia con foreach.
//	Stampa il numero di elementi presenti nell'ArrayList.
//  Rimuovi tutti gli elementi dall'arrayList (cerca il metodo opportuno).
//	Controlla se l'ArrayList è vuoto (cerca il metodo opportuno).
//	ATT: questi metodi fanno parte della classe ArrayList

	public static void main(String[] args) {
		
		List<String> nomiComuni = new ArrayList<>(Arrays.asList("Dario", "Fabio", "Egle", "Mauro", "Oscar", "Claudia", "Luca", "Anna", "Tina"));
		
		for(int i = 0; i < nomiComuni.size(); i++) {
			System.out.println((i+1) + ". " + nomiComuni.get(i));
		}
		
		
		System.out.println("Stampo con foreach");
		
		int indice = 0;
		for (String nome : nomiComuni) {
			System.out.println(++indice + ". " + nome);
		}
		
		System.out.println("I nomi totali sono " + nomiComuni.size());
		
		System.out.println("Rimuovo tutti gli elementi nell'arraylist");
		nomiComuni.clear();
//		nomiComuni.removeAll(nomiComuni);
		
		System.out.println("Il mio arrayList è vuoto ? " + nomiComuni.isEmpty());
	}
}
