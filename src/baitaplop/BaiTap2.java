package baitaplop;

import java.util.Scanner;

import exception.SoTu2_8Exception;

public class BaiTap2 {

	public static void main(String[] args) {
		// Nhap mot so tu 2 - 8, in ra thu tuong ung
		// n nhap vao phai la so trong khoang 2- 8, nhap lai cho den khi nhap dung
		Scanner sc = new Scanner(System.in);
		int n;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập một số: ");
				n = Integer.parseInt(sc.nextLine());
				sc.close();
				if (n < 2 || n > 8) {
					throw new SoTu2_8Exception("Phải nhập số từ 2 đến 8");
				}
				check = false;
				switch (n) {
				case 2:
					System.out.println("Hôm nay là thứ hai");
					break;
				case 3:
					System.out.println("Hôm nay là thứ ba");
					break;
				case 4:
					System.out.println("Hôm nay là thứ tư");
					break;
				case 5:
					System.out.println("Hôm nay là thứ năm");
					break;
				case 6:
					System.out.println("Hôm nay là thứ sáu");
					break;
				case 7:
					System.out.println("Hôm nay là thứ bảy");
					break;
				default:
					System.out.println("Hôm nay là chủ nhật");
					break;

				}
			} catch (NumberFormatException e) {
				System.err.println("Vui lòng nhập vào một số nguyên!");
				System.out.println();
			} catch (SoTu2_8Exception e) {
				System.err.println(e.getMessage());
				System.out.println();
			}

		} while (check);
	}
}
