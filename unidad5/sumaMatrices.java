package unidad5;

import java.util.Scanner;

public class sumaMatrices {
	
	static Scanner tcld = new Scanner(System.in);
	
	public static void leerMatriz(int r, int c, int matriz[][]) {
		
		for(int ren=0; ren<r; ren++) {
			for(int col=0; col<c; col++) {
				System.out.print("Introduce el elemento "+ren+", "+col+": ");
				matriz[ren][col] = tcld.nextInt();
			}
		}
	}
	
	public static void sumarMatrices(int r, int c, int M1[][], int M2[][], int M3[][]) {
		
		for(int ren=0; ren<r; ren++) {
			for(int col=0; col<c; col++) {
				M3[ren][col] = M1[ren][col] + M2[ren][col];
			}
		}
	}
	
	public static void imprimirMatrices(int r, int c, int matriz[][]) {
		for(int ren=0; ren<r; ren++) {
			for(int col=0; col<c; col++) {
				System.out.print(matriz[ren][col]+" | ");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args) {
		int r1=0, r2=0, c1=0, c2=0, opcion;
		int matrizA[][]=null, matrizB[][]=null, matrizC[][]=null;
		
		do {
			
			System.out.println("============================");
			System.out.println("| [1] Leer matrices        |");
			System.out.println("| [2] Sumar matrices       |");
			System.out.println("| [3] Imprimir matrices    |");
			System.out.println("| [4] Salir                |");
			System.out.println("============================");
			opcion = tcld.nextInt();
			
			
			switch(opcion) {
			
			case 1:
				System.out.print("Introduce el número de renglones de la matriz A: ");
				r1 = tcld.nextInt();
				System.out.print("Introduce el número de columnas de la matriz A: ");
				c1 = tcld.nextInt();
				System.out.print("Introduce el número de renglones de la matriz B: ");
				r2 = tcld.nextInt();
				System.out.print("Introduce el número de columnas de la matriz B: ");
				c2 = tcld.nextInt();
				
				if(r1 == r2 && c1 == c2) {
					matrizA = new int[r1][c1];
					matrizB = new int[r2][c2];
					matrizC = new int[r2][c2];
					
					System.out.println("VALORES PARA LA MATRIZ A");
					leerMatriz(r1, c1, matrizA);
					System.out.println("VALORES PARA LA MATRIZ B");
					leerMatriz(r2, c2, matrizB);
				}
				else System.out.println("ERROR: Dimensiones diferentes");
				
				break;
				
			case 2:
				if(matrizA == null && matrizB == null) {
					System.out.println("ERROR: Es necesario leer las matrices primero");
					break;
				}
				
				sumarMatrices(r1, r2, matrizA, matrizB, matrizC);
				break;
				
			case 3:
				System.out.println("MATRIZ A");
				imprimirMatrices(r1, c1, matrizA);
				System.out.println("MATRIZ B");
				imprimirMatrices(r2, c2, matrizB);
				System.out.println("MATRIZ C");
				imprimirMatrices(r1, c1, matrizC);

				break;
				
			default:
				System.out.println("Opción inválida, intentelo de nuevo");
				break;
			}
			
		}while(opcion != 4);
	}

}
