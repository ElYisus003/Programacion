package unidad2;

import java.util.Scanner;

public class numeroNegativoImpar {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int numero;
		
		System.out.println("Proporciona un número");
		numero = tcld.nextInt();
		
		if (numero<0 && numero%2<0){
			System.out.println("El número: "+numero+" cumple con ser negativo e impar");
		}
		else {
			System.out.println("El número: "+numero+" no cumple con ser negativo y/o impar");
		}
	}

}
