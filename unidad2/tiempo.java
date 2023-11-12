package unidad2;

import java.util.Scanner;

public class tiempo {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int t, segundos, minutos, horas;
		
		System.out.println("Proporciona el tiempo en segundos");
		t = tcld.nextInt();
		
		horas = t/3600;
		minutos = (t-(horas*3600))/60;
		segundos = t-((horas*3600)+(minutos*60));
		
		System.out.println("El tiempo proporcionado tiene "+segundos+" segundos, "+minutos+" minutos y "+horas+" horas");
	}

}
