package bai2;

import java.util.Scanner;

import exception.NumberException;

public class bai2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a = 0, b = 0;
		boolean cont = false;
		System.out.println("Giai phuong trong ax + b = 0");
		do {
			try {
				System.out.println("Nhap a: ");
				a = Float.parseFloat(input.nextLine());
				System.out.println("Nhap b: ");
				b = Float.parseFloat(input.nextLine());
				if (a == 0) {
					if (b != 0) {
						cont = false;
						System.out.println("Phuong trinh vo nghiem");
						throw new NumberException("Loi chia cho 0");
					} else {
						System.out.println("Phuong trinh vo so nghiem");
						cont = true;
					}
				} else {
					System.out.println("Nghiem phuong trinh: " + (-b) / a);
					cont = true;
				}
			} catch (NumberException e) {
				e.printStackTrace();
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			}

		} while (cont == false);

	}
}
