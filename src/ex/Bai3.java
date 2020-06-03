package ex;

import java.util.Scanner;

public class Bai3 {
	public static void Nhap(String name, int age, int day, int month, int year) throws AgeException {
		age = 2020 - year;
		System.out.println("Tên: " + name);
		if (day < 1 || day > 31) {
			throw new AgeException("vui lòng nhập ngày từ 1-> 31!");
		} else {
			System.out.println("Ngày sinh:" + day);
		}

		if (month < 1 || month > 12) {
			throw new AgeException("vui lòng nhập tháng từ 1->12");
		} else {
			System.out.println("Tháng sinh:" + month);
		}

		if (age < 13) {
			throw new AgeException("Bạn chưa đủ tuổi yêu cầu tuổi phải lớn 12!");
		} else {

			System.out.println("Tuổi của bạn là:" + age);
		}

	}

	public static void main(String[] args) {
		String name = "";
		int age = 0;

		Scanner input = new Scanner(System.in);
		boolean cont = false;
		do {
			try {
				cont = false;
				System.out.println("Nhập tên: ");
				name = input.nextLine();

				System.out.println("nhập ngày: ");
				int day = Integer.parseInt(input.nextLine());

				System.out.println("nhập tháng: ");
				int month = Integer.parseInt(input.nextLine());

				System.out.println("Nhập năm: ");
				int year = Integer.parseInt(input.nextLine());
				Nhap(name, age, day, month, year);

			} catch (NumberFormatException e) {
				cont = true;
				System.out.println("vui lòng nhập định dạng là số!");
			} catch (AgeException e) {
				cont = true;
				System.out.println(e.getMessage());
			}

		} while (cont);

	}

}
