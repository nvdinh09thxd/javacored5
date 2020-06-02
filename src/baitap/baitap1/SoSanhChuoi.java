package baitap.baitap1;

public class SoSanhChuoi {

	public static void main(String[] args) {
		String chuoi1 = "Abc";
		String chuoi2 = "abc";
		String chuoi3 = chuoi1;
		String chuoi4 = "Abc";
		
		String chuoi5 = new String("Abc");
		String chuoi6 = new String("abc");
		String chuoi7 = new String("Abc");
		
		//equal: so sanh gia tri
		System.out.println(chuoi1.equals(chuoi2));
		System.out.println(chuoi1.equals(chuoi3));
		System.out.println(chuoi1.equals(chuoi4));
		
		System.out.println(chuoi5.equals(chuoi6));
		System.out.println(chuoi5.equals(chuoi7));
		System.out.println(chuoi1.equals(chuoi5));
		
		//==: so sanh dia chi
		System.out.println(chuoi1 == chuoi2);
		System.out.println(chuoi1 == chuoi3);
		System.out.println(chuoi1 == chuoi4);
		
		System.out.println(chuoi5 == chuoi6);
		System.out.println(chuoi5 == chuoi7);
		System.out.println(chuoi1 == chuoi5);
	}

}
