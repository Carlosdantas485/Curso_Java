package main;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		entities.product product = new product();
		
		System.out.println("Data de entrada do produto");
		System.out.print("Digite o nome do produto: ");
		product.name = sc.nextLine();
		
		System.out.print("Digite o preço do produto: ");
		product.price = sc.nextDouble();
		
		System.out.print("Digite a quantidade em estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		System.out.print("Digite a quantidade que voce quer adicionar: ");
		int increment = sc.nextInt(); 
		product.addProducts(increment);
		
		System.out.println("Dados atualizados " + product);
		
		System.out.print("Digite a quantidade que voce quer remover: ");
		int remove = sc.nextInt(); 
		product.removeProducts(remove);
		
		System.out.println("Dados atualizados " + product);
		
		sc.close();
	}

}
