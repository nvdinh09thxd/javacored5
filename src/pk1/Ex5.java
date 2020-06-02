package pk1;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Ex5 ex5 = new Ex5();//không cần
		//nếu phương thức có static thì không cần tạo đối tượng
		//mà gọi trực tiếp luôn cũng được
		try {
			Ex5.inputData();
		} catch (NumberFormatException e) {
			System.out.println("Loi so");
		} catch (Exception e) {
			System.out.println("Loi gi do");
		}
	}

	public static void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("So vua nhap: " + number);
	}
}
