package forme;

// EREDITARIETA' : con extends eredito prop e metodi della classe genitore
public class Quadrato extends Rettangolo{
	
	public Segmento lato;

	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.lato = lato;
	}


	
// Avendo usato la parola chiave extends non ho bisogno di sviluppare i metodi per il calcolo dell'are ae del perimetro. Nel momento in cui istanzierò un quadrato avrò già a disposizione il metodo getArea() e getPerimetro() ereditati dal Rettangolo
	
	
	
////	Mi servono dei metodi per calcolare area e perimetro
//	public double calcolaArea() {
//		Rettangolo rettangolo = new Rettangolo(lato, lato);
//		double area = rettangolo.getArea();
//				
////		double area = this.lato.lunghezza * this.lato.lunghezza;
//		return area;
//	}
//	
//	public double calcolaPerimetro() {
//		double perimetro = this.lato.lunghezza * 4;
//		return perimetro;
//	}
//	
	
	
	
	
	
}