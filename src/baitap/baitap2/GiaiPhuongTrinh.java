package baitap.baitap2;

import java.util.Scanner;

import baitap.exception.GiaiPTException;

public class GiaiPhuongTrinh {

	public static void giaiPTB1(float a, float b) throws GiaiPTException {
		if (a == 0) {
			throw new GiaiPTException("Vui long nhap he so a khac 0!");
		} else {
			System.out.println("Phuong trinh co nghiem: " + (-b / a));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		do {
			try {
				System.out.println("Nhap he so a: ");
				float a = Float.parseFloat(sc.nextLine());
				System.out.println("Nhap he so b: ");
				float b = Float.parseFloat(sc.nextLine());
				giaiPTB1(a, b);
				cont = false;
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang so!");
			} catch (GiaiPTException e) {
				System.out.println(e.getMessage());
			}
		} while (cont);
		sc.close();

	}

}
