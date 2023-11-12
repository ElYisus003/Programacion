package unidad3;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int cal, reprobados = 0, aprobados=0, contador = 1;
		float porcentajeApro;
		
		do {
			System.out.println("Proporciona la calificación "+contador);
			cal = tcld.nextInt();
			if(cal>=70) aprobados++;
			else reprobados++;
			
			contador++;
			
		} while(contador != 11);
		
		porcentajeApro = (aprobados*100)/10;
		
		System.out.println("El porcentaje de aprobados es: "+porcentajeApro);
		System.out.println("La cantidad de alumnos aprobados es: "+aprobados);
		System.out.println("La cantidad de alumnos reprobados es: "+reprobados);
		
		
	}

}
