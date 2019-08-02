package main;

public class Main {

	public static void main(String[] args) {

		int cont = 0;
		int x = 0;

		for (int i = 1; i <= 100; i++) {
			if (primo(i) == true) {
				cont++;
				System.out.println("Primo: " + i);
				System.out.println("Posicion: " + cont);
				System.out.println("Numero invertido: " + invertir(i));
			}
		}

	}

	static boolean primo(int x) {
		int cont = 2;
		boolean validar = true;
		while ((validar) && (cont != x)) {
			if (x % cont == 0)
				validar = false;
			cont++;
		}
		return validar;
	}

	/************************/

	static int invertir(int numero) {
		int invertido = 0, resto;

		while (numero > 0) {
			resto = numero % 10;
			invertido = invertido * 10 + resto;
			numero /= 10;
		}

		return invertido;
	}

	/************************/
}
