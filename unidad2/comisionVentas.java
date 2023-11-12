package unidad2;

import java.util.Scanner;

public class comisionVentas {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		float ventas, comision, sueldoTotal;
		int sueldoFijo = 1500;
		
		System.out.println("Ingresa las ventas del empleado");
		ventas = tcld.nextFloat();
		
		if (ventas>5000) {
			comision = (ventas*30)/100;
			sueldoTotal = sueldoFijo + comision;
			
			System.out.println("El agente tiene un sueldo total de: "+sueldoTotal+" con una comisioón del 30%");
		}
		else if (ventas <= 5000 && ventas >= 1000){ 
			comision = (ventas*15)/100; 
			sueldoTotal = sueldoFijo + comision;
			
			System.out.println("El agente tiene un sueldo total de: "+sueldoTotal+" con una comisión del 15%");
			
		}
		else if (ventas<=1000) {
			comision = 0;
			
			System.out.println("El agente tiene un sueldo total de: "+sueldoFijo+" con una comisión del 0%");
		}
		
	}

}
