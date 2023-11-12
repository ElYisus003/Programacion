package pdfUnidad3;

import java.util.Scanner;

public class for3 {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int x, n;
		double suma = 0;
		String cadena = "suma";
		
		do {
		System.out.println("Ingresa el valor de x");
		x = tcld.nextInt();
		}while(x<1);
		
		do {
		System.out.println("Ingresa el valor de n");
		n = tcld.nextInt();
		}while(n<1);
		
		
		cadena = "sumatoria("+x+","+n+")=";
		for(int i=1; i<=n; i++) {
			suma = suma + Math.pow(x, i+1);
			cadena += x+"^"+(i+1)+"+";
		}
		
		System.out.println("Función sumatoria: "+cadena);
		System.out.println("La sumatoria final es: "+suma);
		
	}

}
