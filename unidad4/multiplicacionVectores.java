package unidad4;

import java.util.Scanner;

public class multiplicacionVectores {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int A[] = new int[20];
		int B[] = new int[20];
		int C[] = new int[20];
		
		for(int i=0; i<20; i++) {
			System.out.print("Ingresa el "+(i+1)+"° número del vector A: ");
			A[i] = tcld.nextInt();
		}
		
		System.out.println();
		
		for(int i=0; i<20; i++) {
			System.out.print("Ingresa el "+(i+1)+"° número del vector A: ");
			B[i] = tcld.nextInt();
		}
		
		for(int i=0; i<20; i++) {
			C[i] = A[i] * B[19-i];
		}
		
		System.out.println("==========================================");
		
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
		for(int i=0; i<20; i++) {
			System.out.print(" | "+C[i]);
		}
	}

}
