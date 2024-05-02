package a_esEreditarieta;

public class Smartphone extends Prodotto {
	


	public double polliciSchermo;
	public int memoriaRAM;
	public int memoria;
	
	
	public Smartphone(int id, String nome, String descrizione, double prezzo, String marca, double polliciSchermo,int memoriaRAM, int memoria) {
		
		super(id, nome, descrizione, prezzo, marca);
		this.polliciSchermo = polliciSchermo;
		this.memoriaRAM = memoriaRAM;
		this.memoria = memoria;
	}


	@Override
	public String descriviProdotto() {
	
		String descrizioneSmartP = super.descriviProdotto() + " Ram: " + this.memoriaRAM + " HD: " + this.memoria + " - Schermo: " + this.polliciSchermo + " pollici";
		
		return descrizioneSmartP;
	}

	
}
