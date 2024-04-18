package OOP_Tester;

import java.util.ArrayList;
import java.util.Scanner;

import OOP_model.Dado;

public class DadoTester {
	
	public static void calcolaRisultato(int lancio6, int lancio12, int lancio20) {
		System.out.println("Hai eseguito i seguenti lanci: "+ lancio6 + " - " + lancio12 + " - " + lancio20);
		
		ArrayList<Integer> lanci = new ArrayList<>();
		lanci.add(lancio6);
		lanci.add(lancio12);
		lanci.add(lancio20);
		
		int risultato = 0;
		
		int somma = lancio6 +  lancio12 + lancio20;
		
		if(somma > 26) {
			risultato += 10; // risultato = risultato + 10
		}
		
		for (Integer lancioSingolo : lanci) {
			if(lancioSingolo % 2 == 0) {
				risultato += 6;
			}
		}
		
		System.out.println("Hai totalizzato " + risultato + " punti");
	}
	
	
	public static int calcolaSuperLucky(int lancio6, int lancio12, int lancio20){
		System.out.println("Hai eseguito i seguenti lanci: "+ lancio6 + " - " + lancio12 + " - " + lancio20);
		int risultato = 0;
		if(lancio6 == lancio12 && lancio12 == lancio20) {
			risultato += 100;
		}
		
//		System.out.println("Hai totalizzato " + risultato + " punti");
		return risultato;
	}
	
	private static int calcolaImbroglio(int lancio6, int lancio12, int lancio20) {
//		Da dentro questo metodo chiamo un altro metodo
		System.out.println("Hai scoperto la modalità per imbrogliare");
		int risultato = 0;
		risultato = calcolaSuperLucky(lancio6, lancio12, lancio20);
		return risultato;
	}

	
	public static void main(String[] args) {
		
//		Costruisco il set di Dadi (6, 12, 20)
		Dado dado6 = new Dado(6);
		Dado dado12 = new Dado(12);
		Dado dado20 = new Dado(20);
	
		
		System.out.println("Gioco dei 3 dadi");
		
		boolean condizioneUscita = true;
		
		while(condizioneUscita) {
			System.out.println("Inserisci un comando: L per lanciare; SL per la modalità SUperLucky; 0 per chiudere");
			
			Scanner sc = new Scanner(System.in);
			
			String comando = sc.nextLine();
			int lancio6 = dado6.lancia();
			int lancio12 = dado12.lancia();
			int lancio20 = dado20.lancia();
			int risultatoFinale = 0;
			
			switch(comando) {
				case "L":				
					calcolaRisultato(lancio6, lancio12, lancio20);
					
					break;
				
//				Modalità SuperLucky
				case "SL":
					risultatoFinale = calcolaSuperLucky(lancio6, lancio12, lancio20);
					System.out.println("Hai totalizzato " + risultatoFinale + " punti");
					break;
					
//				Modalità Imbroglio
				case "pippo":
//					Trucco i dadi direttamente nella classe
					int lancio1T = dado6.lanciaTruccato();
					int lancio2T = dado12.lanciaTruccato();
					int lancio3T = dado20.lanciaTruccato();
					
					risultatoFinale = calcolaImbroglio(lancio1T, lancio2T, lancio3T);
//					calcolaSuperLucky(lancio1T, lancio2T, lancio3T);
					System.out.println("Hai totalizzato " + risultatoFinale + " punti");
					break;
				case "0":
					System.out.println("Hai chiuso il giuoco");
					condizioneUscita = false;
					break;
				
				default:
					System.out.println("Non capisco il comando");
					break;
			}
		}
		
		
		
	}


	
	

	

}
