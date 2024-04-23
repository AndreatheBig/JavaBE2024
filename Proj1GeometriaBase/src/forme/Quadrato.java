package forme;

// EREDITARIETA' : con extends eredito prop e metodi della classe genitore
public class Quadrato extends Rettangolo{
//	Il quadrato è un lato ripetuto 4 volte
//	Il quadrato è un rettangolo particolare
	public Segmento lato;


	public Quadrato( Segmento lato) {
//		Utilizzo super per poter richiamre il costruttore della classe dalla quale sto ereditando
		super(lato, lato);
		this.lato = lato;
	}
	


//	Rettangolo mioRettangolo = new Rettangolo(lato, lato);
//	
//	public double getArea() {
//		double area = mioRettangolo.getArea();
//		return area;
//	}

//
//	@Override
//	public String toString() {
//		return "Quadrato [lato=" + lato + "] - Area: ";
//	}

	
}
