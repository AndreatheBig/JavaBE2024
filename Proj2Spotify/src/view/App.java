package view;

import java.util.ArrayList;

import controller.CanzoniCtrl;
import controller.PlayListCtrl;
import model.Canzone;

public class App {
	
	public static void main(String[] args) {
		
	CanzoniCtrl db = new CanzoniCtrl();
		
	db.caricaCanzoniDaFile();
	
	ArrayList<Canzone> allSongs = db.canzoni;
	
	for (Canzone canzone : allSongs) {
		System.out.println(canzone.titolo + " - " + canzone.cantante);
	}
		
	
	
	PlayListCtrl playlist = new PlayListCtrl("Prima PlayList");
	Canzone canzoneDaAggiungere = new Canzone(allSongs.get(0).titolo, allSongs.get(0).cantante);
	playlist.addCanzone(canzoneDaAggiungere);
	playlist.infoPlayList();
	


	
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
