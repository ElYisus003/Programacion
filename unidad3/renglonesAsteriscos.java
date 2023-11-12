package unidad3;

public class renglonesAsteriscos {
	public static void main(String []args) {
		int cont1 = 0, cont2 = 0;
		
		do {
			cont1++;
			cont2 = 0;
			
			do {
				cont2++;
				System.out.print("*");
				
			} while(cont2 < cont1);
			
			System.out.println(" ");
			
		} while(cont1 < 20);
	}
}
