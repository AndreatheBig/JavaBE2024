package a_esEreditarieta;

public class Libro extends Prodotto{
	
	public String autore;

	public Libro(int id, String nome, String descrizione, double prezzo, String marca, String autore) {
		super(id, nome, descrizione, prezzo, marca);
		this.autore = autore;
	}

	@Override
	public String descriviProdotto() {
		String descrizione = super.descriviProdotto() + " - Autore: " + this.autore;
		return descrizione;
	}
	
}
