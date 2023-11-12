package unidad4;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int A[] = new int[20];
		int B[] = new int [20];
		int C[] = new int[40];
		int contA = 0, contB = 0, contC = 0;
		
		for(int i=0; i<20; i++) {
			System.out.print("Ingresa el valor del número "+(i+1)+" para el vector A: ");
			A[i] = tcld.nextInt();
		}
		
		System.out.println();
		
		for(int i=0; i<20; i++) {
			System.out.print("Ingresa el valor del número "+(i+1)+" para el vector B: ");
			B[i] = tcld.nextInt();
		}
		
		while(contA<20 && contB<20) {
			if(A[contA] < B[contB]) {
				C[contA + contB] = A[contA];
				contA++;
			}
			else {
				C[contA + contB] = B[contB];
				contB++;
			}
			
		}
		
		while(contA < 20) {
			C[contA + contB] = A[contA];
			contA++;
		}
		
		while(contB < 20) {
			C[contA + contB] = B[contB];
			contB++;
		}
		
		System.out.println();
		
		System.out.println("A: ");
		for(int i=0; i<20; i++) {
			System.out.print(" | "+A[i]);
		}
		
		System.out.println();
		System.out.println("B: ");
		for(int i=0; i<20; i++) {
			System.out.print(" | "+B[i]);
		}
		
		System.out.println();
		System.out.println("C: ");
		for(int i=0; i<40; i++) {
			System.out.print(" | "+C[i]);
		}
	}

}
