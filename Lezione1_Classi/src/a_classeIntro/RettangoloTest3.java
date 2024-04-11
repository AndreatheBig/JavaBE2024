package a_classeIntro;

public class RettangoloTest3 {
	
	double altezza;
	double base;
	String nomeFigura;

	
//	ATT: il metodo costruttore di DEFAULT lo vado a specificare solo se prevedo di fare uso
//	Per generare un costruttore utilizzando i campi uso Alt+Shift+S -> Generate Constructor using Fields

	public RettangoloTest3(double altezza, double base, String nomeFigura) {
		super();
		this.altezza = altezza;
		this.base = base;
		this.nomeFigura = nomeFigura;
	}



//	Costruisco dei metodi per la mia classe. Il double rappresenta il tipo del valore che il metodo mi restituirà con il return
	public double calcolaArea() {
		double area = this.altezza * this.base;
		return area;
	}
	

	public double calcolaVolume(double profondita) {
//		double volume = this.altezza * this.base * profondita;
		
//		Posso utilizzare il metodo che calcola già l'area
		double volume = this.calcolaArea() * profondita;				
		return volume;
	}
	
	
//	Metodo toString(), ci fornisce una rappresentazione veloce dell'oggetto in formato String
	
@Override
public String toString() {
	return "RettangoloTest3 [altezza=" + altezza + ", base=" + base + ", nomeFigura=" + nomeFigura + "]";
}

	
	public static void main(String[] args) {
		
		RettangoloTest3 rettangolo = new RettangoloTest3(8.5, 6.4, "rettangolino");
		
//		double area = Math.floor(rettangolo.calcolaArea() * 100)/100;
		
		System.out.println("L'area del " + rettangolo.nomeFigura + " vale: " + rettangolo.calcolaArea());
		
		System.out.println("Il volume vale: " + rettangolo.calcolaVolume(4));
		
//		Posso fare il Syso di rettangolo ottenendo la descrizione presente del toString()
		System.out.println(rettangolo);
		
	}




	
}
