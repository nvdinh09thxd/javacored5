package bai2;

import java.util.Scanner;

public class GiaiPhuongTrinh1 {
	public static void giaiPTB1(int a, int b) {
		if(a==0 && b==0) System.out.println("Phuong trinh vo so nghiem!");
		else if(a==0&&b!=0) System.out.println("Phuong tinh vo nghiem!");
		else {
			System.out.println("Phuong trinh co nghiem: "+(-b/a));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Nhap he so a: ");
			int a = Integer.parseInt(sc.nextLine());
			System.out.println("Nhap he so b: ");
			int b = Integer.parseInt(sc.nextLine());
			giaiPTB1(a, b);
		}catch(NumberFormatException e) {
			System.out.println("Nhap sai dinh dang so!");
		}
	}

}
