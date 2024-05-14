package a_eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
 public static void main(String[] args) {
	
	 File f = new File("./test.txt");
	 
	 f.exists();
	 
	 try {
		FileReader fr = new FileReader(f);

	 } catch (FileNotFoundException e) {
		System.out.println("Il file non è stato trovato!");
	}
	 
	 
	 stampaTesto("Ciao");
	 stampaTesto(null);
	 System.out.println("Si pianta qui ? ");
	 
	 stampaTesto2("Dario");
	 stampaTesto2(null);
	 
	 
	try {
		stampaTesto3(null);
	} catch (MieEccezioni e) {
		System.out.println(e.getMessage());
	}
	
	
	System.out.println("Qui eseguo il metodo esegui");
	esegui(null);
	esegui("Dario");
	
	 
}
 
 
 private static void stampaTesto(String testo) {
//	 String tmp = testo.concat("...");
//	 System.out.println(tmp);
	 
	 if(testo != null) {
		 String tmp = testo.concat("...");
		 System.out.println(tmp);
	 }else {
		 System.out.println("Non puoi avere un testo null");
	 }
	 
 }
 
 private static void stampaTesto2(String testo) {
	 try {
		 String tmp = testo.concat("...");
		 System.out.println(tmp);
		 
		 int val = 10; 
		 if(testo != null && testo.length() < val) {
			 System.out.println("Il tuo testo ha meno di " + val + " caratteri");
		 }
	 }
	 catch (IndexOutOfBoundsException e){
		 System.out.println("Siamo nella IOB --- CATCH");
	 }catch (NullPointerException e) {
		 System.out.println("Siamo nella null Pointer Exception");
	 }finally {
//		 il finally viene eseguito SEMPRE al termine di uno dei blocchi sopra
		 System.out.println("Sto eseguendo il finally");
	 }
 }
 
/**
 * con throws vado a demandare la gestione dell'eccezione al metodo che lo eseguirà,
 * in quel metodo sarò obbligato ad utilizzare il try & catch
 * 
 */
 
 public static void stampaTesto3(String testo) throws MieEccezioni{
	 if(testo == null) {
		 throw new MieEccezioni();
	 }else {
		 System.out.println(testo);
	 }
 }

 public static void esegui(String testo) {
	 
	 try {
		stampaTesto3(testo);
	} catch (MieEccezioni e) {
		System.out.println(e.getMessage());
	}finally {
		System.out.println("Alla fine c'è il finally, sempre");
	}
	 
 }
 
}
