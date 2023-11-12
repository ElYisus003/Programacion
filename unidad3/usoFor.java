package unidad3;

import java.util.Scanner;

public class usoFor {
	public static void main(String []args) {
		 //Leer 10 estaturas y sacar el promedio
		
		Scanner tcld = new Scanner(System.in);
		float estatura, promedio, suma = 0;
		
		for(int i=1; i != 10; i++) {
			System.out.println("Introduce la estatura número: "+i);
			estatura = tcld.nextFloat();
			
			suma += estatura;
		}
		
		promedio = suma/10;
		
		System.out.println("El promedio de las estaturas es: "+promedio);
		
	}

}
