package d_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloArrayList {
	public static void main(String[] args) {
		ArrayList<String> animali = new ArrayList<String>();
		
		animali.add("Cane"); //0
		animali.add("Gatto"); // 1
		animali.add("Canarino");
		animali.add("Squalo");
		
		//Per poter richiamare un elemento uso il metodo .get(indice)
		System.out.println(animali.get(0));
		System.out.println(animali.get(2));
	
		//L'arrayList è scalabile, posso anche rimuovere un elemento con .remove()
		animali.remove(2);
		
		//Per conoscere la misura dell'arraylist uso .size()
		System.out.println("Il mio array è composto da: " + animali.size()+ " elementi");
		
		
		for(int i = 0; i < animali.size(); i++) {
			System.out.println(animali.get(i));
		}
		
		System.out.println("Stampo con il foreach");
		animali.add("Delfino");
		animali.add("Struzzo");
		
		for (String animale : animali) {
			System.out.println(animale);
		}
		
		
		// Faccio un arrayList di numeri.
		// ATT: nell'operatore diamond del costruttore posso anche omettere il tipo
		ArrayList<Integer> voti = new ArrayList<>();
		voti.add(10);
		voti.add(5);
		voti.add(12);
		voti.add(1);
		
		for (Integer voto : voti) {
			System.out.println(voto);
		}
		
		//Per creare un arrayList posso far riferimento al tipo List
		List<String> parole = new ArrayList<>();
		parole.add("Ciao");
		parole.add("Come");
		parole.add("Stai");
		
		for (String parola : parole) {
			System.out.println(parola);
		}
		
		
		List<String> nomi = new ArrayList<>(Arrays.asList("Dario", "Luisa", "Pasquale", "Gennaro", "Anna", "Luca"));	
		
		for (String nome : nomi) {
			System.out.println(nome);
		}
		
		//Voglio creare un array partendo da un ArrayList
		
		List<String> colori = new ArrayList<>();
		colori.add("Rosso");
		colori.add("Giallo");
		colori.add("Blu");
		colori.add("Verde");
		colori.add("Rosa");
		colori.add("Bianco");
		colori.add("Nero");
		
		colori.remove(1);
		
		String[] coloriPR = new String[colori.size()];
		
		
		//Uso un ciclo for per caricare l'array con gli elementi dell'arraylist
		for(int i = 0;  i < colori.size(); i++) {
			coloriPR[i] = colori.get(i);
		}
		
		//Uso un ciclo for per scorrere l'arrayPR
		for (String colorePR : coloriPR) {
			System.out.println(colorePR);
		}
		
		
		System.out.println("STAMPO I COLORI AL CONTRARIO");
//		Collections.sort(colori); 
//		Collections.reverse(colori);
//		Collections.shuffle(colori);
//		Collections.sort(colori); //ordina alfabeticamente
		Collections.sort(colori, Collections.reverseOrder()); //ordine inverso con comparator
		
		
		for (String colore : colori) {
			System.out.println(colore);
		}
		
			
	}
}
