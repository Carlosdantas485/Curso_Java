
public class Main {

	public static void main(String[] args) {
//		double x = 3.0;
//		double y = 4.0;
//		double z = -5.0;
//		double A, B, C;
//		
//		A = Math.sqrt(x);
//		B = Math.sqrt(y);
//		C = Math.sqrt(25);
//		//Math.sqrt() é a raiz quadrada um numero
//		System.out.println("Raiz quadrade de " + x + " = " + A);
//		System.out.println("Raiz quadrada de " + y + " = " + B);
//		System.out.println("Raiz quadrada de " + z + " = " + C);
//		
//		System.out.println();
//		A = Math.pow(x, y);
//		B = Math.pow(x, 2.0);
//		C = Math.pow(5.0, 2.0);
//		//Math.pow(valor, elevado a)
//		System.out.println(x + " elevado a "+ y + " = " + A);
//		System.out.println(x + " elevado ao quadrado = " + B);
//		System.out.println("5 elevado ao quadrado = "+ C);
//		
//		System.out.println();
//		A = Math.abs(y);
//		B = Math.abs(z);
//		System.out.println("Valor absoluto = " + A);
//		System.out.println("Valor absoluto = " + B);
		
		double a = 5;
		double b = 3;
		double c = 9;
		
		double delta, x1, x2;
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0*a);
		x2 = (-b - Math.sqrt(delta)) / (2.0*a);
		
		System.out.printf("%.2f%n", x1);
		System.out.printf("%.2f%n", x2);
	}

}
