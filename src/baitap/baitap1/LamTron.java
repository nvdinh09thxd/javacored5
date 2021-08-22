package baitap.baitap1;

import java.util.Scanner;

public class LamTron {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Nhap vao mot so: ");
			double number = Double.parseDouble(sc.nextLine());
			sc.close();
			System.out.println("So vua nhap vao: "+number);
			System.out.println("So lam tron len: "+Math.ceil(number));
			System.out.println("So lam tron xuong: "+Math.floor(number));
		} catch (NumberFormatException e) {
			System.out.println("Vui long nhap dung dinh dang so!");
		}
	}

}
