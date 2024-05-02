package b_Incapsulamento;

public class Display {
	
	private String marca;
	private String modello;
	private String risoluzione;
	
	public Display() {
		
	}
	
	public Display(String marca, String modello, String risoluzione) {
		this.marca = marca;
		this.modello = modello;
		this.risoluzione = risoluzione;
	}

	public String getMarca(String password) {
		if(password == "Pipp0") {
			return marca;			
		}else {
			return "Mi spiace, non puoi accedere a questa informazione";
		}
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getRisoluzione() {
		return risoluzione;
	}

	public void setRisoluzione(String risoluzione) {
		this.risoluzione = risoluzione;
	}

	@Override
	public String toString() {
		return "Display [marca=" + marca + ", modello=" + modello + ", risoluzione=" + risoluzione + "]";
	}
	
	
	
}
