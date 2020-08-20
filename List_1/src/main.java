import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Carlos");
		list.add("Thiago");
		list.add("Lukas");
		list.add("Gabriel");
		list.add("Daniel");
		list.add("Lucas");

		list.add(2, "Marcos");

		System.out.println(list.size());
		System.out.println("____________________________");

		for (String names : list) {
			System.out.println(names);
		}

		list.remove("Marcos");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'L');

		System.out.println(list.size());
		System.out.println("____________________________");
		
		System.out.println("Posicao do Carlos: "+list.indexOf("Carlos"));
		System.out.println("Posicao do Marcos: "+list.indexOf("Marcos"));
		
		System.out.println("____________________________");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("____________________________");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
		System.out.println(name);
	}

}
