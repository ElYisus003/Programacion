package unidad4;

public class nombresAscendentes {
	public static void main(String []args) {
		String nombres[] = {"Alejandra", "Benjamin", "Carlos", "Diana", "Elionora", "Fernando", "Gilberto", 
				"Hernán", "Isaías", "Jesus", "Karla", "Laura", "Mariano", "Nsabel", "Ouan", "Paren", "Quis",
				"Rariana", "Sicolas", "Tlivia"};
		
		 boolean estaOrdenado = true;
	        for (int i = 0; i < 19; i++) {
	            if (nombres[i].compareTo(nombres[i + 1]) > 0) {
	                estaOrdenado = false;
	                break;
	            }
	        }

	        if (estaOrdenado) {
	            System.out.println("El arreglo esta ordenado ascendentemente");
	        } else {
	            System.out.println("El arreglo no esta ordenado ascendentemente");
	        }
		
	}

}
