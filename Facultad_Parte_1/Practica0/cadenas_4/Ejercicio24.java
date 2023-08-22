package cadenas_4;

public class Ejercicio24 {
	public static boolean esCapicua(String s) {
		String res = "";
		
		
		for (int i = s.length() - 1; i >= 0; i--) {
			//Agarro desde la ultima posicion y comparo con la palabra
			res = res + s.charAt(i);

		}
		if (s.equals(res)) {
			return true;
		}
		
		return false;
	}

	public static boolean dobleCapicua(String s) {
		String s1 = "";
		String s2 = "";

		for (int i = 0; i < s.length(); i++) {
			s1 = s.substring(0, i);
			s2 = s.substring(i);

			if (esCapicua(s1) && esCapicua(s2)) {
				
				System.out.println(s1);
				System.out.println(s2);
				return true;
			}

		}

		return false;

	}
	
	public static void main(String[] args) {
		
		System.out.println(dobleCapicua("neuquenoso"));
		
		
	}

}


