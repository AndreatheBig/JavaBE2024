package OOP_model;

public class Bicicletta {
	String marca;
	String modello;
	byte numRuote;
	double velocita = 0;
	int frequenza = 0;
	int numMarce;
	
	public Bicicletta(String modello, String marca, byte numRuote, int numMarce) {
		this.modello = modello;
		this.marca = marca;
		this.numMarce = numMarce;
		this.numRuote = numRuote;
	}

	
//	modificatore tipoDiRitorno nomeMetodo(parametri?){}
// 	Con void non ho nessun return, nessun valore restituito dal metodo
	public void accelera(int incFrequenza) {
		frequenza = frequenza + incFrequenza;
		System.out.println("Stai accelerando, la frequenza attuale è: " + frequenza + "Hz");
	}
	
	public void rallenta(int incFrequenza) {
		frequenza = frequenza - incFrequenza;
		System.out.println("Stai decelerando, la frequenza attuale è : " + frequenza + "Hz");
	}
	
	public void calcolaVelocitaMax() {
		velocita = frequenza * numMarce;
		System.out.println("La velocità massima è " + velocita);
	}
	

	public String toString() {
		return "Bicicletta [marca=" + marca + ", modello=" + modello + ", numRuote=" + numRuote + ", velocita="
				+ velocita + ", frequenza=" + frequenza + ", numMarce=" + numMarce + "]";
	}
	
	
}
