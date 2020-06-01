package baitap.baitap5;

import java.util.Scanner;

public class BaiTap5 {
	public static String nhapChuoi() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập một chuỗi: ");
		return sc.nextLine();
	}

	public static String thayThe(String str) {
		return str.replace('e', '3').replace('g', '9');
	}

	public static String daoNguocChuoi(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String chuoi = nhapChuoi();
		System.out.println("Chuỗi nhập vào là: " + chuoi);
		System.out.println("Chuỗi sau khi thay thế là: " + thayThe(chuoi));
		System.out.println("Chuỗi đảo ngược là: " + daoNguocChuoi(thayThe(chuoi)));
	}
}