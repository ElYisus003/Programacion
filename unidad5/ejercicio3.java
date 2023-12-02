package unidad5;

import java.util.Scanner;

public class ejercicio3 {
	
	public static void triangulo(String letra, int anchura) {
		
		for(int a=anchura; a>0; a--) {
			for(int b=0; b<a; b++) {
				System.out.print(letra);
			}
			System.out.println();
		}
	}
	
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		String letra;
		int anchura;
		
		System.out.print("Ingresa una letra o simbolo con la que se hará el triángulo: ");
		letra = tcld.nextLine();
		System.out.print("Ingresa la anchura inicial del triángulo: ");
		anchura = tcld.nextInt();
		
		System.out.println();
		triangulo(letra, anchura);
	}

}
