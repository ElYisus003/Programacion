package unidad2;

import java.util.Scanner;

public class areaVolumenCilindro {
	public static void main(String []args) {
		Scanner leer = new Scanner(System.in);
		float r, h, area, volumen;
		
		System.out.println("Introduce la altura del cilindro");
		h = leer.nextFloat();
		System.out.println("Introduce el radio del cilindro");
		r =leer.nextFloat();
		
		volumen = (float) (Math.PI*(Math.pow(r, 2)));
		area = (float) ((2*Math.PI)+((2*Math.PI)*Math.pow(r, 2)));
		
		System.out.println("El cálculo del volumen es: "+volumen);
		System.out.println("el cálculo del área es: "+area);
	}

}
