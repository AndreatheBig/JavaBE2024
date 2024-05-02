package b_Incapsulamento;

public class Main {

	public static void main(String[] args) {
		
		Display d1 = new Display("DispAAA", "a03", "1024 x 1980");
		
		Display d2 = new Display();
		
//		Non posso accedere a prop o metodi dichiarati private
		
//		System.out.println("La marca del mio Display è: " + d1.marca);
//		System.out.println("La marca del mio Display è: " + d1.modello);
//		System.out.println("La marca del mio Display è: " + d1.risoluzione);
//		
//		d2.marca = "DispBBB";

//		Leggo le prop di d1, andando a richiamare i metodi get
		System.out.println("Display 1: " + d1.getMarca("Pipp0") + " " + d1.getModello() + " " + d1.getRisoluzione());
		
//		Nel caso di d2 vado a settare le prop avendo usato un costruttore di default
		d2.setMarca("DispBBB");
		d2.setModello("abc3");
		d2.setRisoluzione("600 x 600");
		
		System.out.println("Display 2: "+ d2.getMarca("Pipp0") + " " + d2.getModello() + " " + d2.getRisoluzione());
		
		
//		Creo un tablet
		Tablet tab1 = new Tablet();
		
		tab1.setMarca("Samsung");
		tab1.setModello("S10");
		tab1.setImeiSerial("qwertyu234567");
		tab1.setDisplay(d2);
		
		System.out.println(tab1.toString());
		
	}
}
