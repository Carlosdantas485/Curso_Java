package dataCalendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class main {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		
		Date day = Date.from(Instant.parse("2018-06-25t15:42:07z"));
		
		System.out.println(sdf.format(day));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(day);
//		cal.add(Calendar.HOUR_OF_DAY,4);
//		day = cal.getTime();
		
		int minuts = cal.get(Calendar.MINUTE);
		int month = 1+cal.get(Calendar.MONTH);
		
//		System.out.println(sdf.format(day));
		System.out.println(minuts);
		System.out.println(month);
		
		

	}

}
