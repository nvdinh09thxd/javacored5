package baitap.baitap4;

import java.util.Scanner;

public class BaiTap4 {
	public static void displayStr(String str) {
		String arrStr[];
		arrStr = str.split(" ");
		for (int i = 0; i <= arrStr.length-1; i++) {
			System.out.println(arrStr[i]);
		}
	}

	public static int demSoTu(String str) {
		String arrStr[];
		arrStr = str.split(" ");
		return arrStr.length;
	}

	public static void inChuoiDaoNguoc(String str) {
		String arrStr[] = str.split(" ");
		for (int i = arrStr.length - 1; i >= 0; i--) {
			System.out.print(arrStr[i] + " ");
		}
	}

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		str = sc.nextLine();
		System.out.println("In mỗi từ trên một dòng");
		displayStr(str);
		System.out.println("Số từ trong chuối là: " + demSoTu(str));
		System.out.println("In ra chuỗi đảo ngược");
		inChuoiDaoNguoc(str);
	}

}
