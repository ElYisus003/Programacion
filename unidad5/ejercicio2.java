package unidad5;

import java.util.Scanner;

public class ejercicio2 {
	
	public static void ascendente(int num1, int num2, int num3) {
		int ascendente[] = new int[3];
		for(int i=0; i<3; i++) {
			if(num1 > num2 && num1 > num3) {
				ascendente[i] = num1;
				num1 = 0;
			}
			else if(num2 > num1 && num2 > num3) {
				ascendente[i] = num2;
				num2 = 0;
			}
			else {
				ascendente[i] = num3;
				num3 = 0;
			}
		}
		
		for(int i=2; i>=0; i--) {
			System.out.print(ascendente[i]+", ");

		}
	}
	
	public static void descendente(int num1, int num2, int num3) {
		int decendente[] = new int[3];
		for(int i=0; i<3; i++) {
			if(num1 > num2 && num1 > num3) {
				System.out.print(num1+", ");
				decendente[i] = num1;
				num1 = 0;
			}
			else if(num2 > num1 && num2 > num3) {
				System.out.print(num2+", ");
				decendente[i] = num2;
				num2 = 0;
			}
			else {
				System.out.print(num3+", ");
				decendente[i] = num3;
				num3 = 0;
			}
		}
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(decendente[i]+", ");
		}
	}
	
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int opcion, num1, num2, num3;
		
		do {
			
			System.out.println();
			System.out.println("=====================");
			System.out.println("| [1] Ascendente    |");
			System.out.println("| [2] Decendente    |");
			System.out.println("| [3] Salir         |");
			System.out.println("=====================");
			opcion = tcld.nextInt();
			
			System.out.print("Introduzca el valor para el primer número: ");
			num1 = tcld.nextInt();
			System.out.print("Introduzca el valor para el segundo número: ");
			num2 = tcld.nextInt();
			System.out.print("Introduzca el valor para el tercer número: ");
			num3 = tcld.nextInt();
			
			
			switch(opcion) {
			
			case 1:
				ascendente(num1, num2, num3);
				break;
				
			case 2:
				descendente(num1, num2, num3);
				break;
				
			case 3:
				break;
				
			default:
				System.out.println("Opción inválida, inténtelo de nuevo");
			}
			
		}while(opcion != 3);
	}

}
