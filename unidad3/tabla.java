package unidad3;

public class tabla {
	public static void main(String []args) {
		int multiplica;
		
		System.out.println("Tabla del: \t 1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9 \t 10");
		
		for(int i=1; i<=10; i++) {
			
			System.out.print("\t "+i);
			
			for(int c=1; c<=10; c++) {
				multiplica = i*c;
				
				System.out.print("\t "+multiplica);
			}
			System.out.println();
		}
	}

}
