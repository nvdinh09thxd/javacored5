package bai2;

import java.util.Scanner;

import exception.GiaiPTException;

public class GiaiPhuongTrinh2 {

	public static void giaiPTB1(int a, int b) throws GiaiPTException {
		if (a == 0)
			throw new GiaiPTException("Vui long nhap he so a lon hon 0!");
		else {
			System.out.println("Phuong trinh co nghiem: " + (-b / a));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Nhap he so a: ");
			int a = Integer.parseInt(sc.nextLine());
			System.out.println("Nhap he so b: ");
			int b = Integer.parseInt(sc.nextLine());
			giaiPTB1(a, b);
		} catch (NumberFormatException e) {
			System.err.println("Nhap sai dinh dang so!");
		} catch (GiaiPTException e) {
			System.err.println(e.getMessage());
		}
	}

}
