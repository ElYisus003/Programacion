package unidad2;

public class sumaSerie {
	public static void main(String []args) {
		/*
		 * El código suma los números pares del 2 al 2000 
		 * y muestra al usuario cada número generado 
		 * así como la suma de dichos números 
		 */
		
		int suma=0, numero=0;
		
		do {
			numero = numero + 2;
			System.out.println("El número es: "+numero);
			
			suma = suma + numero;
			System.out.println(suma);
			
		} while (numero < 50);
		
	}

}
