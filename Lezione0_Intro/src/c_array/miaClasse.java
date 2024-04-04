package c_array;

import java.util.ArrayList;

public class miaClasse {
	public static void main(String[] args) {
		
	ArrayList<String> studenti = new ArrayList<String>();
	
	studenti.add("Marco");
	studenti.add("Laura");
	studenti.add("Antonio");
	studenti.add("Genny");
	
	for(int i = 0; i < studenti.size(); i++) {
		System.out.println(studenti.get(i));
	}
	}
}
