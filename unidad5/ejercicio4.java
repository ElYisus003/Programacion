package unidad5;

import java.util.Scanner;

public class ejercicio4 {
	
	public static float volumen(float lado) {
		float volumen = (float) (Math.pow(lado, 3));
		return volumen;
	}
	
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		float lado;
		
		System.out.print("Introduce el valor del lado del cubo: ");
		lado = tcld.nextFloat();
		
		System.out.println();
		System.out.println("El volumen del cubo es: "+volumen(lado));
	}

}
