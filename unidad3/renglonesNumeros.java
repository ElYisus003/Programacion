package unidad3;

import java.util.Scanner;

public class renglonesNumeros {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int renglones, cont1 = 0, cont2 = 0;
		
		System.out.println("Introduzca el número de renglones");
		renglones = tcld.nextInt();
		
		do {
			cont1++;
			cont2 = 0;
			
			do {
				cont2++;
				System.out.print(cont2+" ");
				
			} while(cont2 < cont1);
			
			System.out.println(" ");
			
		} while(cont1 < renglones);
	}

}
