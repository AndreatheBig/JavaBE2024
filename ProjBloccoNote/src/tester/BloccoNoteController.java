package tester;

import java.util.Scanner;

import model.BloccoNote;

public class BloccoNoteController {

	public static void main(String[] args) {
		
		//Creo un blocco note
		BloccoNote blocco = new BloccoNote();
		
		System.out.println("Benvenuto nel tuo bloccoNote: " + blocco.nome);
		
		boolean condUscita = true;
		
		
		
		System.out.println("Aggiungi una nuova nota");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Titolo: ");
		String titolo = sc.nextLine();
		
		System.out.println("Descrizione: ");
		String descrizione = sc.nextLine();
		
		System.out.println("Posizione: ");
		int posizione = sc.nextInt();
		
		//Aggiungo Una nota
		blocco.addNota(titolo, descrizione, posizione);
		
		blocco.stampaBloccoNote();
		
	}

}
