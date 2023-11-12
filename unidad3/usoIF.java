package unidad3;

import java.util.Scanner;

public class usoIF {
	/*
	 * Leer un número y determinar lo siguiente:
	 * Si el número cumple con la condición de ser impar y múltiplo de 5
	 * Si el número cumple con la condición de ser impar
	 * Si el número cumple con la condición de ser multiplo de 5
	 * Si el número no cumple con ninguna de las condiciones
	 */
	
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un número");
		num = tcld.nextInt();
		
		if (num%2== 1 && num%5==0)
			System.out.println("El núemero "+num+" cumple con la condición de ser impar y multiplo de 5");
		
		else if(num%2!=0)
			System.out.println("El número "+num+" cumple con la condición de ser impar");
		
		else if(num%5==0)
			System.out.println("El número "+num+" cumple con la condición de ser nultiplo de 5");
		
		else 
			System.out.println("El número no cumple con ninguna condición");
	}

}
