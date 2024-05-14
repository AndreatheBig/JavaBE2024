package a_eccezioni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
public static void main(String[] args){
	
	int mioArr[] =  {2,32,1,5,8,9};
	
	System.out.println("Quante posizioni vuoi leggere ? ");
	Scanner sc = new Scanner(System.in);
	int posizioni = 0;
	
	try {
		posizioni = sc.nextInt();
	}catch (InputMismatchException ime) {
		System.out.println("Non mi hai fornito un numero");
	}
	
	try {
		for(int i = 0; i < posizioni; i++) {
			System.out.println(mioArr[i] + " ");
		}
	}catch(IndexOutOfBoundsException iob) {
		System.out.println("Stai sforando l'array");
	}
	
}
}
