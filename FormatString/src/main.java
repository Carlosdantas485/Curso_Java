
public class main {

	public static void main(String[] args) {

		String nome = " Carlos Alberto Dantas Filho ";
			
			String convertLow = nome.toLowerCase();
			System.out.println(convertLow);
			//letras maiusculas
			
			String convertUpper = nome.toUpperCase();
			System.out.println(convertUpper);
			//letras minuscuas
			
			String convertTrim = nome.trim();
			System.out.println(convertTrim);
			//tira os espacos no inicio e no fim da frase
			
			String convertSubstring = nome.substring(2);
			System.out.println(convertSubstring);
			//ira mostar apenas as letras seguintes a posicao 2
			
			String convertSubstring2 = nome.substring(2, 9);
			System.out.println(convertSubstring2);
			//ira mostar apenas as letras seguintes a posicao 2 ate a posicao 9
		
			String convertReplace = nome.replace('a', '?');
			System.out.println(convertReplace);
			//troca todas as letras ( a ) por ( ? )
		
			String convetReplace2 = nome.replace("ar", "?!");
			System.out.println(convetReplace2);
			//troca todas as letras ( ar ) por ( ?! )
			
			int convertIndexOf= nome.indexOf("ar"); 
			System.out.println(convertIndexOf);
			//em que posicao ocorre a primeira aparicao
			
			int convertLastIndexOf= nome.lastIndexOf("ar"); 
			System.out.println(convertLastIndexOf);
			//em que posicao ocorre a ultima aparicao
			
			String frase = "O Naruto pode ser um pouco duro as vezes";
			String[] vetor = frase.split(" ");
			//o que for colocado dentro das "" ira definir o separador 
			System.out.println(vetor[2]);
			//pega a frase e separa em pedacoes em um vetor
			
			
	}

}