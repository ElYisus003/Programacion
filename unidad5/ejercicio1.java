package unidad5;

import java.util.Scanner;

public class ejercicio1 {
	
	public static void tabla(int num) {
		for(int i=1; i<=10; i++) {
			int multiplicacion = num * i;
			System.out.println(num+" * "+i+": "+multiplicacion);
		}
	}
	
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int num;
		
		System.out.println("Ingresa un número");
		num = tcld.nextInt();
		System.out.println();
		tabla(num);
	}
}
