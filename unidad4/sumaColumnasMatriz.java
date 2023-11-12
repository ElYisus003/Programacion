package unidad4;

import java.util.Scanner;

public class sumaColumnasMatriz {
	public static void main(String []args) {
		Scanner AurelioCasillas = new Scanner(System.in);
		int matriz[][] = new int[5][3];
		int vector[] = new int[3];
		int suma;
		
		//Leer valores y guardarlos en la matriz
		for(int r=0; r<5; r++) {
			for(int c=0; c<3; c++) {
				System.out.print("Introduce número "+r+", "+c+": ");
				matriz[r][c] = AurelioCasillas.nextInt();
			}
		}
		
		//Sumar renglones
		for(int c=0; c<3; c++) {
			suma = 0;
			for(int r=0; r<5; r++) {
				suma += matriz[r][c];
			}
			vector[c] = suma;
		}
		
		//Mostrar la matriz
		System.out.println();
		System.out.println("La matriz ingresada es: ");
		for(int r=0; r<5; r++) {
			for(int c=0; c<3; c++) {
				System.out.print(matriz[r][c]+" | ");
			}
			System.out.println();
		}
				
		//Mostrar el vector
		System.out.println();
		System.out.println("La suma es: ");
		for(int i=0; i<3; i++) System.out.print(vector[i]+" | ");
	}
}


