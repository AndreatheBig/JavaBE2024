package controller;

import java.util.ArrayList;

import model.Canzone;

public class PlayListCtrl {
	
	public ArrayList<Canzone> canzoniPref = new ArrayList<>();
	public String nomePlayL;
	
	public PlayListCtrl(String nomePlayL) {
		this.nomePlayL = nomePlayL;
	}
	
//	La nostra playlist conterrà al massimo 10 canzoni
	public void addCanzone(Canzone canzone) {
		if( canzoniPref.size() <= 10) {
			canzoniPref.add(canzone);
		}else {
			System.out.println("Non puoi più inserire canzoni");
		}
	}
	
	
	public void infoPlayList() {
		System.out.println("Stai scegliendo la playlist: " + this.nomePlayL);
		int spazioDisponibile = 10 - this.canzoniPref.size();
		System.out.println("Spazio disponibile " + spazioDisponibile + " posti");
	}
	
	
	
}
