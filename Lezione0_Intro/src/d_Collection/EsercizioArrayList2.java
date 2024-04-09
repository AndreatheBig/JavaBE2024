package d_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EsercizioArrayList2 {
	
// Gioco del Lotto
// Chiedere all'utente quanti numeri casuali estrarre da un set di 90 numeri.
	
	public static void main(String[] args) {
		
		List<Integer> numEstratti = new ArrayList<>();
		System.out.println("Inserisci quanti num estrarre: mi raccomando massimo 90");
		Scanner sc = new Scanner(System.in);
		int numDaEstrarre = sc.nextInt();
		
		int numGiri = 0;
		
		if(numDaEstrarre > 90) {
			System.out.println("Non puoi inserire più di 90 numeri");
		}else {
			for(int i = 0; i < numDaEstrarre; i++) {
				int numCasuale = (int) Math.ceil(Math.random() * 90);
				if(numEstratti.contains(numCasuale)) {
					i--;
				}else {
					numEstratti.add(numCasuale);
				}
				numGiri++;
			}
		}
		
		System.out.println(numEstratti.toString());
//		System.out.println(numEstratti.size());
		System.out.println(numGiri);
	}
}
