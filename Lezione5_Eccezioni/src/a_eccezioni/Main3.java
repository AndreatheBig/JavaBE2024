package a_eccezioni;

public class Main3 {
	
	public static void main(String[] args){
		try {
			try {
				dividi(5,10);
			} catch (MieEccezioni e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}catch (Exception e) {
			System.out.println("Non puoi dividere per 0");
		}finally {
			System.out.println("Adesso il programma continua");
		}
	}
	
	public static void dividi(double a, double b) throws ArithmeticException, MieEccezioni {
		if( b == 0 ) {
			throw new ArithmeticException();
		}else if( b == 10) {
			throw new MieEccezioni();
		}
		else {
			double risultato = a / b;
			System.out.println(risultato);
		}
	}

	

}
