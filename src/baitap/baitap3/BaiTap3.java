package baitap.baitap3;

import java.util.Scanner;

import exception.AgeException;

public class BaiTap3 {
	public static boolean ngayHopLe(int ngay, int thang, int nam) {
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (0 < ngay && ngay <= 31)
				return true;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (0 < ngay && ngay <= 30)
				return true;
			break;
		case 2:
			if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0) && 0 < ngay && ngay <= 29)
				return true;
			else if (0 < ngay && ngay <= 28)
				return true;
			break;
		}
		return false;
	}

	static Scanner sc = new Scanner(System.in);

	public static int nhapSo() {
		return Integer.parseInt(sc.nextLine());
	}

	public static String nhapChuoi() {
		return sc.nextLine();
	}

	public static void main(String[] args) {
		System.out.print("Nhap ten: ");
		String ten = nhapChuoi();
		boolean check = true;
		do {
			try {
				System.out.print("Nhap ngay sinh: ");
				int ngay = nhapSo();
				System.out.print("Nhap thang sinh: ");
				int thang = nhapSo();
				System.out.print("Nhap nam sinh: ");
				int nam = nhapSo();
				if (!ngayHopLe(ngay, thang, nam) || nam >= 2005)
					throw new AgeException();
				else {
					System.out.println("Tên: " + ten + "\nNgày: " + ngay + "\nTháng: " + thang + "\nNăm: " + nam);
					check = false;
				}
			} catch (NumberFormatException e) {
				System.out.print("Nhap sai dinh dang so!");
			} catch (AgeException e) {
				System.out.println("Ngày tháng năm không hợp lệ!");
			}
		} while (check);
	}
}
