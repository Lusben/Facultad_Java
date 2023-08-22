package recursividad_6;

public class ejercicio30 {
	static int sum = 0;

	public static int sumatoriaRec(int n) {

		if (n == 0) {
			return 0;

		}

		return n + sumatoriaRec(n - 1);
	}

	public static int sumatoriaParesRec(int n) {

		if (n <= 0) {
			return 0;
		} else if (n % 2 == 0) {
			return n + sumatoriaParesRec(n - 2);
		} else {
			return sumatoriaParesRec(n - 1);
		}

	}

	public static int sumatoriaParesRecCorto(int n) {
		if (n <= 0) {
			return 0;
		}
		// condición ? expresión_si_verdadera : expresión_si_falsa
		return (n % 2 == 0 ? n : n - 1) + sumatoriaParesRec(n - 2);
	}

	public static double potenciaRec(double x, int n) {
		if (n == 0) {
			return 1;
		}else if(n>0) {
			return (x * potenciaRec(x, n - 1));
		}else {
			return 1/(x*potenciaRec(x, -n-1));
		}
		

	}
	
	public static int factorialRec(int n ) {
		if(n == 0) {
			return 1;
		}
		return n*factorialRec(n-1);
		
		
		
	}

	public static void main(String[] args) {
		System.out.println("a) Sumatoria Recursiva: " + sumatoriaRec(5));
		System.out.println("b) Sumatoria Pares Recursiva: " + sumatoriaParesRec(6));
		System.out.println("b) Sumatoria pares Recursiva Codigo CORTO: " + sumatoriaParesRecCorto(6));
		System.out.println("c) Potencia Recursiva Positiva: " + potenciaRec(2, 3));
		System.out.println("c) Potencia Recursiva Negativa: " + potenciaRec(2, -3));
		System.out.println("d) Factorial Recursiva: " + factorialRec(5));
	}

}
