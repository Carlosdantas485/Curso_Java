import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comments;
import entities.Post;

public class main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comments c1 = new Comments ("have a nive trip");
		Comments c2 = new Comments ("WOW that's awesome");
		Post p1 = new Post(sdf.parse("21/06/2018 13:06:44"),
				"traveling to Brazil",
				"i'm going to visit this wonderful country",
				12
				);
		p1.addComments(c1);
		p1.addComments(c2);

		System.out.println(p1);
	}

}
