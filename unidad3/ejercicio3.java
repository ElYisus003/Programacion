package unidad3;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String []args) {
		Scanner tcld = new Scanner(System.in);
		int contador = 1, can1=0, can2=0, can3=0, can4=0, can5=0, votos;
		
		System.out.println("OPCIONES DE CANDIDATOS");
		System.out.println("============================================================================");
		System.out.println("OPCION 1"+"\t"+"OPCION 2"+"\t"+"OPCION 3"+"\t"+"OPCION 4"+"\t"+"OPCION 5");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Candidato 1"+"\t"+"Candidato 2"+"\t"+"Candidato 3"+"\t"+"Candidato 4"+"\t"+"Candidato5");
		System.out.println("============================================================================");
		
		do {
			System.out.println("Escribe hacia quien va a ser el voto "+contador);
			votos = tcld.nextInt();
			
			if(votos == 1) can1++;
			else if(votos  == 2) can2++;
			else if(votos == 3) can3++;
			else if(votos == 4) can4++;
			else if(votos == 5) can5++;
			
			contador++;
			
		} while(contador != 101);
		
		System.out.println("El Candidato 1 ha obtenido un total de "+can1+" votos");
		System.out.println("El Candidato 2 ha obtenido un total de "+can2+" votos");
		System.out.println("El Candidato 3 ha obtenido un total de "+can3+" votos");
		System.out.println("El Candidato 4 ha obtenido un total de "+can4+" votos");
		System.out.println("El Candidato 5 ha obtenido un total de "+can5+" votos");
		
		System.out.println("----------------------------------------------------------------------------");
		
		if(can1>can2 && can1>can3 && can1>can4 && can1>can5)
			System.out.println("El candidato con más votos es el Candidato 1");
		else if(can2>can1 && can2>can3 && can2>can4 && can2>can5)
			System.out.println("El cadidato con más votos es el candidato 2");
		else if(can3>can1 && can3>can2 && can3>can4 && can3>can5)
			System.out.println("El candidato con más votos es el candidato 3");
		else if(can4>can1 && can4>can2 && can4>can3 && can4>can5)
			System.out.println("El candidato con más votos es el candidato 4");
		else if(can5>can1 && can5>can2 && can5>can3 && can5>can4)
			System.out.println("El candidato con más votos es el candidato 5");
	}

}
