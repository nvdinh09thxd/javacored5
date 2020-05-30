package classes;

public class lopString {

	public static void main(String[] args) {
		String chuoi1 = "VinaEnter";
		String chuoi2 = new String("Vina");
		
		System.out.println(chuoi1);
		System.out.println(chuoi2);
		
		
		System.out.println(chuoi1.length());
		System.out.println(chuoi1.charAt(0));
		System.out.println(chuoi1.indexOf("E"));
		System.out.println(chuoi1.toLowerCase());
		System.out.println(chuoi1.toUpperCase());
		System.out.println(chuoi1.trim());
		
		
		//Tao chuoi
		System.out.println("\n");
		System.out.println(chuoi1.substring(4, 6));
		System.out.println(chuoi1.substring(4));
		
		//StringBuffer
		//StringBuilder
		
		StringBuffer sb = new StringBuffer("Vina");
		System.out.println("\n" + sb.reverse());
		
		
		
	}

}
