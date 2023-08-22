package arreglos_5;

public class ejercicio29 {

	public static double promedio(double a[]) {

		double valorPromedio = 0;
		
		for(int i = 0 ; i< a.length ; i++) {
			
			valorPromedio += a[i];
			
		}
		valorPromedio = valorPromedio / a.length;
		
		
		return valorPromedio;
	}
	
	public static void main(String[] args) {
		
		double a[] = {1.5 , 30 , 25, 30.8};
		
		System.out.println("El Promedio es: " + promedio(a));
	}

}
