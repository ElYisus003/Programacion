package unidad5;

import java.util.Scanner;

public class cuentaBanco {
	
	static double saldoCuenta;
	
	public static void depositar(double cantidad) {
		saldoCuenta += cantidad;
	}
	
	public static String retirar(double cantidad) {
		String cadena;
		if (cantidad > saldoCuenta) cadena = "Saldo insuficiente";
		else {
			saldoCuenta -= cantidad;
			cadena = "Operación exitosa";
		}
		return cadena;
	}
	
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		double cantidad;
		int opcion;
		
		do {
			
			System.out.println("============================");
			System.out.println("| [1] Depositar            |");
			System.out.println("| [2] Retirar              |");
			System.out.println("| [3] Consultar saldo      |");
			System.out.println("| [4] Terminar             |");
			System.out.println("============================");
			opcion = tcld.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.print("Introduce cantidad a depositar: ");
				cantidad = tcld.nextDouble();
				depositar(cantidad);
				System.out.println("Operación exitosa");
				break;
				
			case 2:
				System.out.print("Introduce la cantidad a retirar: ");
				cantidad = tcld.nextDouble();
				System.out.println(retirar(cantidad));
				break;
				
			case 3:
				System.out.println("El saldo disponible es de: $"+saldoCuenta);
				break;
				
			case 4:
				break;
				
			default:
				System.out.println("Opción inválida, inténtelo de nuevo");
			}
			
		}while(opcion != 4);
		
	}

}
