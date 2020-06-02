package pk1;

import java.util.Scanner;

import exception.SoAmException;

public class Ex3 {
	public static void main(String[] args) {
		// Nhập vào tuổi, in ra tuổi đó, điều kiện là tuổi phải lớn hơn 0
		Scanner sc = new Scanner(System.in);
		int tuoi = 0;
		try {
			System.out.print("Nhap vao tuoi: ");
			tuoi = Integer.parseInt(sc.nextLine());
			if (tuoi <= 0) {
				throw new SoAmException("Tuổi phải lớn hơn 0");
			}
			System.out.println("Tuoi la: " + tuoi);
		} catch (NumberFormatException e) {
			System.out.println("Phải nhập vào số nguyên!");
		} catch (SoAmException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Khối lệnh sau try catch");
	}
}
