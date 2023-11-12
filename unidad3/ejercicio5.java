package unidad3;

public class ejercicio5 {
	public static void main(String []args) {
		double salario = 100;
		int semana = 1;
		
		do {
			System.out.println("Semana "+semana);
			System.out.println("El salario es: $"+salario);
			salario = salario*3;
			semana++;
			
		} while(semana != 21);
		
	}

}
