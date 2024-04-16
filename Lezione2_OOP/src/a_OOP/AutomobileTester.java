package a_OOP;

import OOP_model.Motocicletta;

public class AutomobileTester {

	public static void main(String[] args) {
//		Qui dentro creo tutte le automobili che voglio, andando ad utilizzare uno dei tanti metodi costruttori
		
//		Utilizzo il costruttore di default
		Automobile auto1 = new Automobile();
		System.out.println(auto1.marca);
		System.out.println(auto1.cilindrata); //0
		auto1.cilindrata = 1200;
		System.out.println(auto1.cilindrata);
		
//		Utilizzo il costruttore con marca modello e cilindrata
//		Con questo costruttore sovrascrivo la propr marca
		Automobile auto2 = new Automobile("Opel", "Astra", 1600);
		System.out.println(auto2.marca);
		
		Automobile auto3 = new Automobile("Peugeot", "2008", 1200, (byte) 2, false);

		System.out.println(auto3.toString());
		
		
				
	}
}
