package pk1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// Nhập vào số sau đó kiểm tra số đó chẵn hay lẻ rồi in ra
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Nhap vao so");
			int number = Integer.parseInt(sc.nextLine());
			if (number % 2 == 0) {
				System.out.println("La so chan");
			} else {
				System.out.println("La so le");
			}
		} catch (NumberFormatException | InputMismatchException e) {// khi có 2 ngoại lệ thì có thể để chung trong 1 khối catch
			System.out.println("Nhap vao mot so nguyen");
		} finally {
			// code được đặt trong khối finally thì luôn được thực thi cho dù có bị lỗi hay không?
			System.out.println("Xin chào, hẹn gặp lại!");
		}
	}
}
