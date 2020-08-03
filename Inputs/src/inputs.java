import java.util.Locale;
//usado para definir a liguagem

import java.util.Scanner;
//importa a funcao de input no programa

public class inputs {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// define a linguagem
		Scanner sc = new Scanner(System.in);
		// faz com que a variavel sc execute a funcao scaner

//		String x;
//		
//		x = sc.next();
//		System.out.println("Voce digitou: "+ x);
//		//para palavaras
//		
//		int y;
//		y = sc.nextInt();
//		System.out.println("voce digitou: "+ y);
//		//para numeros inteiros
//		
//		double z;
//		z = sc.nextDouble();
//		System.out.printf("voce digitou: %.2f%n"+ z);
//		//para numeros quebrados
//		
//		char name;
//		name = sc.next().charAt(0);
//		System.out.println("voce digitou: "+ name);
//		//mostra a primeira letra digitada
//
//		String nome;
//		int idade;
//		double peso;
//		
//		System.out.print("Digite seu nome: ");
//		nome = sc.next();
//		
//		System.out.print("Digite sua idade: ");
//		idade = sc.nextInt();
//		
//		System.out.print("Digite seu peso: ");
//		peso = sc.nextDouble();
//		
//		System.out.println("");
//		System.out.println("Seu nome é: "+ nome);
//		System.out.println("Sua idade é: "+ idade);
//		System.out.printf("Seu peso é: %.2f%n", peso);

//		String nome1, nome2, nome3;
//
//		nome1 = sc.nextLine();
//		nome2 = sc.nextLine();
//		nome3 = sc.nextLine();
//		// sc.nextLine le alinha toda digitada
//		// sc.next()le apenas uma palavra
//
//		System.out.println(nome1);
//		System.out.println(nome2);
//		System.out.println(nome3);

		int nome;
		String nome2, nome3, nome4;

		nome = sc.nextInt();
		sc.nextLine();
		nome2 = sc.nextLine();
		nome3 = sc.nextLine();
		nome4 = sc.nextLine();
	

		System.out.println(nome);
		System.out.println(nome2);
		System.out.println(nome3);
		System.out.println(nome4);

		sc.close();
	}

}
