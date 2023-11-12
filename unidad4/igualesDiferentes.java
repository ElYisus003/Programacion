package unidad4;

import java.util.Scanner;

public class igualesDiferentes {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int M[] = new int[20];
		int N[] = new int[20];
		
		for(int i=0; i<20; i++) {
			System.out.print("Ingrese el valor del número "+(i+1)+"  para el arreglo M: ");
			M[i] = tcld.nextInt();
		}
		
		System.out.println();
		
		for(int i=0; i<20; i++) {
			System.out.print("Ingrese el valor del número "+(i+1)+"  para el arreglo N: ");
			N[i] = tcld.nextInt();
		}
		
			for(int i=0; i<20; i++) {
				
				if(M[i] == N[i]) {
					System.out.println();
					System.out.println("Los arreglos son iguales");
					break;
				}
				
				else {
					System.out.println();
					System.out.println("Los arreglos son diferentes");
					break;
				}
			}
	}

}
