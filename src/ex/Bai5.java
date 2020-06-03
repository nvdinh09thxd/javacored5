package ex;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Bai5 tt = new Bai5();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một chuỗi: ");
		String n = sc.nextLine();
		String x = n.replace('e', '3');
		String y = x.replace('g', '9');
		System.out.println("chuỗi đảo ngược");
		tt.daoNguoc(y);

	}

	public void daoNguoc(String y) {
		System.out.println("chuỗi đảo ngược: ");
		String[] list = y.split(" ");
		for (int i = list.length - 1; i >= 0; i--) {
			System.out.println(" " + list[i]);
		}
	}

}
