package c_array;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
	
		//Gli array sono contenitori di elementi simili tra loro( tipo identico valore diverso). Sono 0-based
		String[] studenti = new String[12];
		
		studenti[0] = "Simone";
		studenti[1] = "Andrea";
		studenti[2] = "Fabio";
		studenti[3] = "Raffaele";
		studenti[4] = "Lannuce";
		studenti[5] = "Marco";
		studenti[6] = "Denis";
		studenti[7] = "Enrico";
		studenti[8] = "Davide";
		studenti[9] = "Giada";
		studenti[10] = "Abderrahim";
		studenti[11] = "Erika";
		
//		Richiamo un valore attraverso il suo indice
		System.out.println(studenti[0]);

//		Stampo la propr length
		System.out.println("Num studenti in aula " + studenti.length);

//		posso riassegnare un valore
		studenti[0] = "Simo";
		System.out.println(studenti[0]);

//		Leggo l'array di studenti
	
		for(int i = 0; i < studenti.length; i++) {
			System.out.println(studenti[i]);
		}
		
		
		int[] voti = new int[12];
		
//		Utilizzo un for per riempire un array
		
		for(int i = 0; i < voti.length ; i++) {
			
			//voto minimo 18 e massimo 30
			double votoCasuale = (Math.ceil(Math.random() * 13) + 17);
			
			voti[i] = (int) votoCasuale;	
		}
		
		
		for(int i = 0; i < studenti.length; i++) {
			System.out.println(studenti[i] + " voto: " + voti[i]);
		}
		
		
		///////////////MATRICE//////////////
								//riga colonna
		int[][] matrice = new int[5][6];
		
		int contatore = 1;
		
		System.out.println(matrice.length); //riga
		System.out.println(matrice[0].length); //colonna
		
		for(int i = 0; i < matrice.length; i++) {
			for(int j = 0; j < matrice[i].length; j++) {
				matrice[i][j] = contatore;
				contatore++;
			}
		}
		
		System.out.println("STAMPO LA MATRICE");
		
		for(int i = 0; i < matrice.length; i++) {
			for(int j = 0; j < matrice[i].length; j++) {
				System.out.print(matrice[i][j] + "	");
			}
			System.out.println();
		}
		
//		Ordinare un array
		String[] parole = {"Ciao", "Come", "Stai", "Tutto", "Bene", "Grazie", "Arrivederci"};
		
		Arrays.sort(parole);
		
		for(int i = 0; i < parole.length; i++) {
			System.out.println(parole[i]);
		}
		
	}

}
