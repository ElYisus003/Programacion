package unidad4;

public class diagonalPrincipal {
	public static void main(String []args) {
		//Programa que muestre una matriz de 20x20 con diagonal principal en 1.
		//Las otras posiciones 0
		
		int matriz[][] = new int[20][20];
		
		for(int r=0; r<20; r++) {
			for(int c=0; c<20; c++) {
				if(r==c) matriz[r][c] = 1;
				else matriz[r][c] = 0;
			}
		}
		
		for(int r=0; r<20; r++) {
			for(int c=0; c<20; c++) {
				System.out.print(matriz[r][c]+" | ");
			}
			System.out.println();
		}
	}

}
