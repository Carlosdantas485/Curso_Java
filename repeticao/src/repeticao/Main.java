package repeticao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 1, number = sc.nextInt();
		
		while(number != 0 ) {
			number = sc.nextInt();
			total = total+number;
		}
		System.out.println(total);
		sc.close();
	}

}
