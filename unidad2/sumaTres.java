package unidad2;

public class sumaTres {
	public static void main(String []args) {
		int num=200, suma=0;
		
		do {
			System.out.println("El número es: ");
			num = num - 3;
			suma = suma + num;
			
			System.out.println("La suma es: "+suma);
			
		} while (num != 0);
	}

}
