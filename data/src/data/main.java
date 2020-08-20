package data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:20:30");
		
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println("_____________________________________");
		
		Date DateNow = new Date();
		System.out.println(sdf1.format(DateNow));
		System.out.println(sdf2.format(DateNow));
		System.out.println("_____________________________________");
		
		Date DateSystem = new Date(System.currentTimeMillis());
		System.out.println(sdf1.format(DateSystem));
		System.out.println(sdf2.format(DateSystem));
		System.out.println("_____________________________________");
		
		Date y3 = Date.from(Instant.parse("2018-06-25t15:42:07z"));
		System.out.println(sdf2.format(y3));
		System.out.println("_____________________________________");
		
		System.out.println(sdf3.format(y1));
		System.out.println(sdf3.format(y2));
		System.out.println(sdf3.format(DateNow));
		System.out.println(sdf3.format(DateNow));
		System.out.println(sdf3.format(DateSystem));
		System.out.println(sdf3.format(DateSystem));
		System.out.println(sdf3.format(y3));
	}

}
