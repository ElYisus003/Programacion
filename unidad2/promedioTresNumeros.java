package unidad2;

import java.util.Scanner;

public class promedioTresNumeros {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int num1, num2, num3;
		float prom;
		
		System.out.println("Proporciona el primer número");
		num1 = tcld.nextInt();
		System.out.println("Proporciona el segundo número");
		num2 = tcld.nextInt();
		System.out.println("Proporciona el tercera número");
		num3 = tcld.nextInt();
		
		prom = (num1+num2+num3)/3;
		
		if (num1 > prom) {
			System.out.println("El número: "+num1+" es mayor al promedio que es: "+prom);
		}
		else if(num2 > prom) {
			System.out.println("El número: "+num2+" es mayor al promedio que es: "+prom);
		}
		else {
			System.out.println("El número: "+num3+" es mayor al promedio que es: "+prom);
		}
		
	}

}
