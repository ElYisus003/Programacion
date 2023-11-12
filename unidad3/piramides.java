package unidad3;

import java.util.Scanner;

public class piramides {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int renglones;
		
		System.out.println("Ingresa el número de renglones para la pirámide 1");
		renglones = tcld.nextInt();
		
		for(int a=0; a<renglones; a++) {
			
			for(int b=0; b<=a; b++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("=================================================");
		System.out.println("Ingresa el número de renglones para la pirámide 2");
		renglones = tcld.nextInt();
		
		for(int a=renglones; a>0; a--) {
			
			for(int b=0; b<a; b++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("=================================================");
		System.out.println("Ingresa el número de renglones para la pirámide 3");
		renglones = tcld.nextInt();
		
		for(int a=0; a<renglones; a++) {
			
			for(int b=0; a<renglones; b++) {
				
				if(b<a) System.out.println("*");
				else if(b>a) System.out.println(" ");
			}
			
			System.out.println();
			
		}
		
		System.out.println("=================================================");
		System.out.println("Ingresa el número de renglones para la pirámide 4");
		renglones = tcld.nextInt();
		
		for(int a=0; a<renglones; a--) {
			
			for(int b=0; a<renglones; b++) {
				
				if(b>a) System.out.println("*");
				else if(b<a) System.out.println(" +");
			}
		}
		
	}

}
