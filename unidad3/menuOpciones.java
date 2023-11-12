package unidad3;

import java.util.Scanner;

public class menuOpciones {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int opcion, numero, factorial = 1, potencia, exponente;
		
		System.out.println("================================");
		System.out.println("| [1] Calcular factorial       |");
		System.out.println("| [2] Calcular potencia        |");
		System.out.println("| [3] Calcular tabla del 7     |");
		System.out.println("| [4] Terminar                 |");
		System.out.println("================================");
		opcion = tcld.nextInt();
		
		do {
		switch (opcion) {
		
		case 1:
			System.out.println("Introduce el número para calcular el factorial");
			numero = tcld.nextInt();
			
			for(int i=1; i<=numero; i++) factorial *= i;
			
			System.out.println("El factorial de "+numero+" es:"+factorial);
			break;
			
		case 2:
			System.out.println("Introduce la base");
			numero = tcld.nextInt();
			System.out.println("Inroduce el exponente");
			exponente = tcld.nextInt();
			
			potencia =(int) (Math.pow(numero, exponente));
			
			System.out.println("La potencia es: "+potencia);
			break;
			
		case 3:
			for(int i=1; i<=10; i++) {
				int multiplicacion = 7 * i;
				System.out.println("7*"+i+": "+multiplicacion);
			}
			break;
		
		case 4:
			break;
			
		default:
			System.out.println("Opción inválida, introducela nuevamente");
			opcion = tcld.nextInt();
			break;
		}
		}while(opcion != 4);
	}

}
