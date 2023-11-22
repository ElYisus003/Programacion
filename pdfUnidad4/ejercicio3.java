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
 * Problema 3:
 *  Escriba un programa con una Matriz (donde N=20) de NxN que llene todas
 *  las filas pares con los números 1,2,3,...N, y las filas impares con
 *  los números N,N-1,N-2,...1.
 */

public class ejercicio3 {
	public static void main(String []args) {
		int Matriz1[][] = new int[20][20];
		int cont = 20;
		
		for(int r=0; r<20; r++) {
			for(int c=0; c<20; c++) {
				if((r+1)%2 == 0) Matriz1[r][c] = c+1;
				else Matriz1[r][c] = cont-c;
			}
		}
		
		for(int r=0; r<20; r++) {
			for(int c=0; c<20; c++) {
				System.out.print(Matriz1[r][c]+"\t");
			}
			System.out.println();
		}
	}

}
