package unidad5;

import java.util.Scanner;

public class calcularTemperatura {
	
	static Scanner tcld = new Scanner(System.in);
	
	public static void leerTemperaturas(String dias[], String ciudades[], int temperaturas[][]) {
		
		for(int r=0; r<7; r++) {
			System.out.println("TEMPERATURAS DE: "+ciudades[r]);
			for(int c=0; c<5; c++) {
				System.out.print("Proporciona la temperatura del día "+dias[c]+": ");
				temperaturas[r][c] = tcld.nextInt();
			}
			System.out.println();
		}
	}
	
	public static void promedioTemperaturas(int temperaturas[][], String dias[]) {
		
		for(int c=0; c<5; c++) {
			int suma = 0;
			for(int r=0; r<7; r++) {
				suma += temperaturas[r][c];
			}
			
			System.out.println("Promedio de temperatura del día "+dias[c]+": ");
			
		}
	}
	
	
	public static void main(String []args) {
		int temperaturas[][] = new int[7][5];
		String dias[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
		String ciudades[] = {"La Piedad", "Zamora", "León", "Guadalajara",
							 "Yurécuaro", "Zináparo", "Ecuandureo"};
		
		//PEDIR TEMPERATURAS
		leerTemperaturas(dias, ciudades, temperaturas);
		
		//OBTENER EL PROMEDIO TE TEMPERATURAS POR DIAS E IMPRIMIRLO
		
		//CALCULAR CUAL CIUDAD TIENE LA TEMPERATURA MÁS BAJA Y MÁS ALTA DE TODA LA SEMANA
		
		//CIUDADES CON TEMPERATURAS MÁS BAJAS QUE EL PROMEDIO
		
		//DÍAS CON TEMPERATURAS MÁS ALTAS QUE EL PROMEDIO
	}

}