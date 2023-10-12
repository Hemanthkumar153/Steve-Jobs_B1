package Practise;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Date {
	public static Date date = null;
	private Date() {
		
	}
	public static Date ofPattern() {
		return date;
		
	}
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));      
		
		
		
	}

	
}
