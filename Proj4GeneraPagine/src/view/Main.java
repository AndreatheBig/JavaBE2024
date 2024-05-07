package view;

import java.io.File;

import model.Prodotto;
import util.LeggiScriviFile;

public class Main {
	public static void main(String[] args) {
	
		Prodotto p = new Prodotto();
		p.setId(10214);
		p.setCodice("ABC123");
		p.setMarca("Plutos");
		p.setPrezzo(2850);

		File destinazioneWeb = new File("./paginaWeb.html");
		LeggiScriviFile.scrivi(destinazioneWeb, p.generaHTML());
		
		File destinazioneJSON = new File("./objectJSON.json");
		LeggiScriviFile.scrivi(destinazioneJSON, p.generaJSON());
		
	}
}
