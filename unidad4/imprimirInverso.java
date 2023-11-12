package unidad4;

import java.util.Scanner;

public class imprimirInverso {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int numeros[] = new int[20];
		
		for(int i=0; i<20; i++) {
			System.out.println("Ingresa el valor del número "+(i+1)+":");
			numeros[i] = tcld.nextInt();
		}
		
		for(int i=19; i>=0; i--) {
			System.out.print(" | "+numeros[i]);
		}
	}

}
