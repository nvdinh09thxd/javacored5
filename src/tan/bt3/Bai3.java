package tan.bt3;

import java.util.Calendar;
import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		String name;
		int day = 0;
		int month = 0;
		int year = 0;
		int age;
		Calendar cal = Calendar.getInstance();

		Scanner input = new Scanner(System.in);
		boolean cont = false;
		System.out.println("Nhập tên: ");
		name = input.nextLine();
		do {
			cont = false;
			do {
				cont = false;
				try {

					System.out.println("nhập ngày: ");
					day = Integer.parseInt(input.nextLine());
					if (day < 1 || day > 31) {
						throw new AgeException("vui lòng nhập ngày từ 1-> 31!");
					}
				} catch (NumberFormatException e) {
					System.out.println("vui lòng nhập định dạng là số!");
					cont = true;
				} catch (AgeException e) {
					System.out.println(e.getMessage());
					cont = true;
				}
			} while (cont);
			do {
				cont = false;
				try {
					System.out.println("nhập tháng: ");
					month = Integer.parseInt(input.nextLine());
					if (month < 1 || month > 12) {
						throw new AgeException("vui lòng nhập tháng từ 1->12");
					}

				} catch (NumberFormatException e) {
					System.out.println("vui lòng nhập định dạng là số!");
					cont = true;
				} catch (AgeException e) {
					System.out.println(e.getMessage());
					cont = true;
				}
			} while (cont);
			do {
				cont = false;
				try {

					System.out.println("Nhập năm: ");
					year = Integer.parseInt(input.nextLine());
					if (year <= 0) {
						throw new AgeException("Vui lòng nhập năm lớn hơn 0!");
					}
					if ((cal.get(Calendar.YEAR) - year) < 13) {
						throw new AgeException("Bạn chưa đủ tuổi phải từ 13 tuổi trở lên!!");
					}
				} catch (NumberFormatException e) {
					System.out.println("vui lòng nhập định dạng là số!");
					cont = true;
				} catch (AgeException e) {
					System.out.println(e.getMessage());
					cont = true;
				}
			} while (cont);

			try {
				switch (month) {
				case 4:
				case 6:
				case 9:
				case 11:
					if (day > 30) {
						throw new AgeException("Tháng này không quá 30 ngày");
					}
					break;
				case 2:
					if (!((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) && day > 28)) {// dk không năm nhuần
						throw new AgeException("Tháng này có không quá 28 ngày vì là đây là năm không nhuần");
					} else if (day > 29) {
						throw new AgeException("Tháng này có không quá 29 ngày vì là đây là năm nhuần");
					}
					break;
				}
			} catch (AgeException e) {
				System.out.println(e.getMessage());
				cont = true;
			}
		} while (cont);

		age = cal.get(Calendar.YEAR) - year;
		System.out.println("Tên: " + name);
		System.out.println("Ngày sinh:" + day);
		System.out.println("Tháng sinh:" + month);
		System.out.println("Năm sinh: " + year);
		System.out.println("Tuổi của bạn là:" + age);

	}

}
