package Esercitazione;

import java.util.Arrays;

public class Esercizio1 {

	public static void main(String[] args) {
		
		
		
//		1.a
		String parola1 = "Java";
		String parola2 = "Script";
		
		String unione = parola1.concat(parola2);
		System.out.println(unione);
		
		String uppCase = unione.toUpperCase();
		System.out.println(uppCase);
		
		String taglio = unione.substring(1,5);
		System.out.println(taglio);
		
		String[] separa = unione.split("aS");
		for (String pezzo : separa) {
			System.out.print(pezzo);
		}
		
		System.out.println();
		
		String saluto = "Ciao come stai ? Tutto bene grazie";
		
//		split() taglia una stringa tutte le volte che incontro un pattern
		String[] spezzata = saluto.split(" ");
		
		for (String pezzo : spezzata) {
			System.out.println(pezzo);
		}
		
		String mioNome = "Dario";
		String[] nomeArr = mioNome.split("");		
		for (String lettera : nomeArr) {
			System.out.println(lettera);
		}
		
	}
}
