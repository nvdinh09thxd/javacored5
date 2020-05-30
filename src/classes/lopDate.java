package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class lopDate {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("d-M-y HH:mm:ss ");
		System.out.println(sdf1.format(date));	

	}

}
