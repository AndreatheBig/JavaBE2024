package OOP_model;

import java.util.Random;

public class Dado {

	int numFacce;
	Random numRand;
	
	
	public Dado(int numFacce) {
		this.numFacce = numFacce;
	}
	
	public int lancia() {
		numRand = new Random();
		
		int faccia = numRand.nextInt(1, this.numFacce + 1);
		
		return faccia;
	}
	
	public int lanciaTruccato() {
		numRand = new Random();
		
		int faccia = numRand.nextInt(3, 6);
		
		return faccia;
	}
	
}
