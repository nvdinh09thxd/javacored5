package ex;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		float a = 0;
		float b = 0;
		float x = 0;
		boolean cont = false;
		Scanner input = new Scanner(System.in);
		do {
			try {
				System.out.println("Nhập a= ");
				a = Float.parseFloat(input.nextLine());
				System.out.println("Nhập b= ");
				b = Float.parseFloat(input.nextLine());
				if (a == 0) {
					if (b == 0) {
						System.out.println("Phương trình này có vô số nghiệm.");
					} else {
						System.out.println("Phương trình vô nghiệm.");
					}
				} else {
					x = -b / a;
					System.out.println("phương trình có nghiệm là: " + x);
				}
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Nhập sai định dạng số!");
				cont = true;
			}
		} while (cont);


	}

}
