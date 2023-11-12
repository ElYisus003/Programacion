package unidad2;

public class calculaSalario {
	public static void main(String []args) {
		/*
		 * Calcular el salario de un empleado que gana la primer semana $1200
		 * La segunda semana se duplica su salario, es decir, gana $2400
		 * La tercera semana gana $4,800... y así hasta completar 20 semanas
		 * Diseñe un programa qie imprima el salario por cada semana
		 * Y el acumulado en cada una de las semanas.
		 */
		
		System.out.println("Semana"+"\t\t"+"Sueldo Semanal"+"\t\t"+"Total Acumulado");
		
		int semana = 1, sueldoSemanal = 1200, totalAcumulado = 0;
		
		do {
			
			totalAcumulado = totalAcumulado + sueldoSemanal;
			System.out.println(semana+"\t\t"+sueldoSemanal+"\t\t\t"+totalAcumulado);
			sueldoSemanal = sueldoSemanal * 2;
			semana = semana + 1;
			
		} while (semana < 21);
	}

}
