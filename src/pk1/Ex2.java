package pk1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// cho nhập vào một số, và in ra số đó
		Scanner sc = new Scanner(System.in);
		int number = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập số: ");
				number = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.err.println("Vui lòng nhập vào một số nguyên!");
			}
		} while (check);
		System.out.println("Số nhập vào là: " + number);
	}

}
