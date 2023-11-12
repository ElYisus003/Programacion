package pdfUnidad3;

import java.util.Scanner;

public class doWhile1 {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		String res;
		
		do {
			System.out.println("¿Desea continuar? S o N");
			res = tcld.nextLine();
			
		}while(!res.equalsIgnoreCase("N"));
	}

}
