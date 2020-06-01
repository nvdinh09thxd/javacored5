package baitap1;

public class SuDungString {

	public static void main(String[] args) {
		//2 cach khai bao
		String chuoi1 = "VinaEnter";
		String chuoi2 = new String("Vina");
		
		System.out.println(chuoi1);
		System.out.println(chuoi2);
		
		//Phuong thuc co ban
		System.out.println(chuoi1.length());
		System.out.println(chuoi1.indexOf("E"));
		System.out.println(chuoi1.charAt(0));
		System.out.println(chuoi1.toLowerCase());
		System.out.println(chuoi1.toUpperCase());
	}

}
