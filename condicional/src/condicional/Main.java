package condicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora ;

		hora = sc.nextInt();

		if ( 0 <= hora && hora <= 12 ) {
			System.out.println("Bom Dia");
		}
		else if ( 12 < hora && hora <= 18) {
			System.out.println("Boa Tarde");
		}
		else if (18 < hora && hora <= 24 ) {
			System.out.println("Boa noite");
		}
		else{
			System.out.println("Horario invalido");
		}
		sc.close();

	}

}
