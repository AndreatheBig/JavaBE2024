package view;

import java.util.ArrayList;

import controller.CanzoniCtrl;
import model.Canzone;

public class App {
	
	public static void main(String[] args) {
		
		CanzoniCtrl database = new CanzoniCtrl();
		database.caricaCanzoniDaFile();
		
		System.out.println("Stampo tutte le canzoni presenti");
		ArrayList<Canzone> tutteCanzoni = database.canzoni;
		
		for (Canzone canzone :  tutteCanzoni) {
			System.out.println(canzone.titolo + " - " + canzone.cantante);
		}
		
		
		
//		String frase = "Ciao, come stai?";
//		String separate[] = frase.split(",");
//		
//		System.out.println(separate[0] +separate[1]);
//		
//		String separaLett[] = frase.split("");
//		
//		for (String singLettera : separaLett) {
//		}
		
		
		
	}

}
