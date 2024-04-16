package OOP_model;

public class Motocicletta {

//	Stiamo utilizzando un modificatore di default
	String marca = "Kawasaki";
	String modello;
	int cilindrata;
	byte ruoteMotrici = 1;
	boolean isAcceso = false;
	
	public Motocicletta(String modello, int cilindrata) {
		this.modello = modello;
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		String descrizione = "Motocicletta: " + marca + " " + modello + " Cilindrata: " + cilindrata + " Ruote Motrici " + ruoteMotrici + " Stato Motore " + isAcceso;
		return descrizione;
	}
	
}
