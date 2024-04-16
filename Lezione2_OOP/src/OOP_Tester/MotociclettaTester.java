package OOP_Tester;

import OOP_model.Motocicletta;

public class MotociclettaTester {
 public static void main(String[] args) {
//	 ATT ATT: per poter utilizzare il costuttore di default, essendo in presenza di un costruttore con parametri, devo OBBLIGATORIAMENTE dichiararlo nel model
//	Motocicletta moto1 = new Motocicletta();
	 
	 Motocicletta moto1 = new Motocicletta("Z750", 750);
	 Motocicletta moto2 = new Motocicletta("Ninja", 1000);
	 Motocicletta moto3 = new Motocicletta("Z800", 799);
	 
//	 ATT: la classe Motocicletta ha delle prop senza modificatore d'accesso (default). Con il modificatore di default le prop sono accessibili solo all'interno dello stesso package
	 
//	 ATT: il metodo toString() e il cotruttore é un metodo public, quindi visibile in tutto il progetto, anche tra package differenti
	 System.out.println(moto1.toString());
	 
	 System.out.println(moto2.toString());
	 System.out.println(moto3.toString());
	 
}
}
