package forme;

public class Segmento {
//	Il segmento è definito a partire da 2 punti
	
//	Punto a;
//	Punto b;

	public Punto a,b ;
	public double lunghezza;

	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
//		OSS: posso richiamare il metodo calcolaLungSegmento() affinché venga valorizzata la prop lunghezza
		calcolaLungSegmento();
	}

	public double calcolaLungSegmento() {

		this.lunghezza = Math.sqrt(Math.pow((b.x - a.x),2) + Math.pow((b.y - a.y),2));		
		return this.lunghezza;
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza=" + lunghezza + "]";
	}
	
	
}
