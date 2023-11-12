package unidad4;

import java.util.Scanner;

public class sumaRenglonesDeMatriz {
	public static void main(String []args) {
		Scanner ChalinoSanchez = new Scanner(System.in);
		int matriz[][] = new int[5][3];
		int vector[] = new int[5];
		int suma;
		
		//Leer valores y guardarlos en la matriz
		for(int r=0; r<5; r++) {
			for(int c=0; c<3; c++) {
				System.out.print("Introduce número "+r+", "+c+": ");
				matriz[r][c] = ChalinoSanchez.nextInt();
			}
		}
		
		//Sumar renglones
		for(int r=0; r<5; r++) {
			suma = 0;
			for(int c=0; c<3; c++) {
				suma += matriz[r][c];
			}
			vector[r] = suma;
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
		for(int i=0; i<5; i++) System.out.print(vector[i]+" | ");
	}

}
