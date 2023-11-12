package unidad4;

import java.util.Scanner;

public class numeroMayorIgual {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		float numeros[] = new float[20];
		float comparar;
		int igual=0, menor=0;
		
		for(int i=0; i<20; i++) {
			System.out.print("Ingresa el "+(i+1)+"° número: ");
			numeros[i] = tcld.nextFloat();
		}
		
		System.out.println();
		System.out.print("Ingresa un número para comparar: ");
		comparar = tcld.nextFloat();
		
		for(int i=0; i<20; i++) {
			
			if(comparar > numeros[i]) menor++;
			else if(comparar == numeros[i]) igual++;
			
		}
		
		System.out.println("====================================================");
		System.out.println("La cantidad de números iguales a "+comparar+" es: "+igual);
		System.out.println("La cantidad de números menores a "+comparar+" es: "+menor);
	}

}
