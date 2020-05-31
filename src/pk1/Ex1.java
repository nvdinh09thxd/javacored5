package pk1;

public class Ex1 {
	public static void main(String[] args) {
		// lấy một số chia cho 1 số bất kỳ
		int n = 10;
		int k = 0;
		int ketQua = 0;
		try {// khoi ma chương trình có thể xảy ra ngoại lệ
				// nhưng nếu có ngoại lệ xảy ra, thì nó sẽ chạy đến khối catch để xử lý ngoại lệ
			ketQua = n / k;
			System.out.println("Kết quả: " + ketQua);
		} catch (Exception e) {
			/// đây là khối mà ta xử lý khi có ngoại lệ
			System.err.println("Co loi: " + e);
		}
		System.out.println("Khoi lệnh sau try catch");
	}
}
