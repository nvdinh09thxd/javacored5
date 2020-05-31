package pk1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Ex5 ex5 = new Ex5();
		try {
			ex5.inputData();
		} catch (NumberFormatException e) {
			System.out.println("Loi so");
		} catch (Exception e) {
			System.out.println("Loi gi do");
		}
	}

	public static void inputData() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so");
		int number = Integer.parseInt(sc.nextLine());
		// throws new NumberFormatException();
		System.out.println("So vua nhap: " + number);
	}
}
