package a_interfacceIntro;

public class Main {
	
	public static void main(String[] args) {
		Rettangolo r = new Rettangolo(5.3, 7.1);
		r.calcolaArea();
		r.calcolaPerimetro();
		System.out.println(r.presentaFigura());
		
		Cerchio c = new Cerchio(5);
		c.calcolaArea();
		c.calcolaPerimetro();
		System.out.println(c.presentaFigura());
		
		Quadrato q = new Quadrato(6.4);
		q.calcolaArea();
		q.calcolaPerimetro();
		System.out.println(q.presentaFigura());
		
		Triangolo t = new Triangolo(3, 4, 5);
		t.calcolaArea();
		t.calcolaPerimetro();
		System.out.println(t.presentaFigura());
		
		
	}

	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
