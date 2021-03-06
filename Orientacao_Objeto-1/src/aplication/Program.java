package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		triangulo trian1, trian2;
		
		trian1 = new triangulo();
		trian2 = new triangulo();
		
		System.out.println("Digite as medidas do primeiro trinagulo");
		trian1.medida_1 = sc.nextDouble();
		trian1.medida_2 = sc.nextDouble();
		trian1.medida_3 = sc.nextDouble();
		
		System.out.println("Digite as medidas do segundo trinagulo");
		trian2.medida_1 = sc.nextDouble();
		trian2.medida_2 = sc.nextDouble();
		trian2.medida_3 = sc.nextDouble();
		
		double triangulo_1_result = trian1.area();
		System.out.printf("A area do primeiro triangulo: %.4f%n", triangulo_1_result);
		
		double triangulo_2_result = trian2.area();
		System.out.printf("A area do segundo triangulo: %.4f%n", triangulo_2_result);
		
		if (triangulo_1_result > triangulo_2_result) {
			System.out.println("O orimeiro triangulo e maior !");
		}
		else {
			System.out.println("O segundo triangulo e maior !");
		}
		
		sc.close();
	}
}
