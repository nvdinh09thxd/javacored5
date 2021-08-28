package tan.bt4;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Bai4 tt=new Bai4();
		String chuoi = "";
		char kyTu;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi bất kỳ: ");
		chuoi = input.nextLine();
//		String[] is = chuoi.split(" ");
//		for (String string : is) {
//			System.out.print(string);
//		}
		tt.inChuoi(chuoi);
		
		tt.demTu(chuoi);
		tt.daoNguoc(chuoi);

	}
	public void inChuoi(String chuoi){
		System.out.println("in mỗi từ trên dòng: ");
		String[] list=chuoi.split("");
		for (int i = 0; i <= list.length-1; i++) {
			if(list[i].equals(" ")) {
				continue;
			}
			System.out.println(list[i]);
		}
	}
	public void demTu(String chuoi){
		System.out.println("số từ trong chuỗi: ");
		String[] list=chuoi.split("");
		System.out.println(list.length);
	}
	public void daoNguoc(String chuoi){
		System.out.println("chuỗi đảo ngược: ");
		String[] list=chuoi.split(" ");
		for (int i = list.length-1; i >=0; i--) {
			System.out.print(list[i]+" ");
		}
	}
}
