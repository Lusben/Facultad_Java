package metodos_3;

public class eJ10 {
/*
 * Escribir un metodo static int sumatoria(int n) 
 * que devuelve la sumatoria de los numeros
 * desde 1 hasta n
 */
	
	public static void sumatoria(int n) {
		int i=1;
		int sumatoria = 0;
		while(i<= n) {
			
			sumatoria = sumatoria + i;
			i++;
		}
		System.out.println(sumatoria);
	}
	
	public static void main(String[] args) {
		sumatoria(5);
	}

}
