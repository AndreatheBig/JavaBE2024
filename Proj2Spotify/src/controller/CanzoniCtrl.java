package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Canzone;

public class CanzoniCtrl {

	public ArrayList<Canzone> canzoni;

	public CanzoniCtrl() {
		this.canzoni = new ArrayList<Canzone>();
	}
	
//	Costruisco un metodo per caricare le canzoni manualmente
	public void caricaCanzoniAMano() {
		String raccolta[] = {
				"Starway To Heaven;Led Zeppelin",
				"Una vita spericolata;Vasco Rossi",
				"Stai Zitto;Salmo",
				"Paradise City;Guns and Roses",
				"Kind of Blue;Miles Davis",
				"Acido;Prozac+",
				"Servi della gleba;EELST",
				"Cornutone;Squallor",
				"Bocca di rosa;De Andrè",
				"Gelato al cioccolato;Pupo"
		};
		
		for (String song : raccolta) {
//			Il metodo .split() applicato su una stringa genera un array. Tra le parentesi gli passo un carattere, un pattern grazie al quale esegue lo split
			
			String separate[] = song.split(";");
			String titolo = separate[0];
			String cantante = separate[1];
			Canzone canzone = new Canzone(titolo, cantante);
			this.canzoni.add(canzone);
		}
	}
	
	
	public void caricaCanzoniDaFile() {
//		Qui leggo il file canzoni.csv
		
		File f = new File("./canzoni.csv");
		
		try {
			Scanner s = new Scanner(f);
			
			while(s.hasNextLine()) {
				String riga = s.nextLine();
				String rigaSpezzata[] = riga.split(",");
				String cantante = rigaSpezzata[0];
				String titolo = rigaSpezzata[1];
				Canzone song = new Canzone(titolo, cantante);
				this.canzoni.add(song);				
			}
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
