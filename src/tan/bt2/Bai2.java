package tan.bt2;

import java.util.Scanner;

public class Bai2 {
	public static void giaiPTB1(float a, float b) throws GiaiPTException {
		if (a == 0)
			throw new GiaiPTException("vui lòng nhập hệ số a khác 0!");
		else {
			System.out.println("PT có nghiệm là: " + (-b / a));
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cont;
		do {
			cont = false;
			try {
				System.out.println("Nhập a: ");
				float a = Float.parseFloat(input .nextLine());
				System.out.println("Nhập b: ");
				float b = Float.parseFloat(input .nextLine());
				giaiPTB1(a, b);
			} catch (NumberFormatException e) {
				System.out.println("Nhập sai định dạng số!");
				cont = true;
			} catch (GiaiPTException e) {
				System.out.println(e.getMessage());
				cont = true;
			}
		} while (cont);

	}


}
