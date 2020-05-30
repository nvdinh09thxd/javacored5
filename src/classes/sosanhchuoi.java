package classes;

public class sosanhchuoi {

	public static void main(String[] args) {
		String chuoi1 = "Abc";
		String chuoi2 = "abc";
		String chuoi3 = chuoi1;
		String chuoi4 = "Abc";

		String chuoi5 = new String("Abc");
		String chuoi6 = new String("abc");
		String chuoi7 = new String("Abc");

		System.out.println("So sanh bang equal!  ");
		System.out.println(chuoi1.equals(chuoi2));
		System.out.println(chuoi1.equals(chuoi3));
		System.out.println(chuoi1.equals(chuoi4) + "\n");

		System.out.println(chuoi5.equals(chuoi6));
		System.out.println(chuoi5.equals(chuoi7));
		System.out.println(chuoi1.equals(chuoi5) + "\n");

		System.out.println("\nSo sanh ==");
		System.out.println(chuoi1 == chuoi2);
		System.out.println(chuoi1 == chuoi3);
		System.out.println(chuoi1 == chuoi4 + "\n");

		System.out.println(chuoi5 == chuoi6);
		System.out.println(chuoi5 == chuoi7);
		System.out.println(chuoi1 == chuoi5);
	}

}
