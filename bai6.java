package thuchanh;

import java.util.Scanner;
// Nguyễn Vĩnh Hưng
public class bai6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập vào một số: ");
		int x = s.nextInt();
		double sum = 0;
		for(double i = 0;i<=x;i++) {
			if(i % 2 == 0) {
				sum += 1 * (1/(2 * i + 1));
			}else {
				sum += (-1) * (1/(2 * i + 1));
			}
		}
		System.out.println("Đáp án: " + sum);

	}

}
