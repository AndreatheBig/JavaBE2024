package OOP_Tester;

import java.util.Scanner;

import OOP_model.Bicicletta;

public class BiciclettaTester {
	public static void main(String[] args) {
		Bicicletta bici1 = new Bicicletta("Cannondale", "c-bike", (byte)2, 21);
		bici1.accelera(200);
		bici1.accelera(100);
		bici1.rallenta(60);
		bici1.calcolaVelocitaMax();
		System.out.println(bici1.toString());
		
		
		System.out.println("ALTRA BICICLETTA");
		
		Bicicletta bici2 = new Bicicletta("Bianchi", "Bartali", (byte) 2, 10);
		bici2.accelera(800);
		bici2.calcolaVelocitaMax();
		System.out.println(bici2.toString());
		
		String miaMarca;
		String mioModello;
		
		Scanner sc = new Scanner(System.in);
		miaMarca = sc.nextLine();
		mioModello = sc.nextLine();
		
		Bicicletta bici3 = new Bicicletta(mioModello, miaMarca, (byte)3, 1);
		System.out.println(bici3.toString());
	}
}
