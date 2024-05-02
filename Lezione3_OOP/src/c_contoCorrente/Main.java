package c_contoCorrente;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Creo un nuovo conto");
		
		Conto conto1 = new Conto();
		
		conto1.setIntestatario("Dario Mennillo");
		conto1.setNumConto(1); //da rendere automatico
		conto1.setPinCarta("254785");
		
		System.out.println("Adesso puoi depositare i primi denari.");
		
		conto1.deposita("254785", 1000);
		
		System.out.println("Sul tuo conto ci sono: " + conto1.getSaldo());
		
	}
}
