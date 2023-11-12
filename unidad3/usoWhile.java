package unidad3;

import java.util.Scanner;

public class usoWhile {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int contador = 0, incrementos = 1, veces;
		
		System.out.println("Introduce el número de veces que se repita el ciclo");
		veces = tcld.nextInt();
		
		while (contador != veces) {
			contador++;
			incrementos *= contador;
			System.out.println("La variable incrementos tiene un valor de: "+incrementos);
			System.out.println("Vamos en la vuelta número: "+contador);
		}
	}

}
