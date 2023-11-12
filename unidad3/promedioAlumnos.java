package unidad3;

//Programa que calcula el promedio de 10 alumnos con 5 calificaciones cada uno.
//Calcular el promedio de cada uno de los alumnos 
//Calcular el promedio general del grupo
//Calcular cuál es el promedio más alto
//Calcular cuál es el promedio más bajo

import java.util.Scanner;

public class promedioAlumnos {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int cal, numAPA = 0, numAPB = 0;
		float promGeneral = 0, promAlumno, suma, promA = 0, promB = 0;
		
		for(int i=1; i<=10; i++) {
			
			suma = 0;
			System.out.println("Introduce las calificaciones del alumno "+i);
			
			for(int c=1; c<=5; c++) {
				System.out.println("Calificación "+c+":");
				cal = tcld.nextInt();
				suma += cal;
			}
			
			promAlumno = suma/5;
			
			if(promAlumno > promA) {
				promA = promAlumno;
				numAPA = i;
			} 
			else if(promAlumno < promA) {
				promB = promAlumno;
				numAPB = i;
			}
			
			
			promGeneral += promAlumno;
			
			System.out.println("El promedio del alumno "+i+" es: "+promAlumno);
			System.out.println("=========================================");
		}
		
		System.out.println("El promedio general del grupo es: "+(promGeneral/10));
		System.out.println("El promedio más alto es del alumno "+numAPA+" con promedio de: "+promA);
		System.out.println("El promedio más baboso es del alumno "+numAPB+" con promedio de: "+promB);
	}

}
