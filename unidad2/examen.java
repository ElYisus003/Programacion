package unidad2;

import java.util.Scanner;

public class examen {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int sueldohr;
		float horas, sueldoTotal;
		
		System.out.println("Ingrese su sueldo por hora");
		sueldohr = tcld.nextInt();
		System.out.println("Ingrese las horas trabajadas");
		horas = tcld.nextFloat();
		
		if(horas>8) {
			sueldoTotal = sueldohr*2*horas;
			System.out.println("El sueldo total es: "+sueldoTotal);
		}
		else if(horas>12) {
			sueldoTotal = sueldohr*3*horas;
			System.out.println("El sueldo total es: "+sueldoTotal);
		}
		else if(horas<8) {
			sueldoTotal = sueldohr*horas;
			System.out.println("El sueldo total es: "+sueldoTotal);
		}
	}

}
