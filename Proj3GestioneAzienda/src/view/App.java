package view;

import controller.aziendaCtrl;
import model.Dipendente;

public class App {
	
	public static void main(String[] args) {
		
		aziendaCtrl azienda = new aziendaCtrl("Plutos&Pippos");
		
		azienda.addDipendente("Mario", "Rossi", "Manager");
		azienda.addDipendente("Laura", "Verdi", "Manager");
		azienda.addDipendente("Fra", "Tello", "Manager");
		
		for (Dipendente dip: azienda.getListaDipendenti()) {
			System.out.println(dip.presentati());
			System.out.println(dip.getStipendio());
		}
	}

}
