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
			int promedio = suma / 5;
			System.out.println("Promedio de temperatura del día "+dias[c]+": "+promedio);
		}
	}

	public static void alta_baja(int temperaturas[][], String ciudades[]){
		int alta = 0, baja = 0;
		for(int r=0; r<7; r++){
			for(int c=0; c<5; c++){
				if(temperaturas[r][c] > alta) alta = temperaturas[r][c];
				if(temperaturas[r][c] < baja) baja = temperaturas[r][c];
			}
		}
		for(int r=0; r<7; r++){
			for(int c=0; c<5; c++){
				if(temperaturas[r][c] == alta) System.out.println("La ciudad de "+ciudades[r]+" tuvo la temperatura más alta de la semana");
				if(temperaturas[r][c] == baja) System.out.println("La ciudad de "+ciudades[r]+" tuvo la temperatura más baja de la semana");
			}
		}
	}

	public static void baja_promedio(int temperaturas[][], String ciudades[]){
		int promedio = 0;
		for(int r=0; r<7; r++){
			for(int c=0; c<5; c++){
				promedio += temperaturas[r][c];
			}
		}
		promedio = promedio / 35;
		for(int r=0; r<7; r++){
			for(int c=0; c<5; c++){
				if(temperaturas[r][c] < promedio) System.out.println("La ciudad de "+ciudades[r]+" tuvo una temperatura menor al promedio");
			}
		}
	}

	public static void alta_promedio(int temperaturas[][], String dias[]){
		int promedio = 0;
		for(int r=0; r<7; r++){
			for(int c=0; c<5; c++){
				promedio += temperaturas[r][c];
			}
		}
		promedio = promedio / 35;
		for(int r=0; r<7; r++){
			for(int c=0; c<5; c++){
				if(temperaturas[r][c] > promedio) System.out.println("El día "+dias[c]+" tuvo una temperatura mayor al promedio");
			}
		}
	}
	
	public static void lineas() {
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println();

	}
	
	public static void main(String []args) {
		int temperaturas[][] = new int[7][5];
		String dias[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
		String ciudades[] = {"La Piedad", "Zamora", "León", "Guadalajara",
							 "Yurécuaro", "Zináparo", "Ecuandureo"};
		
		//PEDIR TEMPERATURAS
		leerTemperaturas(dias, ciudades, temperaturas);
		lineas();
		
		//OBTENER EL PROMEDIO TE TEMPERATURAS POR DIAS E IMPRIMIRLO
		promedioTemperaturas(temperaturas, dias);
		lineas();
		
		//CALCULAR CUAL CIUDAD TIENE LA TEMPERATURA MÁS BAJA Y MÁS ALTA DE TODA LA SEMANA
		alta_baja(temperaturas, ciudades);
		lineas();
		
		//CIUDADES CON TEMPERATURAS MÁS BAJAS QUE EL PROMEDIO
		baja_promedio(temperaturas, ciudades);
		lineas();

		//DÍAS CON TEMPERATURAS MÁS ALTAS QUE EL PROMEDIO
		alta_promedio(temperaturas, dias);
		lineas();
	}

}
