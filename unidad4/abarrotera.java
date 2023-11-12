package unidad4;

import java.util.Scanner;

public class abarrotera {
	public static void main(String []args) {
		Scanner MarcoAntonioSolis = new Scanner(System.in);
		float ventas[][] = new float[7][6];
		String mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
		int sucursalesMayores[] = new int[7];
		int sucursalesMenores[] = new int[7];
		float ventasSucursal, ventasMes, ventasSMax=0, ventasSMin=0,
				ventasMMax=0, ventasMMin=0, sumaVentas=0, promedio=0;
		int contA=0, contB=0,sucursalMax=0, sucursalMin=0, mesMax=0, mesMin=0;
		
		//Leer las ventas de cada mes y sucursal
		for(int r=0; r<7; r++) {
			System.out.println("=================================");
			System.out.println("\t SUCURSAL "+(r+1));
			System.out.println();
			
			for(int c=0; c<6; c++) {
				System.out.print("Introduce las ventas de "+mes[c]+": ");
				ventas[r][c] = MarcoAntonioSolis.nextFloat();
			}
		}
		
		//Calcular el valor de ventas por sucursal
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println("\t VENTAS POR SUCURSAL");
		System.out.println();
		
		for(int r=0; r<7; r++) {
			ventasSucursal = 0;
			for(int c=0; c<6; c++) {
				ventasSucursal += ventas[r][c];
			}
			System.out.println("Sucursal "+(r+1)+": "+ventasSucursal);
			
			//Identificar cuál es la sucursal que más vendió y cuál es la que menos vendió
			if(ventasSucursal > ventasSMax) {
				ventasSMax = ventasSucursal;
				sucursalMax = r+1;
			}
			else if(ventasSucursal < ventasSMax) {
				ventasSMin = ventasSucursal;
				sucursalMin = r+1;
			}
			
			sumaVentas += ventasSucursal;
		}
		
		promedio = sumaVentas / 7; //Scar un promedio general de todas las sucursales
		
		//Identificar cuáles sucursales tienen ventas mayores o menores al promedio
		for(int r=0; r<7; r++) {
			ventasSucursal = 0;
			for(int c=0; c<6; c++) {
				ventasSucursal += ventas[r][c];
			}
			if(ventasSucursal >= promedio) {
				sucursalesMayores[contA] = r+1;
				contA++;
			}
			else if(ventasSucursal < promedio) {
				sucursalesMenores[contB] = r+1;
				contB++;
			}
		}
		
		//Calcular el valor de ventas por mes
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println("\t VENTAS POR MES");
		System.out.println();
		
		for(int c=0; c<6; c++) {
			ventasMes = 0;
			for(int r=0; r<7; r++) {
				ventasMes += ventas[r][c];
			}
			System.out.println(mes[c]+": "+ventasMes);
			
			//Indentificar cuál es el mes en el que menos se vendió y cuál es en el que menos se vendió
			if(ventasMes > ventasMMax) {
				ventasMMax = ventasMes;
				mesMax = c;
			}
			else if(ventasMes < ventasMMax) {
				ventasMMin = ventasMes;
				mesMin = c;
			}
		}
		
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println("La sucursal que obtuvo mayores ventas es la Sucursal "+sucursalMax+" con una venta de $"+ventasSMax);
		System.out.println("La sucursal que obtuvo maenores ventas es la Sucursal "+sucursalMin+" con una venta de $"+ventasSMin);
		System.out.println();
		System.out.println("El mes con mayores ventas es el mes de "+mes[mesMax]+" con una venta de $"+ventasMMax);
		System.out.println("El mes con menores ventas es el mes de "+mes[mesMin]+" con una venta de $"+ventasMMin);

		
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println();
		System.out.println("El promedio de ventas es: "+promedio);
		System.out.println();
		System.out.println("Sucursales con ventas mayores o iguales al promedio:");
		for(int i=0; i<contA; i++) {
			System.out.print("Sucursal "+sucursalesMayores[i]+", ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Sucursales con ventas menores al promedio:");
		for(int i=0; i<contB; i++) {
			System.out.print("Sucursal "+sucursalesMenores[i]+", ");
		}
		
	}
}
