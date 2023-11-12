package unidad3;

import java.util.Scanner;

public class doWhileAnidado {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int cal, numAlumnos = 0, numMaterias = 0;
		float promedio = 0;
		
		do {
			numAlumnos++;
			System.out.println("Introduce las calificaciones del alumno "+numAlumnos);
			
			do {
				numMaterias++;
				System.out.println("Calificación de la materia "+numMaterias);
				cal = tcld.nextInt();
				
				promedio = promedio + cal;
				
			}while(numMaterias != 6);
			
			promedio = promedio/numMaterias;
			System.out.println("El promedio del alumno "+numAlumnos+" es: "+promedio);
			System.out.println("=========================================");
			
			numMaterias = 0;
			promedio = 0;
			
		} while(numAlumnos < 3);
		
	}

}
