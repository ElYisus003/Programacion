package unidad2;

import java.util.Scanner;

public class evaluarDosNumeros {
	public static void main(String []args) {
		int numero1, numero2;
		
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Introduce el primer número alv");
	numero1 = teclado.nextInt();
	System.out.println("Introduce el segundo número alv compa");
	numero2 = teclado.nextInt();
	
	if (numero1 == numero2) {
		System.out.println("Los números son iguales");
	}
	else if (numero1 > numero2) {
		System.out.println("El número "+numero1+"Es mayor ");
	}
	
	}

}
