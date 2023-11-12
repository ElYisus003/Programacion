package unidad4;

import java.util.Scanner;

public class usoMatrizUnidimensional {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		//Declaración de matrices
		float estaturas[] = new float[5];
		int calificaciones[] = new int[20];
		String nombres[] = {"Jesus", "Diego", "Javier", "Pedro", "Luis", "Miguel"};
		
		//Asignar valores a los arreglos
		estaturas[0] = 1.69F;
		estaturas[1] = 1.70F;
		estaturas[2] = 2.00F;
		estaturas[3] = 1.50F;
		estaturas[4] = 1.59F;
		
		//Solicitar calificaciones del teclado
		for(int i=0; i<20; i++) {
			System.out.println("Introduce la calificación "+i);
			calificaciones[i] = tcld.nextInt();
		}
		
		//Mostrar la información de cada arreglo
		System.out.println("ARREGLO DE ESTATURAS");
		for(int i=0; i<5; i++) {
			System.out.println(estaturas[i]);
		}
		
		System.out.println("ARREGLO DE NOMBRES");
		for(int i=0; i<6; i++) {
			System.out.println(nombres[i]);
		}
		
		System.out.println("ARREGLO DE CALIFICACIONES");
		for(int i=0; i<20; i++) {
			System.out.println(calificaciones[i]);
		}
		
	}

}
