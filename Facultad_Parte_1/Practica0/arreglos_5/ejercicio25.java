package arreglos_5;

public class ejercicio25 {
	/*
	 * que dado un arreglo de enteros no vacio, devuelve el valor mas alto que
	 * aparece.
	 */

	public static int maximo(int[] a) {

		int numeroAlto = 0;

		for (int i = 0; i < a.length; i++) {

			if (numeroAlto < a[i]) {
				numeroAlto = a[i];
			}

		}

		return numeroAlto;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 10, 0, 2 };
		System.out.println(maximo(a));

	}

}
