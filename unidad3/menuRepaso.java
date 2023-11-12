package unidad3;

import java.util.Scanner;

public class menuRepaso {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int opcion = 0, num = 0, num2, primo = 0, suma = 0;
		
		do {
			
			System.out.println("================================");
			System.out.println("| [1] Suma números             |");
			System.out.println("| [2] Números impares          |");
			System.out.println("| [3] Evaluar número primo     |");
			System.out.println("| [4] Estadística habitantes   |");
			System.out.println("| [5] Salir                    |");
			System.out.println("================================");
			
			opcion = tcld.nextInt();
			
			switch (opcion) {
			
			case 1:
				while(num >= 0) {
					suma += num;	
					
					System.out.println("Ingrese un número");
					num = tcld.nextInt();
					}
				
				System.out.println("La suma de los números positivos es: "+suma);
				break;
				
			case 2:
				System.out.println("Ingresa el primer número");
				num = tcld.nextInt();
				
				do {
					
				System.out.println("Ingresa el segundo número");
				num2 = tcld.nextInt();
				
				if(num > num2) {
					System.out.println("El segundo número debe de ser mayor al primer número, ingresalo de nuevo");
					num2 = tcld.nextInt();
				}
				}while(num > num2);
				
				if(num % 2 == 1) {
					primo = num;
					System.out.println(primo);
				}
				else {
					primo = num+1;
					System.out.println(primo);
				}
				
				do {
					primo += 2;
					
					System.out.println(primo);
					
				}while(primo < (num2-1));
				break;
				
			case 3:
				System.out.println("Ingresa un número");
				num = tcld.nextInt();
				
				
				
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
			default:
				break;
				
			}
			
		}while(opcion != 5);
	}

}
