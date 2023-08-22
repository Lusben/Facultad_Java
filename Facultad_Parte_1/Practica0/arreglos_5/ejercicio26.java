package arreglos_5;

public class ejercicio26 {

	public static int maximoIndice(int[] a) {
		int indiceMax = 0;
		int valorMax = 0;
		for (int i = 0; i < a.length; i++) {
			if (valorMax < a[i]) {
				valorMax = a[i];
				indiceMax = i;
			}

		}

		return indiceMax;
	}

	//Otra Forma de hacer lo mismo
	public static int maximo2(int[] a) {
		int indiceMax = 0;
		for (int i = 0; i < a.length; i++) {
			if (ejercicio25.maximo(a) == a[i]) {
				indiceMax = i;
			}

		}

		return indiceMax;
	}
	
	public static void main(String[] args) {

		int a[] = { 2, 5, 6, 7, 3, 4, 20, 123, 11, 33, 46 };

		System.out.println("El Indice Maximo es: " + maximoIndice(a));
		System.out.println("Forma 2: "+ maximo2(a));
	}

}
