package baitap.baitap1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SuDungNgayThang {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("d/M/yy h:m:ss a");
		System.out.println(sdf2.format(date));
	}

}
