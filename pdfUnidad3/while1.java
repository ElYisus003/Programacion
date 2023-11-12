package pdfUnidad3;

import java.util.Scanner;

public class while1 {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int n, serie, contador = 0;
		
		System.out.println("Introduzca un número");
		n = tcld.nextInt();
		
		while(n < 1) {
			System.out.println("Número inválido, introduzca nuevamente le número");
			n = tcld.nextInt();
		}
		
		while (contador != n) {
			
		}
	}

}
