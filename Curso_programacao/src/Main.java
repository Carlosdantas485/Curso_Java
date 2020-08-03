import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		int y = 32;
		double medida = 123.5467;
		double x = 10.987654;
		
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		
		System.out.println("Olá Carlos");
		System.out.print("Bom dia");
		System.out.println("Boa noite");
		
		System.out.println(y);
		
		System.out.println(x);
		
		System.out.printf("%.2f %n",x);
		System.out.printf("%.4f %n",x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f %n",x);
		
		System.out.println("Resultado = "+ medida + " Metros");
		
		System.out.printf("Resultado = %.2f metros%n", medida);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
