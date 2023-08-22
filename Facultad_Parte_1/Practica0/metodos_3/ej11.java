package metodos_3;

public class ej11 {

	/*
	 * Escribir un metodo static int sumatoriaPares(int n) que devuelve la sumatoria
	 * de los numeros pares desde 2 hasta n.
	 * 
	 */
	
	public static void sumatoriaPares(int n) {
		
		int sumatoria = 0;
		int i = 1;
		while(i<=n) {
			
			if(0 == (i%2)) {
				sumatoria = sumatoria + i;
			}
			i++;
			
		}
		System.out.println(sumatoria);
	}
	
	
	public static void main(String[] args) {
		sumatoriaPares(6);
		
	}

}
