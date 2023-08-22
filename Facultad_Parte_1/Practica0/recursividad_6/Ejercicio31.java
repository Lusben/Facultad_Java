package recursividad_6;

public class Ejercicio31 {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < n; i++) {
			System.out.print(fibrec(i) + " ");
		}
	}

	static int fibrec(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibrec(n - 1) + fibrec(n - 2);
		}
	}
}
