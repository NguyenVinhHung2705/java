package thuchanh;

public class bai7 {
// Nguyễn Vĩnh Hưng 23Ct1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Các số thuận nghịch độc có 4 chữ số là: ");
		for(int i  = 1;i<10;i++) {
			System.out.println();
			for(int j = 0;j<10;j++) {
				int x = (i * 1000) + (j * 100) + (j * 10) + i;
				System.out.print(x + " ");
			}
		}
	}

}
