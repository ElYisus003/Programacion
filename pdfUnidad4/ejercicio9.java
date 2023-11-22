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
 * Problema 9:
 *  Diseñe un programa donde declare e inicialice una matriz de 10x5.
 *  Sume cada una de los renglones de la matriz y guarde dichas sumas en un vector; 
 *  posteriormente determine si todas las sumas de los renglones son iguales o no.
 */

public class ejercicio9 {
	public static void main(String []args) {
		boolean comparador = true;
		int suma;
		int vector[] = new int[10];
		int Matriz1[][] = {{1, 23, 45, 7, 89},
						   {1, 23, 45, 7, 89},
						   {1, 23, 45, 7, 89},
						   {1, 23, 45, 7, 89},
						   {1, 23, 45, 7, 89},
						   {1, 23, 45, 7, 89},
						   {1, 23, 45, 7, 89},
						   {1, 23, 45, 7, 89},
						   {1, 23, 45, 7, 89},
						   {1, 23, 45, 7, 88}};
				  
		for(int r=0; r<10; r++) {
			suma = 0;
			for(int c=0; c<5; c++) {
				suma += Matriz1[r][c];
			}
			vector[r] = suma;
		}
		
		for(int i=9; i>0; i--) {
			
			if(vector[i] == vector[i-1]) {
				comparador = true;
			}
			else {
				System.out.println("Las sumas de los renglones son diferentes");
				comparador = false;
				break;
			}
		}
		
		if(comparador == true) System.out.println("Las sumas de los renglones son iguales");
	}

}
