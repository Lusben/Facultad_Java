package arreglos_5;

public class ejercicio28 {

	public static boolean estaOrdenado(int[] a) {
		boolean ordenado = true;

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] > a[i + 1]) {
				System.out.println("No esta ordenado: el num " + a[i] + " es mayor a: " + a[i + 1]);
				ordenado = false;
			}

		}

		return ordenado;
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 9, 11, 12 };
		int b[] = { 1, 2, 3, 4, 5, 6, 9, 11, 1 };
		
		System.out.println(estaOrdenado(a));
		System.out.println(estaOrdenado(b));
	}

}
