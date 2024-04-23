package forme;

public class Triangolo {
	
	public Punto a,b,c;
	public Segmento ab, bc, ca;
	
//	Adesso definisco il costruttore del triangolo partendo solo dai 3 punti
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;

//		Definisco dentro il costuttore i segmenti
		this.ab = new Segmento(a, b);
		this.bc = new Segmento(b, c);
		this.ca = new Segmento(c, a);
	}
	
	
	public double getPerimetro() {
		double perimetro = this.ab.lunghezza + this.bc.lunghezza + this.ca.lunghezza;
		return perimetro;
	}

	public double getArea() {
//		sp = semiperimetro
		double sp = getPerimetro()/2;
		
		double area = Math.sqrt(sp * (sp-this.ab.calcolaLungSegmento()) * (sp-this.bc.calcolaLungSegmento()) * (sp-this.ca.calcolaLungSegmento()));	
		
		return area;
	}
	

}
