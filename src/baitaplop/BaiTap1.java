package baitaplop;

import java.util.Scanner;

public class BaiTap1 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		String ten = sc.nextLine();
		boolean check = true;
		do {
			try {
				System.out.print("Nhap tuoi: ");
				int tuoi = Integer.parseInt(sc.nextLine());
				if (tuoi <= 0)
					throw new Exception("Vui long nhap tuoi lon hon 0!");
				System.out.println("Ten: " + ten);
				System.out.println("Tuoi: " + tuoi);
				check = false;
			} catch (NumberFormatException e) {
				System.err.println("Sai dinh dang so!");
				System.out.println();
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.out.println();
			}
		} while (check);
		sc.close();
	}

}
