package telefonia_ex;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double minutos, total;
		
		minutos = sc.nextDouble();
		
		if(minutos <= 100){
			
			total = 50.00;
			System.out.println("O valor a ser pagoeh: "+ total);
		}
		else {
			total = 50+(minutos-100) * 2;
			System.out.println("O valor a ser pagoeh: "+ total);
		}
		
		
		sc.close();
	}

}
