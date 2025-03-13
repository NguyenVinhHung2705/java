package thuchanh;
// Nguyễn Vĩnh Hưng
import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhập vào một số lớn hơn 1: ");
			n = s.nextInt();
		}while(n < 2);
		int x = 1;
		int y = 1;
		System.out.println(n + " số fibonacci đầu tiên là: ");
		System.out.print(x + " " + y + " ");
		for(int i = 2;i<n;i++) {
			int tmp = x + y;
			System.out.print(tmp + " ");
			x = y;
			y = tmp;
		}
		s.close();
	}
}
