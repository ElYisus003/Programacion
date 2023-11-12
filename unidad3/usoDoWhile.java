package unidad3;

import java.util.Scanner;

public class usoDoWhile {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		float ventas, pagoTotal;
		int contador = 0;
		
		do {
			contador ++;
			System.out.println("Introduce las ventas del cliente: "+contador);
			ventas = tcld.nextFloat();
			pagoTotal = (float) (ventas+ventas*0.16);
			
			
		} while(contador != 5);
	}

}
