import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		double numero = 25;
//		double result = Math.sqrt(numero);
//		//mostra a raiz quadrada
//		System.out.println(result);

		System.out.println("Digite tres numeros");

		System.out.println("Digite o primeiro valor: ");
		int primeiro = sc.nextInt();

		System.out.println("Digite o segundo valor: ");
		int segundo = sc.nextInt();

		System.out.println("Digite o terceiro valor: ");
		int terceiro = sc.nextInt();

		int maior = max(primeiro, segundo, terceiro);

		showResult(maior);

		sc.close();
	}

	public static int max(int x, int y, int z) {

		int aux;

		if (x > y && x > z) {
			aux = x;

		} else if (y > z) {
			aux = y;

		} else {
			aux = z;
		}

		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("o maior e: "+ value);
	}

}
