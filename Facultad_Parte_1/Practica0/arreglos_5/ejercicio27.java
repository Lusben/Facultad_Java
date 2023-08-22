package arreglos_5;

public class ejercicio27 {
	public static int suma(int a[]) {
		int sumaTotal = 0;

		for (int i = 0; i < a.length; i++) {

			sumaTotal += a[i];

		}

		return sumaTotal;

	}

	public static void main(String[] args) {

		int a[] = { 2, 4, 5 };

		System.out.println(suma(a));
	}
}
