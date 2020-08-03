
import java.util.Scanner; 
import java.util.Locale;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp = 's';
		
		do {
			System.out.print("Digite a temperatura em celcius: ");
			
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;

			System.out.printf("Equivalente em fahrenheit: %.1f%n", F);
			System.out.println("Deseja repetir ( s / n ) ?");
			
			resp = sc.next().charAt(0);
			
		}while (resp != 'n');
		
		sc.close();
	}
 
}