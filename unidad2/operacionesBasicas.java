package unidad2;

import java.util.Scanner;

public class operacionesBasicas {
	public static void main(String []args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, numero3, numero4, numero5;
		int suma, producto, promedio;
		
		System.out.println("Introduce el primer número");
		numero1 = teclado.nextInt();
		System.out.println("Introduce el segundo número");
		numero2 = teclado.nextInt();
		System.out.println("Introduce el tercer número");
		numero3 = teclado.nextInt();
		System.out.println("Introduce el cuarto número");
		numero4 = teclado.nextInt();
		System.out.println("Introduce el quinto número");
		numero5 = teclado.nextInt();
		
		suma = numero1+numero2+numero3+numero4+numero5;
		
		producto = numero1*numero2*numero3*numero4*numero5;
		
		promedio = suma/5;
		
		System.out.println("La suma de los números es: "+suma);
		System.out.println("El producto de los númertos es: "+producto);
		System.out.println("El promedio de los números es: "+promedio);
		}
	

}
