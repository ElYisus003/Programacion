package unidad2;

import java.util.Scanner;

public class ecuacionCuadratica {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		float x1, x2, preraiz;
		int a, b, c;
		
		do {
		System.out.println("Propociona el valor de a");
		a = tcld.nextInt();
		
		if (a == 0) {
			System.out.println("El valor de A no puede ser igual a cero");
		}
		} while(a == 0);
		
		System.out.println("Propociona el valor de b");
		b = tcld.nextInt();
		System.out.println("Propociona el valor de c");
		c = tcld.nextInt();
		
		preraiz = (float) (Math.pow(b, 2)-(4*a*c));
		
		if (preraiz < 0) {
			System.out.println("No se puede hacer raíz cuadrada a un número negativo");
		}
		else {
			x1 = (float) ((-(b)+(Math.sqrt(preraiz)))/(2*a));
			x2 = (float) ((-(b)-(Math.sqrt(preraiz)))/(2*a));
			
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
		}
	}

}
