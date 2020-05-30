package classes;

import java.util.Scanner;

public class lopMath {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao mot so: ");
		double x= Double.parseDouble(input.nextLine());
		System.out.println("So vua nhap: "+ x);
		System.out.println("Lam tron len: "+ Math.ceil(x));
		System.out.println("Lam tron xuong: "+ Math.floor(x));

	}

}
