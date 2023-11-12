package unidad2;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		double C, i, cTotal;
		int n;
		
		do {
			System.out.println("Proporcione la cantidad de dinero que se guardará en el banco");
			C = tcld.nextFloat();
		
			if (C<=0) {
				System.out.println("La cantidad de dinero debe de ser mayor que cero");
			}
		} while (C<=0);
		
		System.out.println("Proporcione los años que estará guardado el dinero");
		n = tcld.nextInt();
		
		do {
			
			System.out.println("Proporciona la tasa de interés");
			i = tcld.nextFloat();
			
			if (0>i) {
				System.out.println("La tasa de interés debe de ser mayor que cero");
			}
			else if (i>100) {
				System.out.println("La tasa de interés debe de ser menor que 100");
			}
			
		} while (0>i || i>100);
		
		cTotal = C*Math.pow((1+i/100), n);
		System.out.println("El total es: "+cTotal);
		
	}

}
