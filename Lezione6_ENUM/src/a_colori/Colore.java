package a_colori;

public enum Colore {
	BLUE("Blu", 0), 
	GREEN("Verde", 1), 
	RED("Rosso", 2), 
	YELLOW("Giallo", 3), 
	BLACK("Nero", 4), 
	ORANGE("Arancione", 5);

	private String nomeIta;
	private int posizione;
	
	private Colore(String nomeIta, int posizione) {
		this.nomeIta = nomeIta;
		this.posizione = posizione;
	}
	
	public String getNomeIta() {
		return nomeIta;
	}
	
	public int getPosizione() {
		return posizione;
	}
	
}
