package pdfUnidad4;

/*
 * @author Jesús Gómez Romero
 * 
 * Team:
 *  Jesús Gómez Romero
 *  Diego Jesús Muñoz Andrade
 *  
 * Instituto Tecnológico de La Piedad
 * Fecha: 13/11/20203
 * 
 * Problema 1:
 *  Suponga que se ha definido una constante positiva entera N y una matriz Matriz1,
 *  de dimensión NxN. Escriba un programa que ponga cero en ambas diagonales de la matriz.
 */

public class ejercicio1 {
	public static void main(String []args) {
		int Matriz1 [][] = new int[10][10];
		
		for(int r=0; r<10; r++) {
			for(int c=0; c<10; c++) {
				if(r==c) Matriz1[r][c] = 1;
				else Matriz1[r][c] = 0;
			}
		}
		
		for(int r=9; r>=0; r--) {
			Matriz1[r][(9-r)] = 1;
		}
		
		for(int r=0; r<10; r++) {
			for(int c=0; c<10; c++) {
				System.out.print(Matriz1[r][c]+" | ");
			}
			System.out.println();
		}
	}
}
